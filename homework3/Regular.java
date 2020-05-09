import java.util.LinkedList;

public class Regular extends Customer {

    public Regular(String n) {
        super(n);
    }

    @Override
    public int createRental(int day, LinkedList<Video> videos) {
        if (r.nextDouble() < 0.5 || videos.isEmpty() || canRent() == 0)
            return 0;
        int amount = Math.min(canRent(), Math.min(videos.size(), r.nextInt(3) + 1));
        return putRental(day, r.nextInt(3) + 3, amount, videos);
    }
}