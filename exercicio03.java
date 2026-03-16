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
Descritivo: Escreva um programa que calcule a média de três notas fornecidas pelo usuário.
*******************************************************************************/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }

    /*
        Explicação do codigo:
        
        Este programa calcula a média de três notas informadas pelo usuário.
        Primeiro é utilizado o Scanner para permitir a leitura de dados digitados no teclado.
        Em seguida o programa pede que o usuário digite três notas, que são armazenadas nas variáveis nota1, nota2 e nota3.
        Depois disso é feito o cálculo da média, somando as três notas e dividindo o resultado por 3.
        Por fim, o valor da média é exibido na tela para o usuário.
    */
}