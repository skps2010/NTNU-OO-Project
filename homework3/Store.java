import java.util.LinkedList;
import java.util.Random;

public class Store {
    LinkedList<Video> videos = new LinkedList<Video>();
    Customer customers[] = new Customer[10];
    final String videoNames[] = { "帝國崛起", "創世紀", "紅色警戒", "天外奇蹟", "鼠王", "全面啟動", "失速列車", "蟻人", "返校", "花木蘭", "蘋果", "溫泉戰役",
            "讓子彈飛", "邁向共和", "我不是藥神", "迷宮", "嚴冬", "飢餓遊戲", "戰爭與和平", "我的奮鬥" };
    final String customerNames[] = { "耶和華", "霍去病", "諸葛亮", "雅博拉罕", "陳吉思涵", "雅莉姍大", "凱薩大帝", "索羅門", "威爾遜", "毛澤東" };
    Random r = new Random();
    LinkedList<Rental> rentalRecord = new LinkedList<Rental>();
    int earning = 0;

    public Store() {
        for (int i = 0; i < 20; i++) {
            videos.add(new Video(videoNames[i]));
        }
        for (int i = 0; i < 10; i++) {
            switch (r.nextInt(3)) {
                case 0:
                    customers[i] = new Breezy(customerNames[i], this);
                    break;
                case 1:
                    customers[i] = new Hoarder(customerNames[i], this);
                    break;
                case 2:
                    customers[i] = new Regular(customerNames[i], this);
                    break;
            }

        }
    }

    public void everyday(int day) {
        for (Customer c : customers)
            earning += c.createRental(day);
        for (Customer c : customers)
            c.returnRental(day, videos);
    }

    public void report() {
        System.out.print("店裡目前有" + videos.size() + "支影片：「");
        for (int i = 0; i < videos.size(); i++)
            System.out.print(videos.get(i) + (i == videos.size() - 1 ? "" : "、"));
        System.out.println("」");

        System.out.println("目前賺了：" + earning);

        System.out.println("已完成的租約：");
        for (Rental r : rentalRecord)
            System.out.println(r);
        System.out.println("");

        System.out.println("還未結束的租約：");
        for (Customer c : customers)
            for (Rental r : c.rentals)
                System.out.println(r);
        System.out.println("");
    }
}