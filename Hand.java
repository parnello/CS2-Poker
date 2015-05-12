import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush = Flush + Straight (10 up)
   Straight Flush = Flush + Straight
   Four of a Kind = 4 of one value
   Full House = Three of a kind + one pair
   Flush = all same suit
   Straight = 5 in a row
   Three of a Kind = 3 of one value
   Two Pair = 2 pairs
   One Pair = 2 of same value
   High Card = highest card in your hand
   WORST
   */
   public String handValue() {
     return "";
   }

   private boolean isStraight() {
     for(int i = 0; i < 4; i++) {
       if(hand.get(i).value+1 != hand.get(i+1).value)
         return false;
     }
     return true;
   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      return -1;
   }
}
