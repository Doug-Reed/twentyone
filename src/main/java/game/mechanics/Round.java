package game.mechanics;

import java.util.ArrayList;

import game.cards.Hand;
import game.players.Dealer;
import game.players.Player;
import game.players.decisions.PlayingDecision;
import game.players.decisions.Decision;

public class Round {
    public void playRound(Table table){

        //Initiate
        Dealer d = table.getDealer();
        ArrayList<Player> players = table.getPlayers();
        d.nextRound();

         for(Player p: players) {
             p.nextRound(table.getDiscardTray().trueCount());
         }
         for(Player p: players) {
            for(Hand h:p.getHands()) {
               h.addToHand(table.getShoe().draw(), false);
            }
         }
         d.hand.addToHand(table.getShoe().draw(), true);

         for(Player p: players) {
            for(Hand h:p.getHands()) {
               h.addToHand(table.getShoe().draw(), false);
            }
         }
         d.hand.addToHand(table.getShoe().draw(), false);
         game.cards.Card dealerUpcard = d.hand.dealerUpcard();
        
        boolean dealerBlackjack = false;
        
         if(dealerUpcard.getName().equalsIgnoreCase("ACE")){

         }

         //Play
         for(Player p: players){
             for(Hand h:p.getHands()) {
                PlayingDecision playingDecision = new PlayingDecision();
            
             
             while(playingDecision.decision(table, h, dealerUpcard)!= Decision.STAND ){
                 
             }
             }
         }

         //Resolve
    }
}