/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * Represents the cat's name and age.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */
public class Cat {
    /** Name.*/
    private String name;
    
    /** Age.*/
    private int age;
    
    /**
     * Constructor sets the cat's name and age.
     * 
     * @param name is cat's name
     * @param age is cat's age in years
     * */
    public Cat(final String name, int age) {
        if (name == "") {
            this.name = "Cleo";
        }
        if (age < 0) {
            this.age = 0;
        }
        this.name = name;
        this.age = age;
    }
    
    /**
     * Returns the name of the cat.
     * 
     * @return name cat's name as a string
     */
    public String getName() {
        return this.name;
    }
    
    /** 
     * Returns the age of the cat.
     * 
     * @return age cat's age in years as an integer
     */
    public int getAge() {
        return this.age;
    }
    
    /**
     * Sets the age of cat.
     * 
     * @param recentAge is the recent age of the cat as an integer
     */
    public void setAge(int recentAge) {
        this.age = recentAge;
    }
    
    public String toString() {
        String str = "Name: " + name + "\nAge: " + age + " years old.";
        return str;
    }
}
