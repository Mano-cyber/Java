/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import utility.GameUtils;

/**
 *
 * @author Mano
 */
public class Game {
    
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int)(Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);        
    }
    
    public void playGame() {
        playGame(6);
    }
    
    public String getDescription() {
        
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(homeTeam.getTeamName() + " vs. " +
        awayTeam.getTeamName() + "\n");

        for (Goal currGoal: this.getGoals()) {
            if (currGoal.getTheTeam()== homeTeam) {
            homeTeamGoals++;
        }
        else {
            awayTeamGoals++;
        }
            
        returnString.append("Goal scored after "
            + currGoal.getTheTime() + " mins by "
            + currGoal.getThePlayer().getPlayerName() + " of "
            + currGoal.getTheTeam().getTeamName() +
              "\n");
       
        if (homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        }
        else if (homeTeamGoals > awayTeamGoals){
            returnString.append
                    (returnString.append(homeTeam.getTeamName() + "Win"));
            homeTeam.incPointsTotal(2);
        }
        else {
            returnString.append
                    (returnString.append(awayTeam.getTeamName() + "Win"));
            awayTeam.incPointsTotal(2);
        }
        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");
        }    
  

        return returnString.toString();
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
      
}
