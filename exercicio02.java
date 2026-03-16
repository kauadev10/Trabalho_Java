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
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.
*******************************************************************************/


import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();
    }
}

/*
Explicação:

O programa pede para o usuário digitar um número inteiro. 
Depois ele usa o operador % (resto da divisão) para dividir o número por 2.
Se o resto for 0, o número é par. Se for diferente de 0, o número é ímpar.
*/