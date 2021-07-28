/**
 * Chris Chi
 * 30039599
 * 21/07/2021
 * Nested Class
 */
package nestedclassv2;

import java.util.*;

public class NestedClassV2 {

    public static void main(String[] args) {
        LinkedList<Country> country = new LinkedList<Country>();
        Country c1 = new Country("Australia", 24000000 , "Camberra");
        Country c2 = new Country("Korea", 51000000, "Seoul");
        Country c3 = new Country("Japan", 126000000, "Tokyo");
        Country c4 = new Country("America", 328000000, "Washington DC");
        
        country.addLast(c1);
        country.addLast(c2);
        country.addLast(c3);
        country.addLast(c4);
        
        for(Country c: country) {
            System.out.println("Country: " + c.getCountry());
            System.out.println("Population: " + c.getPop());
            System.out.println("Capital: " + c.getCapCity());
            System.out.println();
        }
            
        
    }
    
}
