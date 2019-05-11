//Filename: Penguin.java
//Description: A class to encapsulate the properties of a 
// Bird within parent class Animal
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

public class Penguin extends Bird
	{
	protected Penguin(String Penguins, String f, String s, String L)
		{
		name = Penguins;
		eats= f;
		sound = s;
               numFeet = L;
		IfFlys = (IfFlys) new CannotFly();
		}
	}