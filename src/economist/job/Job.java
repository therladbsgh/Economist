package economist.job;

import economist.Player;

public abstract class Job {
	
	private String name;
	private String description;
	
	public Job(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public String toString(){
		return this.name;
	}
	
	public String getName(){
		return this.toString();
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void doJob(Player player){
		System.out.println("You did a job!");
		getReward(player);
		return;
	}
	
	public void getReward(Player player){
		player.setMoney(player.getMoney()+1);
		System.out.println("Your money is now " + player.getMoney() + ".");
	}

}
