# Telegram-OpenAI-GPT-3.5-Turbo-Bot
A Telegram bot that utilizes the OpenAI GPT-3.5 Turbo API to provide smart and contextual responses to user messages.

# Description

This repository contains the source code for a Telegram bot that integrates with the OpenAI GPT-3.5 Turbo API to provide intelligent responses based on user input. The bot listens for incoming messages, processes them using the GPT-3.5 Turbo model, and sends back generated responses to the users.

The project is divided into three main parts:

App.java: The main class that initializes and registers the Telegram bot.
OpenAiApiCompletion.java: A helper class that handles interactions with the OpenAI API.
TelegramBot1CDescrBot.java: The implementation of the Telegram bot that receives updates, processes messages, and sends responses using the GPT-3.5 Turbo API.
Usage

Clone the repository to your local machine.
Replace <YOUR OpenAI Token> in OpenAiApiCompletion.java with your OpenAI API token.
Replace <Your bot username> and <Your bot token> in TelegramBot1CDescrBot.java with your Telegram bot's username and token.
Compile and run the project.
Once the bot is running, you can interact with it via Telegram by sending messages. The bot will use the GPT-3.5 Turbo API to generate context-aware responses based on your input.

# Requirements

Java Development Kit (JDK) 8 or higher
An OpenAI API key
A Telegram bot token and username

# Dependencies

TelegramBots Java library
Theo Kanning's OpenAI Java SDK
  
Setup Instructions

# Follow these steps to set up the Telegram OpenAI GPT-3.5 Turbo Bot:

Step 1: Install JDK and Set Up the Environment
1. Install the Java Development Kit (JDK) 8 or higher on your system. You can download it from the official Oracle website or use the OpenJDK available at AdoptOpenJDK.
2. -Set up the JAVA_HOME environment variable to point to the JDK installation directory.

Step 2: Create a Telegram Bot
1. Open the Telegram app and search for the "BotFather" bot.
2. Start a chat with BotFather and send the /newbot command.
3. Follow the instructions provided by BotFather to create your new bot.
4. Once the bot is created, BotFather will provide you with a bot token. Save this token for later use.

Step 3: Get an OpenAI API Key
1. Sign up for an account at OpenAI if you don't have one already.
2. Apply for API access if you haven't done so already.
3. Once you have access, go to the API Keys section and copy your API key.

Step 4: Clone and Configure the Repository
1. Clone the repository to your local machine using git clone https://github.com/yourusername/telegram-openai-gpt-3.5-turbo-bot.git.
2. Open the project in your favorite IDE or text editor.
3. Replace <YOUR OpenAI Token> in OpenAiApiCompletion.java with your OpenAI API token.
4. Replace <Your bot username> and <Your bot token> in TelegramBot1CDescrBot.java with your Telegram bot's username and token.

Step 5: Build and Run the Project
1. Compile the project using your IDE's build command or run javac from the command line.
2. Run the compiled App.class file using your IDE or the java command.
3. Once the bot is running, you can interact with it via Telegram by sending messages. The bot will use the GPT-3.5 Turbo API to generate context-aware responses based on your input.
  
# Troubleshooting and FAQ

If you encounter issues during setup or while using the bot, refer to the following troubleshooting tips and frequently asked questions.

Bot not responding to messages
Make sure your bot token and username in TelegramBot1CDescrBot.java are correct. Double-check with the credentials provided by BotFather.
Ensure your OpenAI API key in OpenAiApiCompletion.java is valid and has not expired.
Verify that your internet connection is stable and that the bot has access to the Telegram and OpenAI API endpoints.
How to customize the bot's prompt
In TelegramBot1CDescrBot.java, you can modify the prepromt variable to change the prompt sent to the GPT-3.5 Turbo API. This prompt will be prepended to the user's message and helps guide the context of the API's response.

Can I use a different GPT model?
Yes, you can use a different GPT model. To do this, change the MODEL variable in OpenAiApiCompletion.java to the desired model name. Be aware that using different models may require adjustments to other parameters, such as maxTokens.

How to deploy the bot to a server?
To deploy the bot to a server, follow these steps:

Set up a server with Java 8 or higher installed.
Copy the compiled project files to the server.
Set up environment variables for the OpenAI API key, Telegram bot token, and bot username on the server.
Modify the project source code to use the environment variables instead of hardcoded values.
Start the bot on the server using the java command.

How can I add more features or commands to the bot?
To add more features or commands, modify the onUpdateReceived method in TelegramBot1CDescrBot.java. You can add conditional statements based on the user's input to handle different commands or features. Make sure to also adjust the prompt sent to the GPT-3.5 Turbo API accordingly.

# Contributing

I welcome contributions to improve and extend the Telegram OpenAI GPT-3.5 Turbo Bot. If you would like to contribute, please create a fork of the repository, make your changes, and submit a pull request. I will review your changes and merge them if they meet our standards and requirements.
  
# License

The Telegram OpenAI GPT-3.5 Turbo Bot is released under the MIT License. By using this project, you agree to the terms and conditions specified in the license.

# Support and Community

If you have any questions, suggestions, or require support, feel free to open an issue in the repository. I encourage users to share their experiences, best practices, and collaborate on improving the bot.

# Acknowledgements

This project is built using the following libraries and resources:

TelegramBots Java library by Rubenlagus
Theo Kanning's OpenAI Java SDK by Theo Kanning
OpenAI GPT-3.5 Turbo by OpenAI
We appreciate the efforts of the developers and organizations behind these tools and resources. Their work has made it possible for us to create this Telegram bot.

# Future Enhancements

Me aim to continuously improve the Telegram OpenAI GPT-3.5 Turbo Bot with new features, optimizations, and bug fixes. Some potential enhancements we are considering include:

Adding a user-friendly interface for customizing the bot's prompt and model parameters.
Implementing a caching mechanism to store and reuse generated responses for common queries.
Supporting additional languages and GPT models.
Enhancing error handling and logging for better debugging and issue resolution.
I welcome feedback and suggestions from the community to help shape the future development of this project.
