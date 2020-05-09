
public class Main {
    public static void main(String args[]) {
        Store store = new Store();

        for (int day = 1; day <= 35; day++) {
            store.everyday(day);
        }
        store.report();
    }
}
