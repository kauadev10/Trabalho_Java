/******************************************************************************
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
    Data: 16 de março de 2026
    Descritivo: Escreva um programa que ordene um array de números em ordem crescente
 *******************************************************************************/


// Importa a classe Arrays para ordenar o array
import java.util.Arrays;

// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Cria um array para armazenar 5 números inteiros
        int[] numeros = new int[5];

        // Mensagem para o usuário
        System.out.println("Digite 5 números:");

        // Loop para ler os 5 números digitados
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt(); // Guarda o número no array
        }

        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        // Mostra a mensagem de saída
        System.out.println("Números em ordem crescente:");

        // Loop para exibir os números já ordenados
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Fecha o Scanner
        sc.close();
    }
}