package modulo7.test;

import modulo7.PlayingCard;
import modulo7.Suit;
import static modulo7.Suit.*;

/**
 *
 * @author Roberto Olveras
 */
public class TestPlayingCard {
    public static void main(String[] args) {
        //Suit s = new Suit();
        Suit trebol = CLUBS;
        Suit diamantes = DIAMONDS;
        PlayingCard c1 = new PlayingCard(6,trebol);
        PlayingCard c3 = new PlayingCard(6,Suit.HEARDS);
        System.out.println(c1);
    }
}
