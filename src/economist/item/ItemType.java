package economist.item;

public enum ItemType {
	
	AIR("Air", 0),
	STONE("Stone", 1),
	GRASS("Grass", 2),
	DIRT("Dirt", 3),
	BADDIRT("Bad Dirt", 3, 1),
	LEATHER_HELM("Leather Helmet",100),
	LEATHER_CHESTPLATE("Leather Chestplate", 101),
	LEATHER_PANTS("Leather Pants", 102),
	LEATHER_BOOTS("Leather Boots", 103);
	
	private final String name;
	private final int id;
	private final int subValue;
	
	ItemType(String name, int id){
		this.name = name;
		this.id = id;
		this.subValue = 0;
	}
	
	ItemType(String name, int id, int subValue){
		this.name = name;
		this.id = id;
		this.subValue = subValue;
	}
	
	public String toString(){
		return name;
	}
	
	public String getName(){
		return toString();
	}
	
	public int getId(){
		return id;
	}
	
	public int getSubValue(){
		return subValue;
	}
	
	public boolean isArmor(){
		switch(this){
		case LEATHER_HELM:
		case LEATHER_CHESTPLATE:
		case LEATHER_PANTS:
		case LEATHER_BOOTS:
			return true;
		default:
			return false;
		}
	}

}
