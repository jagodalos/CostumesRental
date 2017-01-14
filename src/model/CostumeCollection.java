package model;

import java.util.ArrayList;
import java.util.Random;

public class CostumeCollection {

	ArrayList<Costume> costumes;

	public CostumeCollection() {

		costumes = new ArrayList<Costume>();
	}

	public CostumeCollection(ArrayList collection) {

		costumes = collection;
	}

	public void add(Costume item) {

		costumes.add(item);
	}
	
	public ArrayList <Costume> getCostumes(){
		return costumes;
	}

	public void fillWithitems() {
		Random generator = new Random();

		String[] starWarsCostumes = { "Princess Leia", "Jawa", "Jabba", "Jar Jar", "Darth Vader", "Yoda",
				"Queen Amidala", "Ewok", "Yoda", "Chewbacca" };
		
		for (String item : starWarsCostumes){
			costumes.add(new Costume(item,generator.nextInt(300)+ 80, CostumeCategory.STAR_WARS));
		}
		
		String[] superHeroesCostumes = {"Wonder Woman", "Deadpool", "Batman" ,"Hulk" ,"SpiderMan" ,"Black Widow","Harley Quinn"};
		
		for(String item : superHeroesCostumes){
			costumes.add(new Costume(item, generator.nextInt(200) + 70, CostumeCategory.SUPERHEROES));
		}
		
		String[] halloweenCostumes = {"Vampire", "Mummy", "Skeleton", "Witch", "Tooth Fairy", "Ghost"};
		
		for(String item : halloweenCostumes){
			costumes.add(new Costume(item, generator.nextInt(150) + 50, CostumeCategory.HALLOWEEN));
		}

	}

}