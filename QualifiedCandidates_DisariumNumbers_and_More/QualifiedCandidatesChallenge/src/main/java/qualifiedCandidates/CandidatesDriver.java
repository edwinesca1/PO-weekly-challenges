package qualifiedCandidates;

public class CandidatesDriver {
	
	public static void main(String[] args) {
		
		//qualified
		int[] questions1 = {5,5,10,10,15,15,20,20};
		System.out.println("This candidate is "+ new Candidates(120, questions1).isQualified());
		
		//qualified
		int[] questions2 = {2,3,8,6,5,12,10,18};
		System.out.println("This candidate is "+ new Candidates(64, questions2).isQualified());
		
		//disqualified
		int[] questions3 = {5,5,10,10,25,15,20,20};
		System.out.println("This candidate is "+ new Candidates(120, questions3).isQualified());
		
		//disqualified
		int[] questions4 = {5,5,10,10,15,15,20};
		System.out.println("This candidate is "+ new Candidates(120, questions4).isQualified());
		
		//disqualified
		int[] questions5 = {5,5,10,10,15,15,20,20};
		System.out.println("This candidate is "+ new Candidates(130, questions5).isQualified());
	}

}
