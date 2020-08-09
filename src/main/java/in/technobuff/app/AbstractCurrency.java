package in.technobuff.app;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCurrency {

    final public List<Coin> coins =  new ArrayList<Coin>();

    public List<CoinChange> calculateChange(double n) {
        List<CoinChange>  changes = new ArrayList<>();
        for(int index = 0 ; index<coins.size();index++) {
            Coin coin =  coins.get(index) ;
            int denomValue = coin.getValue();
            int count = (int) (n / denomValue);
            if(count !=0){
                n -= denomValue * count;
                changes.add(new CoinChange(coin.getLabel(),count)) ;
                System.out.println(count+ " " + coin.getLabel());
            }
        }
        return changes ;
    }
}


