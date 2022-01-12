package bishop;

public class BishopDirver {
	
	public static void main(String[] args) {
		
		//all block pairs of the chess board
		System.out.println("Black blocks: "+ new BishopLogic("a1","h8",2).allBlackPairs());
		System.out.println("White blocks: "+ new BishopLogic("b1","h7",2).allWhitePairs());
		
		//using 0 moves and same position
		System.out.println("Bishop moved?... "+ new BishopLogic("c3","c3",0).isItPossible());
		
		//using 1 move and same position
		System.out.println("Bishop moved?... "+ new BishopLogic("c3","c3",1).isItPossible());
		
		//different positions but 0 moves
		System.out.println("Bishop moved?... "+ new BishopLogic("c3","f6",0).isItPossible());
		
		//different positions 1 move in the same diagonal
		System.out.println("Bishop moved?... "+ new BishopLogic("c3","f6",1).isItPossible());
		
		//different positions 1 move in different diagonal
		System.out.println("Bishop moved?... "+ new BishopLogic("b2","d2",1).isItPossible());
		
		//different positions in different diagonal but more than 1 move
		System.out.println("Bishop moved?... "+ new BishopLogic("b2","d2",2).isItPossible());
		
		//different positions in different diagonal but more than 1 move
		System.out.println("Bishop moved?... "+ new BishopLogic("h8","c1",4).isItPossible());
		
		//different color blocks
		System.out.println("Bishop moved?... "+ new BishopLogic("f2","g4",4).isItPossible());
	}

}
