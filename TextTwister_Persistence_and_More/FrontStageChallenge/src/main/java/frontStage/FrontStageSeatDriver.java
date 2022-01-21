package frontStage;

public class FrontStageSeatDriver {
	
	public static void main(String[] args) {
		
		//true
		int[][] test1 = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test1).canSee());
		
		//true
		int[][] test2 = {{1,2,3,2,1,1},{2,4,4,3,2,2},{5,5,5,5,4,4},{6,6,7,6,5,5}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test2).canSee());
		
		//false
		int[][] test3 = {{1,2,3,2,1,1},{2,4,4,3,2,2},{5,5,5,10,4,4},{6,6,7,6,5,5}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test3).canSee());
		
		//true
		int[][] test4 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test4).canSee());
		
		//true
		int[][] test5 = {{0,0,0},{1,1,1},{2,2,2}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test5).canSee());
		
		//false
		int[][] test6 = {{2,0,0},{1,1,1},{2,2,2}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test6).canSee());
		
		//false
		int[][] test7 = {{1,0,0,0,2,0,0,0,0,0},{2,3,4,5,1,7,8,9,10,11},{12,13,14,15,16,17,18,19,20,21}};
		System.out.println("Can everyone see the stage? " + new FrontStageSeat(test7).canSee());
	}

}
