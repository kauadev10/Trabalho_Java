/**************************
    Curso: Engenharia de Software
    Disciplina: análise e projeto orientado a objeto 
    Professor: Flores
    Turma: ESOFT-3B
    Componentes:
        25061077-2 - Kauã Ricardo Gomes Fagundes
        25145454-2 - Gustavo Silva Rodrigues 
        25004001-3 - Rafael Diesel2
        25229846-2 - Wendel Souza Cardoso
        25228676-2 - Marlon Willian Silva Barros
        25054416-2 - Pedro Henrique Campos de Azevedo 
        25165088-2 - Vinicius Bastos Rodrigues
        25178065-2 - Marcos Barcelar
        22001126-2 - Eric Ruthes
    Data: 15 de março de 2026
    Descritivo: Criar uma calculadora simples de quatro operações (+ - * /)
 ****************************/

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {
        Calcular();
    }

    public static void Calcular() {


        int num1, num2, resultado;
        char operacao;

        Scanner x = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = x.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = x.nextInt();

        System.out.println("Digite a operação (+, -, *, /): ");
        operacao = x.next().charAt(0);

        switch (operacao) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
            }
            default -> {
                System.out.println("Operação inválida!");
                return;
            }
        }
        System.out.println("O resultado é: " + resultado);
    }

//1. cirei a classe exercicio09 e o método main para iniciar a execução do programa.
//2. criei o método Calcular para realizar as operações da calculadora.
//3. declarei as variáveis num1, num2, resultado e operacao para armazenar os valores e a operação escolhida pelo usuário.
//4. utilizei a classe Scanner para ler os inputs do usuário.
//5. solicitei ao usuário que digite os dois números e a operação desejada.
//6. utilizei um switch para realizar a operação escolhida pelo usuário e calcular o resultado.
//7. adicionei um tratamento para divisão por zero e para operações inválidas.
//8. por fim, exibi o resultado da operação para o usuário.
}