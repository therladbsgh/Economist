package economist.item;

public class Stone extends Material{
	
	public Stone(){
		super(ItemType.STONE, 1);
	}
	
	public Stone(int amount){
		super(ItemType.STONE, amount);
	}

}
