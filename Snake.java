//Filename: Snake.java
//Description: A class to encapsulate the properties of a 
// Reptile within parent class Animal
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

public class Snake extends Reptile
	{
	protected Snake(String Snake, String f, String s, String L)
		{
		name = Snake;
                eats= f;
		sound = s;
                numFeet = L;
		IfFlys = (IfFlys) new CannotFly();
		}
	}