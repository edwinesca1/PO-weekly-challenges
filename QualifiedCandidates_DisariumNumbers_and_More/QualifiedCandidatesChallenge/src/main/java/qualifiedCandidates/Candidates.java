package qualifiedCandidates;

public class Candidates {
	private int interviewDuration;
	private int[] answers;
	private String candidate;
	
	public Candidates(int timeValue, int[] answers) {
		super();
		this.interviewDuration = timeValue;
		this.answers = answers;
		this.candidate = "qualified";
		
	}
	
	public String isQualified() {
		
		//Verify if the candidate solved all of the questions
		if(answers.length < 8) {
			candidate = "disqualified";
			return candidate;
		}
		
		//verify the candidate completed the questions in time
		if(interviewDuration > 120){
			candidate = "disqualified";
			return candidate;
		}
		
		//verify the time for each question
		for(int i = 0; i < answers.length; i++) {
			
			if(answers[i] > 5 && i < 2) {
				candidate = "disqualified";
			}else if(answers[i] > 10 && i < 4) {
				candidate = "disqualified";
			}else if(answers[i] > 15 && i < 6) {
				candidate = "disqualified";
			}else if(answers[i] > 20) {
				candidate = "disqualified";
			} 
			
		}
		return candidate;
	}

}
