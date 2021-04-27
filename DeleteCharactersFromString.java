package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	String userInput;
	String toRemove;
	char charToRemove;
	char[] characterArray;
	char[] updatedArray;
	String result;
	String outcome;

	public void run() {
	userInput = readLine("Enter a sentence: ");
	toRemove = readLine("Enter a character to remove: ");
	if (toRemove.length()>1) {
	System.out.println("Please enter a single character to remove.");
	} else {
	charToRemove = toRemove.charAt(0);
	String outcome = removeAllOccurances(userInput, charToRemove);
	System.out.println(outcome);
	}
	}
	
	public String removeAllOccurances(String str1, char ch1) {
		return null;
	}

}
	

