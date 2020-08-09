package in.technobuff.app;

public class UsCurrency extends AbstractCurrency {

    public UsCurrency(){
        coins.add(new Coin("dollars",100));
        coins.add(new Coin("quarters",25));
        coins.add(new Coin("dimes",10));
        coins.add(new Coin("nickels",5));
        coins.add(new Coin("pennies",1));
    }
    
}
