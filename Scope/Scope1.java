public class Scope1{
  public static void main(String[] args){
    
    for (int i = 0; i < 4; i++){
      System.out.println(i); //OK -> i is inside loop
    }

    i = 6; //ERROR: i does not exist here

  }
}
