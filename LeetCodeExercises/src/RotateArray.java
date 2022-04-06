public class RotateArray {
	
	public static int[] Rotate(int [] v, int quantRot ) {
		
		int ultimo;
		
		for(int i = quantRot; i > 0; i--) {
			for(int j = v.length - 1; j > 0; j--) {
				ultimo = v[j];
				v[j] = v[j - 1];
				v[j -1] = ultimo;
			}
		}
		
		return v;
		
	}

	public static void main(String[] args) {
		
		int m[] = {4, 3, 5, 1, 2};
		
		Rotate(m, 1);
		
		for(int i = 0; i < m.length; i++) {
			
			System.out.println(m[i]);
		}
	
	}

}
