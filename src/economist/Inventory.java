package economist;

import java.util.ArrayList;
import economist.item.*;

public class Inventory {
	
	private final int ARMOR_CAPACITY = 4;
	private final int BAG_CAPACITY = 36;
	
	private ArrayList<Armor> armor;
	private ArrayList<Item> bag;
	
	public Inventory(){
		armor = new ArrayList<Armor>(ARMOR_CAPACITY);
		bag = new ArrayList<Item>(BAG_CAPACITY);
	}
	
	public boolean addItem(Item item){
		if(bag.size() == 0){
			bag.add(item);
			return true;
		}
		for(int i = 0; i < BAG_CAPACITY; i++){
			if(bag.get(i).getItemType() == item.getItemType()){
				bag.get(i).setAmount(bag.get(i).getAmount() + item.getAmount());
				return true;
			}
		}
		if(bag.size() < BAG_CAPACITY){
			bag.add(item);
			return true;
		}else{
			System.out.println("Your bag is full.");
			return false;
		}
	}
	
	public boolean removeItem(ItemType itemType, int amount){
		for(int i = 0; i < bag.size(); i++){
			//When item is in the bag
			if(bag.get(i).getItemType() == itemType){
				if(bag.get(i).getAmount() < amount){
					return false;
				}else{
					bag.get(i).setAmount(bag.get(i).getAmount() - amount);
					if(bag.get(i).getAmount() == 0){
						bag.remove(bag.get(i));
					}
					return true;
				}
			}
		}
		//When item is not in the bag
		return false;
	}
	
	public boolean addArmor(Armor armor){
		if(this.armor.size() < ARMOR_CAPACITY){
			this.armor.add(armor);
			return true;
		}else{
			System.out.println("Your armor slots are full.");
			return false;
		}
	}
	
	public boolean removeArmor(ItemType itemType){
		for(int i = 0; i < ARMOR_CAPACITY; i++){
			if(armor.get(i).getItemType() == itemType){
				armor.remove(armor.get(i));
				return true;
			}
		}
		return false;
	}
	
	public void displayArmor(){
		if(armor.size() == 0){
			System.out.println("None.");
		}else{
			for(int i = 0; i < armor.size(); i++){
				System.out.println(armor.get(i).getItemType().getName());
			}
		}
	}
	
	public void displayBag(){
		if(bag.size() == 0){
			System.out.println("None.");
		}else{
			for(int i = 0; i < bag.size(); i++){
				System.out.println(bag.get(i).getItemType().getName() + " x" + bag.get(i).getAmount());
			}
		}
	}

}
