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
    Descritivo: escreva um programa que solicite um numero inteiro e exiba sua tabuada de multiplicação de 1 a 10
 ***************************/

import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
/********************************************
  19 - Aqui voce importa a classe Scanner, que é usada para ler a entrada do usuário.
     21 - Você define a classe principal do programa, chamada exercicio14.
     22 - O método main é o ponto de entrada do programa.
     23 - Você cria um objeto Scanner para ler a entrada do usuário.
     24 - Você solicita ao usuário que digite um número inteiro e armazena esse número na variável numero.
     25 - Você imprime uma mensagem indicando que a tabuada do número será exibida.
     26-28 - Você usa um loop for para iterar de 1 a 10, calculando e imprimindo o resultado da multiplicação do número pelo índice i em cada alteração.
     29 - Você fecha o scanner para liberar os recursos associados a ele.

 */