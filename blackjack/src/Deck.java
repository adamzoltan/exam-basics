
import java.util.ArrayList;
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

  public void fillDeck(int deckSize) {
    if (deckSize < 4) {
      for (int i = 0; i < deckSize; i++) {
        for (int j = 0; j < 4; j++) {
          Card card = new Card("Queen", cardColor(j));
          deck.add(card);
        }
      }
    } else {
      int c = 0;
      for (int i = 0; i < deckSize; i++) {
        Card card = new Card("Queen", cardColor(c));
        deck.add(card);
        c++;
        if (c == 4 ) {
          c = 0;
        }
      }
    }
  }




  public String getCard (int i) {
    String card;
    card= deck.get(i).getColor();
    return card;
  }

}
