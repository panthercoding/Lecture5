public class Scope2{

  public static void main(String[] args){
    int number = 10;
    addFive(number);

    System.out.println(number);
    /* output is still 10 since the number is only
    changed inside the addFive method */
  }

  public static void addFive(int a){
    a = a + 5;
  }

}
