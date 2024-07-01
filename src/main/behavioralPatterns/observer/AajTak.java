package main.behavioralPatterns.observer;

public class AajTak implements Observer {
    private static final String CHANNEL = "AajTak";
    private String news;

    private void displayNews() {
        System.out.println("Live on " + CHANNEL + ", Breaking News: " + news);
    }

    @Override
    public void update(String news) {
        this.news = news;
        displayNews();
    }
}
