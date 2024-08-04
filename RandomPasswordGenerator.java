package RandomPasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) {
			
		System.out.println("Input the length of the password: ");
		int length = input.nextInt();
		
		System.out.println("Do you want to include numbers? (y/n): ");
		boolean includeNumbers = input.next().equalsIgnoreCase("y");
		
		System.out.println("Do you want to include lowercase letters? (y/n): ");
		boolean includeLowercase = input.next().equalsIgnoreCase("y");
		
		System.out.println("Do you want to include uppercase letters? (y/n): ");
		boolean includeUppercase = input.next().equalsIgnoreCase("y");

		System.out.println("Do you want to include special characters? (y/n): ");
		boolean includeSpecialCharcaters = input.next().equalsIgnoreCase("y");

		
		String password = generateRandomPassword(length, includeNumbers, includeLowercase,
				includeUppercase, includeSpecialCharcaters);
		System.out.println("Your generated password is: " + password);
		
		scanner.close();

		}
		
		public static String generateRandomPassword(int length, boolean includeNumbers, boolean includeLowerCase, 
				boolean includeUpperCase, boolean includeSpecialCharacters) {
			
			String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
			String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String numbersCahrs = "0123456789";
			String specialChars = "!@#$%^&*()_-+=<>?";
			
			String allChars = "";
			if(incudeLowercase) allChars += lowerChars;
			if(includeUppercase) allChars += upperCaseChars;
			if(includeNumbers) allChars += numberChars;
			if(includeSpecialChars) allChars += specialChars;
			
			Random random = new Random();
			StringBuilder password = new StringBuiledr();
			
			for(int i = 0; i < length; i++) {
				int randomIndex = random.nextInt(allChars.length());
				password.append(allChars.charAt(randomIndex));
			}
			
			return password.toString();
			
		}
	}
}
