package exercises.ch05.ex13;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Logger;

public class LogWithBadWordFilter {
    public static void main(String[] args) {
        new LogWithBadWordFilter().launch();
    }

    private void launch() {
        List<String> badWordList = Arrays.asList("bum", "fart", "underpants", "poop");
        Filter nice = log -> badWordList
                .stream()
                .noneMatch(log.getMessage()::contains);
        Filter naughty = log -> badWordList
                .stream()
                .anyMatch(log.getMessage()::contains);
        Random random = new Random();
        Filter[] filters = {nice, naughty};
        filteredlog(filters[random.nextInt(2)]);
    }

    public void filteredlog(Filter filter) {
        Logger logger = Logger.getLogger("naughtyOrNice");
        FileHandler handler = null;
        try {
            handler = new FileHandler();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(handler);
        logger.setFilter(filter);
        logger.info("A simple logger test message");
        logger.info("A rude - bum! - logger test message");
        logger.info("How big are your trousers?");
        logger.info("Extraordinary underpants!");
        logger.info("Have you farted?");
        logger.info("Ooh look - a potato");
        logger.info("Ooh nice pants");
        logger.info("What a nincompoop!");
    }
}