package bishop;

import java.util.ArrayList;

public class BishopLogic {
	private String start;
	private String end;
	private int startSquareX;
	private int startSquareY;
	private int endSquareX;
	private int endSquareY;
	private int moves;
	
	ArrayList<String> blackSquare = new ArrayList<String>();
	ArrayList<String> whiteSquare = new ArrayList<String>();

	
	public BishopLogic(String start, String end, int moves) {
		super();
		this.start = start;
		this.end = end;
		this.startSquareX = (int)start.charAt(0)-96;
		this.startSquareY = (int)start.charAt(1);
		this.endSquareX = (int)end.charAt(0)-96;
		this.endSquareY = (int)end.charAt(1);
		this.moves = moves;
		
		for(int i=2; i < 9; i+=2) {
			
			whiteSquare.add("a"+i);
			blackSquare.add("a"+(i-1));
			
			blackSquare.add("b"+i);
			whiteSquare.add("b"+(i-1));
			
			whiteSquare.add("c"+i);
			blackSquare.add("c"+(i-1));
			
			blackSquare.add("d"+i);
			whiteSquare.add("d"+(i-1));
			
			whiteSquare.add("e"+i);
			blackSquare.add("e"+(i-1));
			
			blackSquare.add("f"+i);
			whiteSquare.add("f"+(i-1));
			
			whiteSquare.add("g"+i);
			blackSquare.add("g"+(i-1));
			
			blackSquare.add("h"+i);
			whiteSquare.add("h"+(i-1));
			
		}
	}
	
	public ArrayList<String> allBlackPairs() {
		return blackSquare;
	}
	
	public ArrayList<String> allWhitePairs() {
		return whiteSquare;
	}
	
	public boolean isItPossible() {
		
		//if moves 0 is false unless the "start" and "end" are the same.
		if(moves <= 0) {
			if(start.equals(end)){
				return true;
			}
			return false;
		}
		
		//if "start" equals "end" then true no matter the moves
		if(start.equals(end)){
			return true;
		}
		
		//if the "start" and "end" are in the same block color then is possible to move
		if(blackSquare.contains(start) && blackSquare.contains(end) || whiteSquare.contains(start) && whiteSquare.contains(end)) {
			
			//we can do it in one move just if the "start" and "end" are aligned diagonally
			if(moves == 1) {
				if((startSquareX - endSquareX) == (startSquareY - endSquareY)) {
					return true;
				}else if ((-startSquareX + endSquareX) == (startSquareY - endSquareY)) {
					return true;
				}else {
					return false;
				}
			}
			
			//with more than 1 move is possible to complete the move of the Bishop
			return true;
				
		}else {
			return false;
		}

	};
	
}
