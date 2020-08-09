package in.technobuff.app;
import java.util.List;
public class CoinChangeProcessor {
    private AbstractCurrency currencyChanger ;
    CoinChangeProcessor(AbstractCurrency currencyChanger){
        this.currencyChanger =currencyChanger ;
    }

    public List<CoinChange> calculateChange(double n) {
        return currencyChanger.calculateChange(n);
    }
}
