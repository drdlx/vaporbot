import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by drdlx on 12.10.2017.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("It works!");

        //Initialize Api Context
        ApiContextInitializer.init();

        //Instantiate Telegram Bots API
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        //TODO Register our bot
        try {
            telegramBotsApi.registerBot(new VaporBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
