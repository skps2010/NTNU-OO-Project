public enum Category {
    NewRelease(10), Frama(8), Romance(6), Horror(4), Comedy(2);

    int price;

    Category(int p) {
        price = p;
    }
}