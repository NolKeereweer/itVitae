package Card;

import static ExercisesWeekOneThruFive.TextMethods.capitalise;

public class Card {

  private CardColor color;
  private CardRank rank;

  enum CardColor{
    RED,
    GREEN,
    BLUE,
    YELLOW;

    @Override
    public String toString() {
      return capitalise(super.toString().toLowerCase());
    }
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

    @Override
    public String toString() {
      return capitalise(super.toString().toLowerCase());
    }
  }

  private Card(CardColor color, CardRank rank) {
    this.color = color;
    this.rank = rank;
  }

  public String toString() {
    return "The " + color + " " + rank + " ";
  }

  private static void cardChecker(Card card) {

    if (card.rank == CardRank.DOLLAR || card.rank == CardRank.PERCENT 
          || card.rank == CardRank.CARET || card.rank == CardRank.AMPERSAND) {
      System.out.println("is a face card.\n");
    } else {
      System.out.println("is a number card.\n");
    }
  }

  public static void main(String[] args) {
    for (CardColor color : CardColor.values()) {
      for (CardRank rank : CardRank.values()) {        
        System.out.print(new Card(color, rank));
        cardChecker(new Card(color, rank));
      }
    }
  }
}
