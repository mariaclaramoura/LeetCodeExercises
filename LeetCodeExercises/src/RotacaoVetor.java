
public class RotacaoVetor {
	
	public static void main (String [] args) {
		
		int m [] = {1, 2, 3};
		int ultimo;
		int n = 2;
		

		
		for(int i = 0 ; i < n; i++) {
			
			ultimo = m[m.length - 1];
			
			for(int j = m.length - 1; j > 0; j--) {
				
				m[j] = m[j - 1];
			}
			
			m[0] = ultimo;
		}
		
		System.out.println(""+ m[0]+ " " +m[1]+ " " + m[2]);
	
	}
}
