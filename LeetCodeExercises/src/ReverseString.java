public class ReverseString {
	
	public static char[] StringReversa(char[] s) {
		
		char [] a = new char[s.length];
		int cont = 0;
		
		for(int i = 0; i < s.length; i++){
			
			a[i] = s[i];
		}
		
		for(int i = s.length - 1; i >= 0; i--) {
			
			s[cont++] = a[i];
		}
		
		
		return s;
	}
	

	
	public static void main (String[] args) {
		
		 String palavra = "Hello";
		 char[] s = palavra.toCharArray();
		 
		 for(int i = 0; i < s.length; i++) {
			 
			 System.out.print(s[i]);
			 
			 if(i == s.length - 1) {
				 
				 System.out.print("\n");
			 }
		 }
		 
		 StringReversa(s);
		 
		 for(int i = 0; i < s.length; i++) {
					 
					 System.out.print(s[i]);
					 
					 if(i == s.length - 1) {
						 
						 System.out.print("\n");
					 }
				 }
		 
		 System.out.print(s.toString());
		 
		 
	}
}
