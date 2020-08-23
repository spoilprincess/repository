package edu.clayton.csit.antlab.person;

import java.util.*;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @Revised By: Nicole Penn
 *  @version 1.1
 */
public class Person1
{
  /** Holds the person's real name */
  private String name; 
    
  /*
  *  The constructor takes in the person's name
  * 
  *  @param pname The person's real name
  */
  public Person1(String pname)
  {
    name = pname; 
  }
    
  /*
  *  This method should take the string input and return its
  *  characters rotated two (2) positions.
  *  Given "gtg123b" it should return "g123bgt".
  * 
  *  @param input The string to be modified
  *  @return the modified string
  */
  private String calc(String input)
  {
    /* Person 1 implementation here */
    String leftRotate = input.substring(2) + input.substring(0, 2);      
    return leftRotate; 
  }
    
  /**
  *  Return a string rep of this object that varies with an 
  *  input string
  * 
  *  @param input The varying string
  *  @return The string representing the object
  */
  public String toString(String input)
  {
    return name + calc(input);
  }
    
  public static void main(String[]args)
  {    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Real Name"); 
    String pname = keyboard.nextLine();
    
    Person1 person = new Person1(pname);
       
    person.calc(pname);
    System.out.println(person.calc(pname));
  }    
}
