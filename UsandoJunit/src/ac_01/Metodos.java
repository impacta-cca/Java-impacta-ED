package ac_01;

public class Metodos {
	
	// Cria��o dos metodos com retorno int
	
	int a[] = {940, 880, 830, 790, 750, 660, 650, 590, 510,940};
	//Metodo que percorre o array e retorna o menor n�mero, e utiliza o primeiro item do array para a verfica��o
	public int menor ()  {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b>=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	//Metodo que percorre o array e retorna o maior n�mero, e utiliza o primeiro item do array para a verfica��o
	public int maior ( ) {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b<=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	// Metodo que percorre cada elemento do array e acumula em uma variavel soma
	public int soma () {
		
		int soma = 0;
		
		for(int i=0;i<a.length;i++) {
			soma = soma+a[i];
			
		}
		
		return soma;
		
		
	}
	
	public int contar(int num) {
		int contador = 0;
		
		for (int i=0;i<a.length;i++) {
			if(a[i]==num) {
				contador+=1;
			}
		}
		
		return contador;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
