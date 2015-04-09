package economist.job;

import economist.Player;
import economist.item.*;

public class Miner extends Job {
	
	public Miner(){
		super("Miner", "Mines minerals");
	}
	
	public void getReward(Player player){
		Stone stone = new Stone();
		player.getItem(stone);
		System.out.println("You got one stone!");
	}

}
