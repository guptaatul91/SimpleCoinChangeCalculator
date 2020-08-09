package in.technobuff.app;

public class EuroCurrency extends AbstractCurrency {
    public EuroCurrency() {
        coins.add(new Coin("euros",100));
        coins.add(new Coin("50c",50));
        coins.add(new Coin("20c",20));
        coins.add(new Coin("10c",10));
        coins.add(new Coin("5c",5)) ;
        coins.add(new Coin("1c",1)) ;
    }
    
}
