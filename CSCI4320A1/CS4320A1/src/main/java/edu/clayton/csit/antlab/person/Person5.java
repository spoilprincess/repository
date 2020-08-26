package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  if(input.length() >= 2){
		char[] symbols = input.toCharArray();
		char c1 = input.charAt(0);
		char c2 = input.charAt(1);
		for(int i = 2; i< symbols.length; i++){
			symbols[i-2] = symbols[i];
		}
		symbols[symbols.length -2] = c1;
		symbols[symbols.length -1] = c2;
		String str = "";
		for(int i = 0; i< symbols.length; i++){
			str = str + symbols[i];
		}
		System.out.println(str);
          }
	  else
	  	return null;
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

}
