package regexPINValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
	
	private String PIN;
	private boolean isValid;
	private final Pattern pattern = Pattern.compile("^([0-9]{4}|[0-9]{6})$");

	
	public RegexValidator(String PIN) {
		super();
		this.PIN = PIN;
		this.isValid = false;
	}
	
	public boolean isValidPIN() {
		
		Matcher matcher = pattern.matcher(PIN);
		
		isValid = matcher.find();
		
		return isValid;
	}
}
