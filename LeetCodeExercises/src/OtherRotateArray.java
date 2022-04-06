public class OtherRotateArray {
	
	public static int[] reverso(int v[], int inicio, int fim) {
		
		int guardar;
		
		while (inicio < fim) {
			
			guardar = v[inicio];
			v[inicio] = v[fim];
			v[fim] = guardar;
			
			inicio++;
			fim--;
		}
		
		return v;
	}
	
	public static int[] rotacionar(int v[], int vezesRot) {
		
		reverso(v, 0, v.length - 1);
		reverso(v, 0, vezesRot - 1);
		reverso(v, vezesRot, v.length - 1);
		
		return v;
	}
	
	public static void main (String[] args) {
		
		int m[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < m.length; i++) {
					
					System.out.println(m[i]);
				}
		
		System.out.println("\n _________");
		
		rotacionar(m, 3);
		
		for(int i = 0; i < m.length; i++) {
					
					System.out.println(m[i]);
				}
	}

}
