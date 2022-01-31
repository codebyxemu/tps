package me.xemu.restrictmobsonlowtps;

public class Utils {

    private static Lag lag;
    public Utils(Lag lag) {
        Utils.lag = lag;
    }

    public static double getTps() {
        return lag.getTPS();
    }

}
