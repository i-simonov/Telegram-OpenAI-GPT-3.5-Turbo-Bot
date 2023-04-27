package telegrambotopenai03;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.completion.chat.ChatCompletionChoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class OpenAiApiCompletion {
    private static final String TOKEN = "<YOUR OpenAI Token>";
    private static final String MODEL = "gpt-3.5-turbo";

    public static String main(String prompt) {
        OpenAiService service = new OpenAiService(TOKEN);

        List<ChatMessage> messages = new ArrayList<>();
        ChatMessage systemMessage = new ChatMessage(ChatMessageRole.SYSTEM.value(), prompt);
        messages.add(systemMessage);

        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
                .builder()
                .model(MODEL)
                .messages(messages)
                .n(1)
                //.maxTokens(1)
                .logitBias(new HashMap<>())
                .build();

        StringBuilder response = new StringBuilder();

        service.streamChatCompletion(chatCompletionRequest)
                .blockingSubscribe(
                        data -> {
                            List<ChatCompletionChoice> choices = data.getChoices();
                            if (!choices.isEmpty()) {
                                String content = choices.get(0).getMessage().getContent();
                                if (content != null) {
                                    response.append(content);
                                }
                            }
                        },
                        error -> {
                            response.append("Error: ").append(error.getMessage());
                            error.printStackTrace();
                        }
                );

        return response.toString();
    }
}
