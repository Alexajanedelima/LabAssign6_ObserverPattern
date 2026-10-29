public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber() {
            public void update(String news) {
                System.out.println("Subscriber 1 received: " + news);
            }
        };

        Subscriber subscriber2 = new Subscriber() {
            public void update(String news) {
                System.out.println("Subscriber 2 received: " + news);
            }
        };

        Subscriber subscriber3 = new Subscriber() {
            public void update(String news) {
                System.out.println("Subscriber 3 received: " + news);
            }
        };

        agency.subscribe(subscriber1);
        agency.subscribe(subscriber2);
        agency.subscribe(subscriber3);

        agency.publishNews("A new technology has been announced!");

        agency.unsubscribe(subscriber2);

        agency.publishNews("Breaking: A major event is happening!");

    }
}