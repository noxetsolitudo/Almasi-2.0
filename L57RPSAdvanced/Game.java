package com.company.L57RPSAdvanced;

public class Game extends Enums {

    private Computer computer;
    private Player player;
    private CHOICES computerChoice;
    private CHOICES playerChoice;
    private RESULT result;

    //TODO constructor
    public Game() {
        super();
        computer = new Computer();
        player = new Player();
    }

    public void play() {
        computerChoice = computer.getChoice();
        playerChoice = player.getChoice();
    }

    public RESULT getResult() {

        if (computerChoice == playerChoice){
            result = RESULT.TIE;
        }

        switch (computerChoice) {

            case ROCK:
                return (playerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSS);//if computer chose ROCK and player chose scissors, computer wins, if player chose paper computer loses
            case PAPER:
                return (playerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSS);//same but different^^
            case SCISSORS:
                return (playerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSS);//same but different^^
        }
        //TODO it never comes to this scenario so it doesn't matter what it returns
        return RESULT.LOSS;
    }


}
