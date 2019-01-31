package test;

/**
 * 
 * @author Ruba
 *
 */
public class Human {
	
private String name;
private int age;
private double gender;

/**
 * This constructs a human with specific name,age and gender
 * @param name the name of the human
 * @param age the age of the human
 * @param gender the gender of the human
 */

public Human(String name,int age,double gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
}
/**
 * 
 * @return
 */

public String getName() {
	return name;
}
/**
 * 
 * @return
 */
public int getAge() {
	return age;
}

/**
 * 
 * @return
 */
public double getGender() {
	return gender ;
}
	
}
