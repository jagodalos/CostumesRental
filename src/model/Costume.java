package model;

public class Costume {

	final private String costumeName;
	final private Integer costumePrice;
	final private CostumeCategory costumeCategory;

	public Costume(String costumeName, Integer costumePrice, CostumeCategory costumeCategory) {
		this.costumeName = costumeName;
		this.costumePrice = costumePrice;
		this.costumeCategory = costumeCategory;
	}

	public String getCostumeName() {
		return costumeName;
	}

	public Integer getCostumePrice() {
		return costumePrice;
	}

	public CostumeCategory getCostumeCategory() {
		return costumeCategory;
	}
	
	

}
