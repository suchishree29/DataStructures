package string;

public class StringRotation {
	
	boolean stringRotation(String s1, String s2){
		
		if(s1.length() == s2.length() && s1.length() > 0){
			String s1s1 = s1 + s1;
			//return s1.substring(s1s1, s2);
		}
		return false;
	}

	public static void main(String[] args) {
		StringRotation sr = new StringRotation();
		System.out.println(sr.stringRotation("waterbottle", "erbottlewat"));

	}

}
