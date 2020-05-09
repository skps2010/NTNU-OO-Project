public class Regular extends Customer {

    public Regular(String n, Store s) {
        super(n, s);
    }

    @Override
    public int createRental(int day) {
        if (r.nextDouble() < 0.5 || store.videos.isEmpty() || canRent() == 0)
            return 0;
        int amount = Math.min(canRent(), Math.min(store.videos.size(), r.nextInt(3) + 1));
        return putRental(day, r.nextInt(3) + 3, amount);
    }
}