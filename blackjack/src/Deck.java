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
  }

}
