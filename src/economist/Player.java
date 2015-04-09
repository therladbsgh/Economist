package economist;

import economist.job.*;
import economist.item.*;

public class Player{
	
	private int money;
	private int health;
	private int hunger;
	
	private Job job;
	private Inventory inventory = new Inventory();
	
	public Player(){
		this.money = 0;
		this.health = 20;
		this.hunger = 0;
	}

	public int getMoney(){
		return money;
	}

	public void setMoney(int money){
		this.money = money;
	}

	public int getHealth(){
		return health;
	}

	public void setHealth(int health){
		this.health = health;
	}

	public int getHunger(){
		return hunger;
	}

	public void setHunger(int hunger){
		this.hunger = hunger;
	}
	
	public String getJob(){
		return this.job.toString();
	}
	
	public void setJob(int job){
		switch(job){
			case 1:
				this.job = new Miner();
				break;
			default:
				break;
		}
			
	}
	
	public boolean hasJob(){
		if(this.job == null || this.job.toString() == "HOBO"){
			return false;
		}
		return true;
	}
	
	public void showStatistics(){
		System.out.println("JOB: " + this.job.toString());
		System.out.println("MONEY: $" + this.money);
		System.out.println("HEALTH: " + this.health);
		System.out.println("HUNGER: " + this.hunger);
	}
	
	public void work(Player player){
		this.job.doJob(player);
	}
	
	public boolean getItem(Item item){
		return this.inventory.addItem(item);
	}
	
	public boolean trashItem(ItemType itemType, int amount){
		return this.inventory.removeItem(itemType, amount);
	}
	
	public void displayInventory(){
		System.out.println("-----ARMOR-----");
		this.inventory.displayArmor();
		System.out.println("------BAG------");
		this.inventory.displayBag();
		System.out.println("---------------");
	}

}
