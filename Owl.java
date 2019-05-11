//Filename: Owl.java
//Description: A class to encapsulate the properties of a 
// Bird within parent class Animal
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

public class Owl extends Bird
	{
	protected Owl(String Owls, String f, String s, String L)
		{
		name = Owls;
		eats = f;
		sound = s;
                numFeet = L;
		IfFlys = (IfFlys) new CanFly();
		}

    }
	