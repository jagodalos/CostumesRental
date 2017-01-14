package model;

public class Costume {

	final private String name;
	final private Integer price;
	final private CostumeCategory category;
	private boolean available;

	public Costume(String costumeName, Integer costumePrice, CostumeCategory costumeCategory) {
		this.name = costumeName;
		this.price = costumePrice;
		this.category = costumeCategory;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public CostumeCategory getCategory() {
		return category;
	}
	
	

}
