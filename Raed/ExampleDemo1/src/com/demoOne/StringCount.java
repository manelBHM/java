package com.demoOne;

public class StringCount {

	public static void main(String[] args) {
		 
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33."; 
		count(test);
 
	 

	}

	@SuppressWarnings("deprecation")
	private static void count(String s) {
		char[] ch = s.toCharArray();
		int space  =0;
		int letter =0;
		int numbers =0;
		int others =0;
		int whitespace =0;
		
		//iterate through the x array
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isSpaceChar(ch[i])){
				space++;
			}else if(Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isDigit(ch[i])) {
				numbers++;
				
			}else if (Character.isWhitespace(ch[i])){
				whitespace++;
			}else {
				others++;
			}
	
		}
		System.out.println(" space : " + space);
		System.out.println(" space : " + letter);
		System.out.println(" space : " + numbers);
		System.out.println(" space : " + others);

	}

 

}
