package intern.delta;

import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please Write gramaticly correct expression started with Uppercase and finished with Lowercase");
		boolean answer = isValidExpression(keyboard);
		System.out.println("The answer is: "+answer);
		

		
	}

	private static boolean isValidExpression(Scanner keyboard) {
		boolean answer = true;
		char[] ch = keyboard.next().toCharArray();
		int firstLetter = ch[0];
		int lastLetter = ch[ch.length-1];
		
		if (firstLetter<65 || firstLetter>90 || lastLetter < 97 || lastLetter>122) {
			answer = false;
		}
		return answer;
	
	}

}
