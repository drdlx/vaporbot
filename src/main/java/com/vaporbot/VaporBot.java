package com.vaporbot;
/**
 * Created by drdlx on 16.10.2017.
 * Main bot class
 */

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * main class
 */
public class VaporBot extends TelegramLongPollingBot {
    /**
     * Сommand that reacts to the command from th user.
     * @param update is the object that contains a message from user
     */
    public void onUpdateReceived(final Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chatId)
                    .setText(messageText); //that's where the message goes in
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace(); //TODO make some kind of error message
            }
        }
    }

    /**
     * retuns bot's name
     * @return retuns bot's name
     */
    public String getBotUsername() {
        //Returns bot's name
        return "VaporBot";
    }

    /**
     * returns bot's token
     * @return returns bot's token
     */
    public String getBotToken() {
        //Returns bot's token from @BotFather
        return "244243962:AAFjR-jnmvnx1nki0M61sfANtu5Bh_Kng0U";
    }
}
