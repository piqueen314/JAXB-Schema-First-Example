#!/bin/bash
rm generated/*.class
rm *.class
javac generated/FoodRecipe.java generated/AnimalClass.java generated/Animal.java generated/Inventory.java generated/ObjectFactory.java TestHarness.java
java TestHarness
