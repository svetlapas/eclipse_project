package java_for_begginers;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String command = scanner.nextLine();
		
		switch(command) {
		case "start":
			System.out.println("machine started");
			break;
		case "stop":
			System.out.println("machine stopped");
			break;
		default:
			System.out.println("command not recognized");
		}
		
	

	}

}
