//Filename: Dog.java
//Description: A class to encapsulate the properties of a 
// Mammal within parent class Animal
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

/**
 *
 * @author skygourley
 */
abstract public class Dog extends Mammal
	{
	protected Dog(String Dogs, String f, String s, String L)
		{
		name = Dogs;
                eats= f;
		sound = s;
                numFeet = L;
		IfFlys= (IfFlys) new CannotFly();
                double avgWeight = 25;
                double lifeSpan=12;
                
		}

    double avgWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double lifeSpan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

	
	}