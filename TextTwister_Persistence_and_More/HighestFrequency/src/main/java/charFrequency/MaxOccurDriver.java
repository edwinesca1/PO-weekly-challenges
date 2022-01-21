package charFrequency;

public class MaxOccurDriver {
	
	public static void main(String[] args) {
		
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("Edabit").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("watermelon").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("Strawberry").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("Engineering").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("synonyms").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("Computer Science").maxOccurChar());
		System.out.println("the letter with the Highest frequency: "+ new MaxOccur("the quick brown fox jumps over the lazy dog").maxOccurChar());
		
	}
	
	

}
