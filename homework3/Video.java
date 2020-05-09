import java.util.Random;

public class Video {
    Category category;
    int price;
    String name;
    Random r = new Random();

    public Video(String n) {
        Category list[] = Category.values();
        category = list[r.nextInt(list.length)];

        name = n;

        price = (int) (category.price * (r.nextDouble() + 0.5));
    }

    public String toString() {
        return name;
    }
}