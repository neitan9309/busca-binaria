//Créditos para o dono do canal "Bro Code", que eu sempre recorro para procurar meus cursos (gratuitos) de programação.
//Link para o vídeo sobre estrutura de dados e algorítmos: https://youtu.be/CBYHwZcbD-s?si=NSHDQx0HUmC6M3XZ

package BinarySearch;

public class Main{
	
	public static void main(String[] args) {
		
		int array[] = new int[100000]; //Criação de uma array com 100.000 posições.
		int target = 44002; //Alvo da busca.
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		} //Laço que preenche todas as posições da array.
		
		int index = binarySearch(array, target); //Criação de um variável que levará o resultdo do método de busca binária.
		
		if(index == -1) {
			System.out.println(target + " não encontrado");
		} //Resposta para caso o algoritmo não ache o número alvo.
		else {
			System.out.println("Elemento encontrado em: " + index);
		}
		
	}
	
	private static int binarySearch(int[] array, int target) {
		
		int low = 0; //Início do intervalo de busca.
		int high = array.length - 1; //Fim do intervalo de busca.

		while(low <= high) { //Laço while que roda enquanto tiver números válidos no intervalo da busca.
			
			int middle = low + (high - low) / 2; //Cálculo para achar o index que corresponde ao meio da array.
			int value = array[middle];
			
			System.out.println("Meio: " + value); //Impressão que nos ajuda a mapear em quantos passos o algoritmo achou o alvo.
			
			if(value < target) low = middle + 1; //Se o valor do alvo for maior que o valor "meio", o indíce que
												//estamos procurando só pode estar na metade superior da array.
												//Definimos então um novo "início de intervalo" e consequentemente
												//descartamos a primeira metada da array.
			
			else if(value > target) high = middle - 1; //Então se o valor do alvo for menor que o valor "meio", definimos um novo
													  //"fim do intervalo", descartando assim, a segunda metade da array.
			
			else return middle;//Condicional acionada caso o valor "meio" for o alvo que estamos procurando.
		}
		
		return -1;
	}
}

