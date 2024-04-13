package assignment;

import java.util.Scanner;

public class Edit_string {
	static String letter;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = sc.nextLine();
		String oldWord = word;
		while (true){
		    System.out.print("Enter a letter: ");
			letter = sc.nextLine();
			if (letter.equalsIgnoreCase("U")) {
				oldWord = word;
				word = word.toUpperCase();
			} else if(letter.equalsIgnoreCase("L")) {
				oldWord = word;
				word = word.toLowerCase();
			} else if (letter.equalsIgnoreCase("R")) {
				oldWord = word;
				String reversedword = "";
				for (int i = word.length() - 1; i >= 0; i--) {
					char c = word.charAt(i);
					reversedword += c;
				}
				word = reversedword;

			} else if ((letter.substring(0, 1)).equalsIgnoreCase("C") && letter.replaceAll(" ", "").length() == 3) {
				oldWord = word;
				letter = letter.replaceAll(" ", "");
				String ch1 = letter.substring(1, 2);
				String ch2 = letter.substring(2, 3);
				word = word.replaceAll(ch1, ch2);
			} else if (letter.equalsIgnoreCase("Z")) {
				word = oldWord;
			} else if (letter.equalsIgnoreCase("X")) {
				break;
			} else {
				System.out.format("Invalid Fuction %s ! \n", letter);
			}

		}
		System.out.println("Word is: " + word);
	}
	

}



