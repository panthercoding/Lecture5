public class Circle{ //declaring class
  
  /* instance variables -> attributes */
  private double radius; 

  public Circle(){ /* no argument constructor */
    radius = 0; //default radius
  }

  public Circle(double r){ /* parametrized constructor */
    radius = r; //set radius equal to provided input r
  }

  public double getRadius(){ /* accessor method */
    return(radius);
  }

  public void setRadius(double r){ /* mutator method */
    radius = r; 
  }

  public double calcArea(){ /* calculates area of circle */
    return(Math.PI * radius * radius);
  }

  public String toString(){ /* returns circle information as string */
    String str = "A circle with radius " + radius;
    return(str);
  }

}
