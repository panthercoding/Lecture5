/* driver class (main method) for Voter */

public class Election{

  public static void main(String[] args){
    
    //form 6 voters using the constructor method
    Voter voter1 = new Voter("Jon","D");
    Voter voter2 = new Voter("Susan","R");
    Voter voter3 = new Voter("Amy","D");
    Voter voter4 = new Voter("Sherrod","D");
    Voter voter5 = new Voter("Mark","R");
    Voter voter6 = new Voter("Michell","R");

    voter5.setParty("D"); //change parties

    //voting phase
    voter1.voteBiden(); voter2.voteTrump();
    voter3.voteBiden(); voter4.voteBiden();
    voter5.voteBiden(); voter6.voteTrump();

    //tabulating votes
    System.out.println("BIDEN VOTES: " + Voter.votesBiden);
    System.out.println("TRUMP VOTES: " + Voter.votesTrump);

  }

}
