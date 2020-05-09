public class Breezy extends Customer {

    public Breezy(String n, Store s) {
        super(n, s);
    }

    @Override
    public int createRental(int day) {
        if (r.nextDouble() < 0.5 || store.videos.isEmpty() || canRent() == 0)
            return 0;
        int amount = Math.min(canRent(), Math.min(store.videos.size(), r.nextInt(2) + 1));
        return putRental(day, r.nextInt(2) + 1, amount);
    }

}