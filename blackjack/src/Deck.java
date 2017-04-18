
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by Adam on 2017. 04. 18..
 */
public class Deck {
  private List<Card> deck;
  private int deckSize;

  public Deck(int deckSize) {
    this.deck = new ArrayList<>();
    this.deckSize = deckSize;
    fillDeck(deckSize);
  }

  public String cardColor(int n) {
    List<String> cardColor = new ArrayList<>();
    cardColor.add("Clubs");
    cardColor.add("Diamonds");
    cardColor.add("Hearts");
    cardColor.add("Spades");
    return cardColor.get(n);
  }

  public String cardValue () {
    int n = (int)(Math.random() * 13);
    List<String> cardValue = new ArrayList<>();
    cardValue.add("2");
    cardValue.add("3");
    cardValue.add("4");
    cardValue.add("5");
    cardValue.add("6");
    cardValue.add("7");
    cardValue.add("8");
    cardValue.add("9");
    cardValue.add("10");
    cardValue.add("J");
    cardValue.add("Q");
    cardValue.add("K");
    cardValue.add("A");
    return cardValue.get(n);
  }

  public void fillDeck(int deckSize) {
    if (deckSize < 4) {
      for (int i = 0; i < deckSize; i++) {
        for (int j = 0; j < 4; j++) {
          Card card = new Card(cardValue() , cardColor(j));
          deck.add(card);
        }
      }
    } else {
      int c = 0;
      for (int i = 0; i < deckSize; i++) {
        Card card = new Card(cardValue(), cardColor(c));
        deck.add(card);
        c++;
        if (c == 4 ) {
          c = 0;
        }
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  public Card draw() {
    Card card = deck.get(deckSize-1);
    deck.remove(deckSize-1);
    return card;

  }

}
