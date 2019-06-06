package game.cards;

import java.util.ArrayList;
import java.util.Collections;
public class Deck{
    private ArrayList<Card> cards = new ArrayList<Card>();

    public ArrayList<Card> getCards() {
        return this.cards;
    }
    public Deck() {
        ArrayList<Card> cardStack = new ArrayList<Card>();
        for (Suit s : Suit.values()) {

            for (int i = 0; i < 13; i++) {
                Card c = new Card();
                c.setSuit(s);
                switch (i) {
                case 0:
                    c.setName("TWO");
                    c.setValue(2);
                    break;
                case 1:
                    c.setName("THREE");
                    c.setValue(3);
                    break;
                case 2:
                    c.setName("FOUR");
                    c.setValue(4);
                    break;
                case 3:
                    c.setName("FIVE");
                    c.setValue(5);
                    break;
                case 4:
                    c.setName("SIX");
                    c.setValue(6);
                    break;
                case 5:
                    c.setName("SEVEN");
                    c.setValue(7);
                    break;
                case 6:
                    c.setName("EIGHT");
                    c.setValue(8);
                    break;
                case 7:
                    c.setName("NINE");
                    c.setValue(9);
                    break;
                case 8:
                    c.setName("TEN");
                    c.setValue(10);
                    break;
                case 9:
                    c.setName("JACK");
                    c.setValue(10);
                    break;
                case 10:
                    c.setName("QUEEN");
                    c.setValue(10);
                    break;
                case 11:
                    c.setName("KING");
                    c.setValue(10);
                    break;
                case 12:
                    c.setName("ACE");
                    c.setValue(11);
                    break;
                default:
                    c.setName("ERROR");
                }
                System.out.println("Adding " + c);
                cardStack.add(c);
            }
        }
        cards = cardStack;
    }

   public void shuffle(){
        Collections.shuffle(cards);
    }
}