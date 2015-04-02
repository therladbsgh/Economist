package economist.job;

public class Hobo extends Job {
	
	public Hobo(){
		super("Unemployed", "Bums around");
	}
	
	public void doJob(){
		System.out.println("You have no job!");
	}
	
	public void getReward(){
		return;
	}

}
