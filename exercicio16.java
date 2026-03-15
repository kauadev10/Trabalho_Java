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
 * EXERCÍCIO: 16 - Validador de Senha
 ******************************************************************************/

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha para validar: ");
        String senha = scanner.nextLine();

        boolean tamanhoValido = senha.length() >= 8;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
        }

        if (tamanhoValido && temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha válida! Atende a todos os critérios.");
        } else {
            System.out.println("Senha inválida. Critérios pendentes:");
            if (!tamanhoValido) System.out.println("- Mínimo de 8 caracteres.");
            if (!temMaiuscula) System.out.println("- Uma letra maiúscula.");
            if (!temMinuscula) System.out.println("- Uma letra minúscula.");
            if (!temNumero) System.out.println("- Um número.");
        }

        scanner.close();
    }
}

/*
EXPLICAÇÃO:
O programa solicita ao usuário uma senha. Em seguida, percorre cada caractere
da senha utilizando um laço for. Durante essa verificação, o programa identifica
se a senha possui no mínimo 8 caracteres, pelo menos uma letra maiúscula,
uma letra minúscula e um número. Ao final da verificação, o programa informa
se a senha é válida ou mostra quais critérios não foram atendidos.
*/