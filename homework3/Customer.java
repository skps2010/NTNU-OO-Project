import java.util.Random;
import java.util.LinkedList;

public abstract class Customer {
    String name;
    LinkedList<Rental> rentals = new LinkedList<Rental>();
    Random r = new Random();
    Store store;

    public Customer(String n, Store s) {
        name = n;
        store = s;
    }

    abstract public int createRental(int day);

    protected int putRental(int day, int time, int count) {
        Video v[] = new Video[count];
        for (int i = 0; i < count; i++) {
            int index = r.nextInt(store.videos.size());
            v[i] = store.videos.get(index);
            store.videos.remove(index);
        }

        Rental r = new Rental(day, time, this, v);
        rentals.add(r);
        rentals.sort((a, b) -> a.compareTo(b));
        return r.totalePrice();
    }

    public void returnRental(int day, LinkedList<Video> videos) {
        while (!rentals.isEmpty()) {
            Rental first = rentals.getFirst();
            if (first.start + first.time <= day) {
                rentals.removeFirst();
                for (Video v : first.videos)
                    videos.add(v);

                store.rentalRecord.add(first);
            } else
                break;

        }
    }

    protected int canRent() {
        int sum = 0;
        for (Rental r : rentals)
            sum += r.videos.length;
        return 3 - sum;
    }

    public String toString() {
        return name;
    }
}