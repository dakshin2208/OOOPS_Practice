package Teams.day6;

public class OnlineStoreMain {
    public static void main(String[] args) {

        OnlineStore laptop = new OnlineStore(1000.0);
        OnlineStore tab = new OnlineStore(500.0);

        laptop.sell(2);
        tab.sell(5);

        System.out.println("total items sold " + OnlineStore.getSold() );
        System.out.println("total revenue :" + OnlineStore.getRevenue()  );


    }
}


