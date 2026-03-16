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
    25001126-2 - Eric Ruthes
Data: 16 de março de 2026
Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.
*******************************************************************************/

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }

    /*
        Explicação do codigo:
        
        Este programa lê 5 números digitados pelo usuário e os guarda dentro de um array.
        Primeiro é utilizado o Scanner para permitir a entrada de dados pelo teclado.
        Em seguida é criado um array chamado "numeros" com espaço para armazenar 5 valores inteiros.
        Um laço for é utilizado para pedir que o usuário digite os números, e cada valor digitado é guardado em uma posição do array.
        Depois disso, outro laço for percorre o array novamente, exibindo todos os números que foram digitados anteriormente.
        Dessa forma o programa consegue armazenar e depois mostrar todos os valores informados pelo usuário.
    */
}