public class ReverseInteger {
	
	public static int reversoInt(int num) {
		
		String numero = Integer.toString(num);
		char [] a = numero.toCharArray();
		char [] copia = new char[a.length];
		int contador = 0;
		int outroContador = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] != 0) {
				
				copia[contador] = a[i];
				contador++;
			}
		}
		
		for(int i = contador - 1; i >= 0; i--) {
			
			a[outroContador++] = copia[contador];
		}
		
		numero = a.toString();
		num = Integer.parseInt(numero);
		
		return num;
		
	}
	
	public static void main (String [] args) {
		
		int x = 165;
		
		System.out.println(reversoInt(x));
	}

}
