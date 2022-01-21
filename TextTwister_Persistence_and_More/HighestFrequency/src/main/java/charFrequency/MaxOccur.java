package charFrequency;

import java.util.LinkedHashSet;
import java.util.Set;

public class MaxOccur {
	
	private String str;
	private long maxFrequency;
	
	public MaxOccur(String str) {
		super();
		this.str = str;
		this.maxFrequency = 0;
	}
	
	StringBuilder strb = new StringBuilder();
	
	public String maxOccurChar() {
		
		char[] chars = str.toCharArray();
		
		//Using LinkedHashSet to preserve the insertion ordering.
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> charSetF = new LinkedHashSet<Character>();
		
		//getting the non repeated characters
		for(char c: chars) {
			charSet.add(c);
		}
		
		//getting the maxFrequency
		for(Character ch: charSet) {
			long temp = 0;
			temp = str.chars().filter(s -> s == ch).count();
			if(temp > maxFrequency)
				maxFrequency = temp;
		}
		
		//getting the chars with the maxFrequency in case there is more than 1.
		for(Character ch: charSet) {
			
			if(maxFrequency == 1) {
				return "No Repetition";
			}
			
			long temp = 0;
			temp = str.chars().filter(s -> s == ch).count();
			if(temp == maxFrequency) {
				//strb.append(ch);
				charSetF.add(ch);
			}
		}
		
		//System.out.println(maxFrequency);
		
		return charSetF.toString();
	}

}
