package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Marronee Yarsee
 *  @version 1.2
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      String z = "";
      
      //iterates through String input, increases its char value by 1, and adds the new char to the empty string
      for(int i=0; i < input.length(); i++){
         char c = input.charAt(i);
         c+=1;
         z+=c;
      }return z;
     
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

    public static void main(String[] args){
      //testing
      Person4 p4 = new Person4("ron");
      System.out.println(p4.calc("qwerty135"));
      System.out.println(p4.calc("JiMbO"));
    }
      
   

}

