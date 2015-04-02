package economist.item;

public abstract class Material extends Item {
	
	public Material(ItemType type, int amount){
		super(type, amount);
	}
	
	public void onUse(){
		return;
	}

}
