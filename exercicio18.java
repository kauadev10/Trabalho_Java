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
Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
*******************************************************************************/

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String texto;
        int quantidadePalavras;

        System.out.print("Digite uma frase: ");
        texto = scanner.nextLine();

        String[] palavras = texto.split(" ");

        quantidadePalavras = palavras.length;

        System.out.println("Quantidade de palavras: " + quantidadePalavras);

        scanner.close();
    }

    /*
        Explicação do codigo:
        
        Este programa conta quantas palavras existem em uma frase digitada pelo usuário.
        Primeiro é utilizado o Scanner para permitir que o usuário escreva um texto pelo teclado.
        
        Depois que a frase é lida, o método split(" ") é utilizado para separar o texto sempre que
        aparece um espaço. Cada parte separada passa a ser considerada uma palavra e é armazenada
        dentro de um array chamado "palavras".
        
        Em seguida, é utilizada a propriedade length do array para descobrir quantas palavras foram
        armazenadas nele.
        
        Por fim, o programa mostra na tela a quantidade de palavras encontradas na frase que o usuário digitou.
    */
}