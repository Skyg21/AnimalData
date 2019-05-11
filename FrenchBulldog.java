//Filename: FrenchBulldog.java
//Description: A class to encapsulate the properties of Dog in 
// Mammal class within parent class Animal
// Note, not working correctly save for future use
//Author: Sky Gourley
//Date Last Modified: 12/14/18
package animal;

/**
 *
 * @author skygourley
 */
public class FrenchBulldog extends Dog 
{ public FrenchBulldog(String Dogs, String f, String s, String L, String w) {
        super(Dogs, f, s, L);
       
    }
    public double avgWeight() {
		return super.avgWeight();
    }
    public double lifeSpan() {
		return super.lifeSpan();
		
        
     
		}
    
}
