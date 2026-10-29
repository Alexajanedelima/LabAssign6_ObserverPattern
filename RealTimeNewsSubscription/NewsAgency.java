import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed.");
    }

    public void publishNews(String news) {
        System.out.println("\nBreaking News: " + news);

        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}