package main.behavioralPatterns.observer;

public class IndiaTV implements Observer {
    private static final String CHANNEL = "IndiaTV";
    private String news;

    private void displayNews() {
        System.out.println("Watch latest news on " + CHANNEL +": " + news);
    }

    @Override
    public void update(String news) {
        this.news = news;
        displayNews();
    }
}
