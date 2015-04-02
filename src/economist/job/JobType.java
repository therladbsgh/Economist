package economist.job;

public enum JobType {
	
	HOBO("Unemployed", "Bums around"),
	MINER("Miner", "Mines minerals");
	
	private final String name;
	private final String description;
	
	JobType(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public String toString(){
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}

}
