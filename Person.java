/**
 *@author John DiAntonio
 *Date: 11/20/2016
 *Purpose: 
 *Person class composes of name and age.
*/
public class Person {
	private String name;
	private int age;
	
	/**
	 *Construct a new person with the name = John and age = 0
	*/
	
	public Person() {
		name = "John";
		age = 0;
	}
	/**
	 *Construct a new person with values provided from name and age parameters.
	 *@param name the name of a person
	 *@param age the age of a person
	 */

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 *Get the name of a person
	 *@return name of a person
	 */
	public String getName() {
		return name;
	}
	/**
	 *Set the name of a person according to name parameter
	 *@param name of a person
	 */
	public void setName(String name) {
		this.name = name; 
	}
	/**
	 *Get the age of a person
	 *@return the age of a person
	 */ 
	public int getAge() {
		return age;
	}
	/**
	 *Set the age of a person according to age parameter
	 *@param age of a person
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 *Return a name and age of a person
	 */
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}

}
