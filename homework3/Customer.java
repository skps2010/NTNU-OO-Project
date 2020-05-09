import java.util.Random;
import java.util.LinkedList;

public abstract class Customer {
    String name;
    LinkedList<Rental> rentals = new LinkedList<Rental>();
    Random r = new Random();
    final static String names[] = { "", "" };

    public Customer(String n) {
        name = n;
    }

    abstract public int createRental(int day, LinkedList<Video> videos);

    protected int putRental(int day, int time, int count, LinkedList<Video> videos) {
        Video v[] = new Video[count];
        for (int i = 0; i < count; i++) {
            int index = r.nextInt(videos.size());
            v[i] = videos.get(index);
            videos.remove(index);
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

                Store.rentalRecord.add(first);
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