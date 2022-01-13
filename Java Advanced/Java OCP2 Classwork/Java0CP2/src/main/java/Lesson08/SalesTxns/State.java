package Lesson8.SalesTxns;

/**
 *
 * @author Mano
 */
public enum State {    
    CA("CA"),
    CO("CO"),
    MA("MA");
    
    private final String str;
    
    State(String stateStr){
        this.str = stateStr;
    }
    
    public String getStr(){
        return str;
    }        
   
}
