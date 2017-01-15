package model;

public class Costume {

	final private String name;
	final private Integer price;
	private boolean available;

	public Costume(String costumeName, Integer costumePrice) {
		this.name = costumeName;
		this.price = costumePrice;
		this.available = true;
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
}
