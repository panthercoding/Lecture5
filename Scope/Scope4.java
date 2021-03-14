public class Scope4{

  public static void main(String[] args){

    int score = 85;
    if (score < 90){
      String grade = "A";
    }
    System.out.println(grade);
    /* error since grade does not exist
    outside of if block */

    int score = 85;
    String grade;
    if (score < 90){
      grade = "A";
    }
    System.out.println(grade);
    /* works since grade was declared
    outside of the if block */ 

  }

}
