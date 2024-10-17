import java.util.ArrayList;
import java.util.List;

// Define an interface for subscribers
interface Subscriber {
    void update(String news);
}

// Class representing the news station
class NewsStation {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    // Method to add a new subscriber
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Method to notify all subscribers about the latest news
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    // Method to set the latest news and notify subscribers
    public void setNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}

// Class representing a news subscriber
class NewsSubscriber implements Subscriber {
    private String name;

    // Constructor to set the subscriber's name
    public NewsSubscriber(String name) {
        this.name = name;
    }

    // Method to update the subscriber with the latest news
    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        // Create a news station
        NewsStation newsStation = new NewsStation();
        // Create two subscribers
        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        // Add subscribers to the news station
        newsStation.addSubscriber(subscriber1);
        newsStation.addSubscriber(subscriber2);

        // Set the latest news, which notifies subscribers
        newsStation.setNews("Breaking News!");
    }
}
