//Filename: Animal.java
//Description: My base class/parent for the animal classification  
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

/**
 *
 * @author skygourley
 */
abstract class Animal
	{
                                 // accessible within all classes in package
        protected String name;      // animal name
	protected String eats;      // what animal eats
        protected String numFeet;   // number of feet
	protected String sound;     // sound animal makes
	protected IfFlys IfFlys;    // if animal flys 
                                    // not using saved for future protected String dogType;
        

   
	protected abstract void isAnimal();

	protected void eats()
		{
		System.out.println(" Eat " + eats + ".");
		}
	
	protected void makesNoise()
		{
		System.out.println(" Make " + sound + " sound.");
		}
        protected void numFeet()
		{
		System.out.println(" Have " + numFeet + " feet.");
		}
        /*protected void dogType()
        {
            System.out.println(" A French Bulldogs average weight is " + dogType + " .");
        } */
} 
        
        
	