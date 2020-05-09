public class Hoarder extends Customer {
    
    public Hoarder(String n, Store s) {
        super(n, s);
    }

    @Override
    public int createRental(int day) {
        if (r.nextDouble() < 0.5 || store.videos.size() < 3 || canRent() < 3)
            return 0;
        return putRental(day, 7, 3);
    }
}