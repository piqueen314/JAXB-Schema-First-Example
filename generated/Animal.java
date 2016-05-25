//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 05:15:59 PM UTC 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element name="species" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="habitat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="food" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{}foodRecipe"/>
 *         &lt;/choice>
 *         &lt;element name="temperament" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="animalClass" type="{}animalClass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "species",
    "habitat",
    "food",
    "foodRecipe",
    "temperament",
    "weight"
})
@XmlRootElement(name = "animal")
public class Animal {

    @XmlElement(required = true)
    public String name;
    @XmlElement(required = true)
    public String species;
    @XmlElement(required = true)
    public String habitat;
    public String food;
    public FoodRecipe foodRecipe;
    @XmlElement(required = true)
    public String temperament;
    public double weight;
    @XmlAttribute(name = "animalClass")
    public AnimalClass animalClass;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecies(String value) {
        this.species = value;
    }

    /**
     * Gets the value of the habitat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Sets the value of the habitat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitat(String value) {
        this.habitat = value;
    }

    /**
     * Gets the value of the food property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFood() {
        return food;
    }

    /**
     * Sets the value of the food property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFood(String value) {
        this.food = value;
    }

    /**
     * Gets the value of the foodRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link FoodRecipe }
     *     
     */
    public FoodRecipe getFoodRecipe() {
        return foodRecipe;
    }

    /**
     * Sets the value of the foodRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodRecipe }
     *     
     */
    public void setFoodRecipe(FoodRecipe value) {
        this.foodRecipe = value;
    }

    /**
     * Gets the value of the temperament property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperament() {
        return temperament;
    }

    /**
     * Sets the value of the temperament property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperament(String value) {
        this.temperament = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the animalClass property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalClass }
     *     
     */
    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    /**
     * Sets the value of the animalClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalClass }
     *     
     */
    public void setAnimalClass(AnimalClass value) {
        this.animalClass = value;
    }
	 public String toString() { return name +"("+animalClass+",            "+species+")"; }

}