import java.util.Scanner;
/******************************************************************************
 * CURSO: Engenharia de Software
 * DISCIPLINA: Análise e Projeto Orientado a Objetos
 * PROFESSOR: Flores
 * TURMA: ESOFT-3B
 *
 * COMPONENTES:
 * 25061077-2 - Kauã Ricardo Gomes Fagundes
 * 25145454-2 - Gustavo Silva Rodrigues
 * 25004001-3 - Rafael Diesel
 * 25229846-2 - Wendel Souza Cardoso
 * 25228676-2 - Marlon Willian Silva Barros
 * 25054416-2 - Pedro Henrique Campos de Azevedo
 * 25165088-2 - Vinicius Bastos Rodrigues
 * 25178065-2 - Marcos Barcelar
 * 22001126-2 - Eric Ruthes
 *
 * DATA: 05 de março de 2026
 * EXERCÍCIO: 04 - Conversão de Temperatura
 ******************************************************************************/

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("A temperatura de " + celsius + "°C equivale a " + fahrenheit + "°F.");

        scanner.close();
    }
}

/*
EXPLICAÇÃO:
O programa solicita ao usuário um valor de temperatura em graus Celsius.
Em seguida, aplica a fórmula de conversão para Fahrenheit (F = C * 9/5 + 32).
Após realizar o cálculo, o programa exibe na tela o valor convertido.
*/