//Filename: Cow.java
//Description: A class to encapsulate the properties of a 
// Mammal within parent class Animal
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;


public class Cow extends Mammal
	{
	protected Cow(String Cow, String f, String s, String L)
		{
		name = Cow;
                eats= f;
		sound = s;
                numFeet = L;
		IfFlys = (IfFlys) new CannotFly();
		}
	}