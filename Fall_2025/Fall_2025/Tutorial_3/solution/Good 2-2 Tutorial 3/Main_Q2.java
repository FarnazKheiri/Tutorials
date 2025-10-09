public class Main_Q2{

    enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

    public static void main (String [] args){
        Rank highCard, faceCard, card1, card2;

        highCard = Rank.ace;
        faceCard = Rank.king;
        card1 = Rank.seven;
        card2 = Rank.nine;

        System.out.println("A blackjack hand is: " + highCard + " and " + faceCard);

        int card1Val, card2Val, sum;

        card1Val = (card1.ordinal() + 1);
        card2Val = (card2.ordinal() + 1);
        sum = (card1Val + card2Val);

        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand Value: " + sum);
    }

}