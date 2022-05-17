package org.epam.BDD_HT.properties.generator;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class timeGenerator {
    public static int generateRandomTime(){
        Random random = new Random();
        return random.nextInt(5 - 1) + 1;
    }

    public static void sleep() throws InterruptedException {
        TimeUnit.SECONDS.sleep(generateRandomTime());
    }
}
