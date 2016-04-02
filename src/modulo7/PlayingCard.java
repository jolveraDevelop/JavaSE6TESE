
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class PlayingCard {

    private int rank;
    private Suit suit;

    public PlayingCard(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Carta: "+rank + " de "+suit.getName() + " ";
    }
}
