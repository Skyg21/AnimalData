
//Filename: AnimalData.java
//Description: main for animal class will run/display info 
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;
import java.util.ArrayList;

public class AnimalData
	{
	public static void main(String[] args)
		{
		
                    // all in same arraylist bc all animals 
		ArrayList <Animal> kingdom = new ArrayList <Animal>();
		kingdom.add(new Cat("Cats", "cat food", "meooow", "4"));
		kingdom.add(new Cow("Cows", "grass", "mooooo", "4"));
		kingdom.add(new Penguin("Penguins", "fish", "music with their feet", "2"));
		kingdom.add(new Owl("Owls","worms","hoooting","2"));
                kingdom.add(new Snake("Snakes","small mammals like rodents, birds, etc","hissing","no"));
                 kingdom.add(new FrenchBulldog("Dogs","dog food","wooof","4","25lb"));
                

		for (Animal a : kingdom)
			{	
			a.isAnimal();
                        a.numFeet();
			a.makesNoise();
			a.eats();
                        //a.dogType();
			a.IfFlys.flies();
			System.out.println();
			}
		}
	}