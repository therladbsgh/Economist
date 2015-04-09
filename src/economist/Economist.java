package economist;

import java.util.Scanner;

public class Economist {
	
	public static void main(String[] args){
		
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Economist!");
		System.out.println("There is no save feature. You start from beginning.");
		
		while(player.hasJob() == false){
			System.out.println("Select a job (1 for Miner)");
			System.out.print("> ");
			int result = scanner.nextInt();
			player.setJob(result);
			if(player.hasJob()){
				System.out.println("Congratulations, you are now a " + player.getJob() + ".");
				break;
			}else{
				System.out.println("Wrong input.");
			}
		}
		
		boolean gameRunning = true;
		
		while(gameRunning){
			System.out.println("What would you like to do? (Type 'help' for details.)");
			System.out.print("> ");
			String result = scanner.next();
			switch(result.toLowerCase()){
				case "work":
					player.work(player);
					break;
				case "help":
					System.out.println("Commands:");
					System.out.println("work: Do your job");
					System.out.println("stat: Shows your statistics");
					System.out.println("exit: Exits the game");
					break;
				case "stat":
					player.showStatistics();
					break;
				case "exit":
					gameRunning = false;
					break;
				case "inventory":
					player.displayInventory();
					break;
				default:
					System.out.println("Wrong input.");
					break;
			}
			System.out.println("");
		}
		
		scanner.close();
		System.out.println("Now leaving the game.\nThank you for playing.");
	}

}
