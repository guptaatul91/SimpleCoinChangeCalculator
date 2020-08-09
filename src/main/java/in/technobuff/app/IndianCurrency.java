package in.technobuff.app;

public class IndianCurrency extends AbstractCurrency {
    public IndianCurrency() {
        coins.add(new Coin("rupees",100));
        coins.add(new Coin("50 paisas",50));
        coins.add(new Coin("25 paisas",25));
        coins.add(new Coin("10 paisas",10));
        coins.add(new Coin("paisas",1)) ;
    }
    
}
