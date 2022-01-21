package textTwist;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextTwistLogic {
	
	private String[] arrStr;
	private String word;
	private int count;
	private boolean isValid = true;
	private int points = 0;
	
	public TextTwistLogic(String word, String[] arrStr) {
		super();
		this.word = word;
		this.arrStr = arrStr;
		this.count = 0;
	}
	
	public int pointScored() {
		
		//capturing the chars 
		char[] chars = word.toCharArray();
		
		//creating a map to store the letters and the frequency of each.
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(char c: chars) {
			long temp = 0;
			temp = word.chars().filter(s -> s == c).count();
			map.put(Character.toString(c), (int)temp);
		}

		
		//looping through the String array to check if the words are valid or not.
		while(count < arrStr.length) {
			
			char[] charst = arrStr[count].toCharArray();
			
			for(Character ch: charst) {
				
				long temp = 0;
				temp = arrStr[count].chars().filter(s -> s == ch).count();
				if((int)temp <= map.get(Character.toString(ch))) {
					isValid = true;
				}else {
					isValid = false;
					break;
				}
			}
			
			//if valid, add the points scored per word
			if(isValid == true) {
				switch(arrStr[count].length()){
					case 3:
						points += 1;
						break;
					case 4:
						points += 2;
						break;
					case 5:
						points += 3;
						break;
					case 6:
						points += 54;
						break;
				}
			}
			
			count++; //used to exit when there is no more words to check.
		}
		
		return points;
	}

}
