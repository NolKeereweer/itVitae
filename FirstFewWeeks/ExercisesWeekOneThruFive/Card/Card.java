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

  private Card(CardColor color, CardRank rank) {
    this.color = color;
    this.rank = rank;
  }

  public String toString() {
    return "The " + capitalise(color.toString().toLowerCase()) + " " + capitalise(rank.toString().toLowerCase()) + " ";
  }

  private static void cardChecker(Card card) {
//    switch(card.rank) {
//      case ONE: 
//      case TWO:
//      case THREE:
//      case FOUR:
//      case FIVE:
//      case SIX:
//      case SEVEN:
//      case EIGHT:
//      case NINE:
//      case TEN:
//        System.out.println("is a number card.\n");
//        break;
//      case DOLLAR:
//      case PERCENT:
//      case CARET:
//      case AMPERSAND:
//        System.out.println("is a face card.\n");
//        break;
//      default:
//        System.out.println("is not a viable card");
//        break;
//    }

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
