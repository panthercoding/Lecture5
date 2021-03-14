public class Student{

  private String name; //field variable
  private int ID; //field variable
  
  public Student(String name, int ID){
    this.name = name; //constructor method
    this.ID = ID;
  }
  public int getID(){ //accessor method
    return(ID);
  }
  public void changeID(int newID){
    ID = newID; //mutator method
  }
}

