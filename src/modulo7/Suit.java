
package modulo7;
public enum Suit {
    HEARDS ("Corazones"),
    DIAMONDS ("Diamantes"),
    CLUBS ("Treboles"),
    SPADES ("Espadas");
    
    private final String name;
    
    private Suit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
