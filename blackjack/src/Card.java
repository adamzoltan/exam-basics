import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 04. 18..
 */
public class Card {
  private String value;
  private String color;

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    String info = getValue() + " " + getColor();
    return info;
  }
}
