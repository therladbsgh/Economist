package economist.item;

public abstract class Tool extends Item{
	
	private int durability;
	
	public Tool(ItemType type, int amount, int durability){
		super(type, amount);
		this.durability = durability;
	}
	
	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
	

}
