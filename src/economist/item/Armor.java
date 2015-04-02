package economist.item;

public abstract class Armor extends Item {
	
	private int durability;

	public Armor(ItemType type, int amount, int durability){
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
