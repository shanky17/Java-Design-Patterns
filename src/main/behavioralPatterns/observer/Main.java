package main.behavioralPatterns.observer;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        AajTak channel1 = new AajTak();
        IndiaTV channel2 = new IndiaTV();

        newsStation.addObserver(channel1);
        newsStation.addObserver(channel2);

        newsStation.setNews("India wins the T20 world cup after 17 long years");
        newsStation.removeObserver(channel2);
        newsStation.setNews("Hot Debate between Trump and Biden!");
    }
}
