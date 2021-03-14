public class Scope3{

  public static void main(String[] args){
    minimum(30,10);
    System.out.println(min);
    //ERROR -> min exists solely within the minimum method
  }

  public static void minimum(double a, double b){
    double min;
    if (a <= b)
      min = a;
    else
      min = b;
  }

  

}
