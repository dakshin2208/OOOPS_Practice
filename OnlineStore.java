package Teams.day6;

public class OnlineStore {
    private static int sold = 0;
    private static double revenue = 0.0;
    private double price;

    public OnlineStore(double price){
        this.price =price;
    }

    public void sell(int quantity){
        sold += quantity;
        revenue += quantity * price;
    }
    public static int getSold(){
        return sold;
    }

    public static double getRevenue(){
        return revenue;
    }
}
