package ac_01;

public class Metodos {
	
	// Cria��o dos metodos com retorno int
	
	
	//Metodo que percorre o array e retorna o menor n�mero, e utiliza o primeiro item do array para a verfica��o
	public int menor ( int a[]) {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b>=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	//Metodo que percorre o array e retorna o maior n�mero, e utiliza o primeiro item do array para a verfica��o
	public int maior ( int a[]) {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b<=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	// Metodo que percorre cada elemento do array e acumula em uma variavel soma
	public int soma (int a[]) {
		
		int soma = 0;
		
		for(int i=0;i<a.length;i++) {
			soma = soma+a[i];
			
		}
		
		return soma;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
