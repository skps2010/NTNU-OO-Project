public class Rental {
    Video videos[];
    int time;
    int start;
    Customer owner;

    public Rental(int s, int d, Customer o, Video... v) {
        start = s;
        time = d;
        videos = v;
        owner = o;

        if (v.length > 3)
            System.out.println("影片數應為三以下");
    }

    public int totalePrice() {
        int sum = 0;
        for (Video v : videos)
            sum += v.price;

        return sum * time;
    }

    public int compareTo(Rental r) {
        return start + time - (r.start + r.time);
    }

    public String toString() {
        String ret = String.format("%s 在\t第%d天 花了\t%d元 租了為期\t%d天 的影片：「", owner, start, totalePrice(), time);
        for (int i = 0; i < videos.length; i++)
            ret += videos[i] + (i == videos.length - 1 ? "" : "、");
        return ret + "」";
    }
}