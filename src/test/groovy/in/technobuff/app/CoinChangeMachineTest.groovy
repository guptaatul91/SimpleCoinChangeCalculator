package in.technobuff.app

import spock.lang.Specification

class CoinChangeMachineTest extends Specification {
    def coinChangeMachine = new CoinChangeMachine();

    def "Check set Currency"(def a, def b) {
    expect:
        coinChangeMachine.setCurrency(a) == b

        where:
        a | b 
        "USD" | true 
        "usd" | false 
        "INR" | true 
        "EURO" | true
    }

    def "Calculate Coin Changes for Indian Currency"() { 
        setup: 
        coinChangeMachine.setCurrency("INR") ;
        when:  
            def result = coinChangeMachine.calculateChange(287)
        then:  
            result == [new CoinChange("rupees", 2), new CoinChange("50 paisas" ,1), new CoinChange("25 paisas" ,1), new CoinChange("10 paisas" ,1), new CoinChange("paisas",2)]
    }  
    def "Calculate Coin Changes for USD Currency"() {  
        setup:
        coinChangeMachine.setCurrency("USD") ;
        when:  
        def result = coinChangeMachine.calculateChange(287)
        then:  
        result == [new CoinChange("dollars", 2), new CoinChange("quarters" ,3), new CoinChange("dimes" ,1), new CoinChange("pennies" ,2)] 
     }  
    def "Calculate Coin Changes for Euro Currency"() {  
        setup:
        coinChangeMachine.setCurrency("EURO") ;
    
        when:  
        def result = coinChangeMachine.calculateChange(287)
        then:  
        result == [new CoinChange("euros", 2), new CoinChange("50c" ,1), new CoinChange("20c" ,1), new CoinChange("10c" ,1), new CoinChange("5c",1),new CoinChange("1c",2)] 
     } 
}