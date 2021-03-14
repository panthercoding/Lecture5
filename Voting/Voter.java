public class Voter{

  // ----- static variables and methods ------- //

  public static int votesBiden = 0;
  public static int votesTrump = 0;

  // ----- non-static variables and methods ------- //

  private String name; //name and party are private for confidentiality
  private String party;
  private boolean voted = false; //has the person voted yet?

  //parametrized constructor -> create a voter
  public Voter(String Name, String Party){
    name = Name;
    party = Party;
  }

  public void setParty(String Party){ //mutator method
    party = Party; //change party registration
  }

  public void voteBiden(){
    if (!voted) //if the person has not voted already
      votesBiden++;
      voted = true;
  }

  public void voteTrump(){
    if (!voted) //if the person has not voted already
      votesTrump++;
      voted = true;
  }

}
