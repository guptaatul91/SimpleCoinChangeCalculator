package in.technobuff.app;
import java.util.Map ;
import java.util.HashMap ;
import java.util.List ;

public final class CoinChangeMachine {
    private final Map<String,CoinChangeProcessor> supportedCurrency = new HashMap<>() ;
    private final String defaultCurrency = "INR" ;
    private CoinChangeProcessor selectedCoinChangeProcessor  ;
    
    public CoinChangeMachine() {
        supportedCurrency.put("INR",new CoinChangeProcessor(new IndianCurrency())) ;
        supportedCurrency.put("EURO",new CoinChangeProcessor(new EuroCurrency())) ;
        supportedCurrency.put("USD",new CoinChangeProcessor(new UsCurrency()));  
        
    }

    public boolean installCurrency(String currencyCode,AbstractCurrency currency){
        //TODO: check if already install 
        if(supportedCurrency.containsKey(currencyCode)) {
            System.out.println("Already Setup "+currencyCode);
            return false ;
        }

        supportedCurrency.put(currencyCode,new CoinChangeProcessor(currency));
        return true ;
    }

    public boolean setCurrency(String currencyCode) {
        if(!supportedCurrency.containsKey(currencyCode)) {
            System.out.println("Setup this currency first "+currencyCode);
            return false ;
        }
        selectedCoinChangeProcessor =  supportedCurrency.get(currencyCode) ;
        return true ;
    }

    public List<CoinChange> calculateChange(double n){
        if(selectedCoinChangeProcessor ==null ){
            setCurrency(defaultCurrency) ;
        }

       return selectedCoinChangeProcessor.calculateChange(n) ;
    }

}

