package game.players;

import java.util.ArrayList;

import game.cards.Hand;

public class Player {
    private String name;
    private double bankroll;
    private CountingSystem countingSystem = new HiLo();
    private BetCalculator betCalculator = new BetCalculator();

    public ArrayList<Hand> hands = new ArrayList<Hand>();
    public ArrayList<Hand> getHands(){
        return hands;
    }
    public void nextRound(int trueCount){
        
        game.players.betspread.Bet bet = betCalculator.calculateBet(trueCount);
        hands = new ArrayList<Hand>(bet.getNumberOfSpots());
    }

    public void split(Hand h) {
        game.cards.Card c = h.getSplit();
        Hand newHand = new Hand();
        newHand.addToHand(c, false);
        hands.add(newHand);
    }
    public int placeBet() {
        return 0;
    }

    public int placeSideBet() {
        return 0;
    }
    public void setBankroll(double bankroll) {
        this.bankroll = bankroll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}