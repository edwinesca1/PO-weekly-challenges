package textTwist;

public class TextTwistDriver {

	public static void main(String[] args) {
		
		String[] str = new String[] {"cat","create","sat"};
		System.out.println("Points scored: " + new TextTwistLogic( "caster", str).pointScored());
		
		String[] str1 = new String[] {"trance","recant"};
		System.out.println("Points scored: " + new TextTwistLogic( "recant", str1).pointScored());
		
		String[] str2 = new String[] {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
		System.out.println("Points scored: " + new TextTwistLogic( "tossed", str2).pointScored());
		
		String[] str3 = new String[] {"alerts", "stelar", "talers", "alters"};
		System.out.println("Points scored: " + new TextTwistLogic( "aelrst", str3).pointScored());
	}
}
