package telegrambotopenai03;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot1CDescrBot extends TelegramLongPollingBot {
    
    private static final String BOT_USERNAME = "<Your bot username>";
    private static final String BOT_TOKEN = "<Your bot token>";
    private final String prepromt = "<>"; //that string will be infront of promt from bot. For example: "make a comments for the next program code":

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage();
                    
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText("Got the request. Wait....");

            try {
                execute(message);

                String promt    = this.prepromt+update.getMessage().getText();
                String answer   = OpenAiApiCompletion.main(promt);
                message.setText(answer);

                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

}