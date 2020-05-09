import java.util.LinkedList;

public class Hoarder extends Customer {
    public Hoarder(String n) {
        super(n);
    }

    @Override
    public int createRental(int day, LinkedList<Video> videos) {
        if (r.nextDouble() < 0.5 || videos.size() < 3 || canRent() < 3)
            return 0;
        return putRental(day, 7, 3, videos);
    }
}