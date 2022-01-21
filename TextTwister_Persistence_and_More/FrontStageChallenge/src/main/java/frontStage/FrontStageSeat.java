package frontStage;

public class FrontStageSeat {
	
	private int[][] rows;
	private boolean canSeeStage = true;
	
	public FrontStageSeat(int[][] rows) {
		super();
		this.rows = rows;
	}
	
	public boolean canSee() {
		
		if(rows.length == 1) {
			return true;
		}
		
		for(int i=0; i < rows.length-1; i++) {
            for(int j=0; j < rows[0].length; j++) {
                    
            	if(rows[i][j] < rows[i+1][j]) {
            		canSeeStage = true;
            		//System.out.print(rows[i][j] + "\t");
            		//System.out.print(rows[i+1][j] + "\t");
            	}else {
            		canSeeStage = false;
            		return canSeeStage;
            	}
            }
            //System.out.println("");
		}
		
		return canSeeStage;
	}

}
