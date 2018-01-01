
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = -1;
        boolean contains = false;        
        //if(s.isEmpty() || s == " ") return 0;
        
        if(s.isEmpty() || s.trim().length() == 0) return 0;
        
        s = s.trim();
        
        
        for(int i = s.length()-1; i>=0;i--) {
        		System.out.println("i is "+ i + " Char at i:   " + s.charAt(i));
        		length++;
        		if(s.charAt(i) == ' ') {
        			System.out.println("Length inside loop is"+length);
        			contains = true;
        			break;
        			
        		}
        }
        
        return contains == true ? length:s.trim().length();
    }
    
    public static void main(String[] args) {
    		lengthOfLastWord lw = new lengthOfLastWord();
    		System.out.println(lw.lengthOfLastWord("hello world "));
    }
}
