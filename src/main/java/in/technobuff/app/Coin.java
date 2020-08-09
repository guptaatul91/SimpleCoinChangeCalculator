package in.technobuff.app;

public class Coin { 
    private String label  ;
    private int value ;
    public Coin(String label,int value) {
        this.label  =  label  ;
        this.value  = value ;
    }

    public String getLabel(){
        return this.label ;
    }
    public int getValue(){
        return this.value ;
    }
}