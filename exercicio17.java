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
Descritivo: Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo. 
O programa deve dar dicas ("maior" ou "menor") até o acerto.
*******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;

        while (palpite != numeroSecreto) {

            System.out.print("Tente adivinhar o número de 1 a 100: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } 
            else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } 
            else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        }

        scanner.close();
    }
}

/*
Explicação:

Quando o programa começa, o computador sorteia um número aleatório entre 1 e 100.
Depois disso, o usuário começa a tentar adivinhar esse número.

Cada vez que o usuário digita um palpite, o programa compara com o número sorteado.
Se o palpite for menor, o programa avisa que o número secreto é maior.
Se for maior, ele avisa que o número secreto é menor.

O programa continua pedindo números dentro do laço while até o usuário acertar.
Quando acerta, aparece a mensagem de parabéns e o jogo termina.
*/