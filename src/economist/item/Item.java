package economist.item;

public abstract class Item {
	
	private final ItemType type;
	private int amount;
	
	public Item(ItemType type){
		this.type = type;
		this.amount = 0;
	}
	
	public Item(ItemType type, int amount){
		this.type = type;
		this.amount = amount;
	}
	
	public ItemType getItemType(){
		return type;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}

}
