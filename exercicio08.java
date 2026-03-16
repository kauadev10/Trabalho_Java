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
Descritivo: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
*******************************************************************************/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String texto;
        int contador = 0;

        System.out.print("Digite uma palavra ou frase: ");
        texto = scanner.nextLine();

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        scanner.close();
    }

    /*
        Explicação do codigo:
        
        Este programa conta quantas vogais existem em uma palavra ou frase digitada pelo usuário.
        Primeiro é utilizado o Scanner para permitir que o usuário digite um texto pelo teclado.
        Depois que o texto é lido, ele é convertido para letras minúsculas para facilitar a verificação das vogais.
        Em seguida, um laço for percorre cada caractere da string utilizando o método length() para saber o tamanho do texto.
        A cada posição é verificado se a letra é uma vogal (a, e, i, o ou u). Quando for, o contador é incrementado.
        Ao final do processo, o programa mostra na tela quantas vogais foram encontradas no texto digitado.
    */
}