public class Card {

  private CardColor color;
  private CardRank rank;

  enum CardColor{
    RED,
    GREEN,
    BLUE,
    YELLOW;
  }

  enum CardRank{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    DOLLAR,
    PERCENT,
    CARET,
    AMPERSAND;
  }

  public Card(CardColor color, CardRank rank) {
    this.color = color;
    this.rank = rank;
  }

  public String toString() {
    return "The " + color + " " + rank + ".";
  }

  public static void main(String[] args) {
    for (CardColor color : CardColor.values()/*each value in CardColor*/) {
      for (CardRank rank : CardRank.values()/*each value in CardRank*/) {        
        System.out.println(new Card(color, rank).toString().toLowerCase());
      }
    }
  }
}
