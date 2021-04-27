package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		String digits = "";
		digits = readLine("Enter a numeric string: ");
		while (digits.length() != 0) {
			System.out.println("Output is: "  + addCommasToNumericString(digits));
		}
	}

	public String addCommasToNumericString(String d) {
		    String result = "";
		    for (int i=1; i <= d.length(); ++i) {
		        char ch = d.charAt(d.length() - i);
		        if (i % 3 == 1 && i > 1) {
		            result = "," + result;
		        }
		        result = ch + result;
		    }
		    return result;
		}
}
