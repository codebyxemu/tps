package me.xemu.restrictmobsonlowtps;

public class Lag implements Runnable {
    private RestrictMobsOnLowTPS plugin;
    private double tps = 0;
    long sec;
    long currentSec;
    int ticks;

    public Lag(RestrictMobsOnLowTPS plugin) {
        this.plugin = plugin;
    }

    public double getTPS()
    {
        return this.tps + 2;
    }

    @Override
    public void run() {
        sec = (System.currentTimeMillis() / 1000);

        if (currentSec == sec) {
            ticks++;
        } else {
            currentSec = sec;
            tps = (tps == 0 ? ticks : ((tps + ticks) / 2));
            ticks = 0;
        }
        System.out.println("TPS: " + tps);
    }
}