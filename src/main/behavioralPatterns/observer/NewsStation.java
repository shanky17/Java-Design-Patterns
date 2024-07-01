package main.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
