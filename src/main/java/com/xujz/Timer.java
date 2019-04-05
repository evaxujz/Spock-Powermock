package com.xujz;

public class Timer {
    public static long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public int transferToSeconds(int hours, int minutes, int seconds) {
        return calculateSeconds(hours, minutes, seconds);
    }

    private int calculateSeconds(int hours, int minutes, int seconds) {
        return 3600 * hours + 60 * minutes + seconds;
    }
}
