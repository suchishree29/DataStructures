package string;

public class URLify {
	
	char[] removeSpaces(char[] str, int truelength){
		int spaceCount = 0,index = 0;
		for(int i = 0; i< truelength; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}
		
		index = truelength + spaceCount * 2;
		if(truelength < str.length) str[truelength] = '\0';
		for(int i = truelength-1; i>=0; i--){
			if(str[i] == ' '){
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index = index -3;
			}else{
				str[index-1] = str[i];
				index--;
			}
		}
		return str;
	}
	

	public static void main(String[] args) {
		
		URLify url = new URLify();
		String s = "Mr John Smith    ";
		char[] chrArr = s.toCharArray();
		System.out.println(url.removeSpaces(chrArr,13));
	}

}
