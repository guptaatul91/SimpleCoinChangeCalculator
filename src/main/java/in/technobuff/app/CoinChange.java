package in.technobuff.app;
class CoinChange { 
    private String label  ;
    private int value ;
    public CoinChange(String label,int value) {
        this.label  =  label  ;
        this.value  = value ;
    }

    public String getLabel(){
        return this.label ;
    }
    public int getValue(){
        return this.value ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false ;
        }
        CoinChange coinChange =  (CoinChange) obj ;
        String label = coinChange.getLabel() ;
        int value =  coinChange.getValue() ;
        
        return this.label.equals(label) && this.value == value;
    }

    @Override
    public String toString() {
            return  this.label+" "+value ;
    }
}