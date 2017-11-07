package com.vaporbot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by drdlx on 12.10.2017.
 * main class of the whole 'bot' thing
 *
 */

public final class Main {
    /**
     *
     * @param args gets arguments when you run a bot
     * @throws Exception usual exceptions and stuff
     */

    public static void main(final String[] args) throws Exception {

        //Initialize Api Context
        ApiContextInitializer.init();

        //Instantiate Telegram Bots API
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new VaporBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    /**
     * Constructor that does absolutely nothing
     */
    private Main() {

    }
}
