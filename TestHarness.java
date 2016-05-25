//package generated;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.JAXBException;

import javax.xml.bind.Marshaller;

import java.util.ArrayList;

import java.util.List;

import java.util.Arrays;
import generated.Inventory;
import generated.FoodRecipe;
import generated.Animal;
import generated.AnimalClass;
import generated.ObjectFactory;    

public class TestHarness

{

   public static void main( String [] args ) throws JAXBException {

            Inventory inventory = new Inventory();

            FoodRecipe recipe = new FoodRecipe();

			AnimalClass aC = AnimalClass.MAMMAL;			

            recipe.setName("Gorilla Chow");
            String a[]= new String []{"leaves", "insects","fruit" };
			List list1=Arrays.asList(a);

            recipe.ingredient=list1;
            
            System.out.println(recipe.getIngredient());			
            List<Animal> animal = new ArrayList<Animal> ();
            Animal ani = new Animal( );
            
            ani.setAnimalClass(aC);

			ani.setName("Song Fang");
		    System.out.println(ani.getName());
			ani.setSpecies("Giant Panda");
			ani.setHabitat("China");
			ani.setFood("Bamboo");
			ani.setTemperament("Friendly");
			ani.setWeight(45.0);
			ani.setFoodRecipe(recipe);
		 System.out.println(ani);
			animal.add( ani );


           inventory.animal=animal;

            

            marshall( inventory );

}

        

   public static void marshall( Object jaxbObject ) throws JAXBException {

            JAXBContext context = JAXBContext.newInstance(

                jaxbObject.getClass() );

            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,

                Boolean.TRUE);

            marshaller.marshal(jaxbObject, System.out);

        }

    }
