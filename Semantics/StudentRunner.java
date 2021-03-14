public class StudentRunner{

  public static void main(String[] args){
    Student student1 = new Student("Thomas",2500);
    int number = 2500;
    mystery(student1,number);
    System.out.println(student1.getID() + number);
  }

  public static void mystery(Student s1, int n){
    s1.changeID(3000); //passed by reference
    n = 3000; //passed by value
  } 
}
