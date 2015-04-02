package economist.item;

public enum ItemType {
	
	AIR("Air", 0),
	STONE("Stone", 1),
	GRASS("Grass", 2),
	DIRT("Dirt", 3),
	BADDIRT("Bad Dirt", 3, 1);
	
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

}
