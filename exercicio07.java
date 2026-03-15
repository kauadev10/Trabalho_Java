/**************************
    Curso: Engenharia de Software
    Disciplina: análise e projeto orientado a objeto 
    Professor: Flores
    Turma: ESOFT-3B
    Componentes:
        25061077-2 - Kauã Ricardo Gomes Fagundes
        25145454-2 - Gustavo Silva Rodrigues 
        25004001-3 - Rafael Diesel
        25229846-2 - Wendel Souza Cardoso
        25228676-2 - Marlon Willian Silva Barros
       25054416-2 - Pedro Henrique Campos de Azevedo 
        25165088-2 - Vinicius Bastos Rodrigues
        25178065-2 - Marcos Barcelar
        22001126-2 - Eric Ruthes
    Data: 05 de março de 2026
    Descritivo: Encontre o maior número em um array
 ***************************/
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
/********************************************
 19 - Aqui voce importa a classe Scanner, que é usada para ler a entrada do usuário.
    21 - Você define a classe principal do programa, chamada exercicio7.
    22 - O método main é o ponto de entrada do programa.
    23 - Você cria um objeto Scanner para ler a entrada do usuário.
    25 - Você declara um array de inteiros chamado numeros com um tamanho de 5
    27-31 - Você usa um loop for para solicitar ao usuário que digite 5 números, armazenando cada número no array numeros.
    33 - Você inicializa a variável maior com o primeiro elemento do array numeros.
    34-38 - Você usa outro loop for para percorrer o array numeros a partir do segundo elemento, comparando cada número com a variável maior. Se um número for maior que maior, você atualiza maior com esse número.
    39 - Você imprime o maior número encontrado.

 */