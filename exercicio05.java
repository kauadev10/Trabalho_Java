public class exercicio05 {
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
    Descritivo: Escreva um programa que exiba apenas os números pares de 1 a 20.
    *******************************************************************************/
    public static void main(String[] args){
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
        Explicação do codigo:
        
        Este programa exibe os números pares de 1 a 20.
        Um laço for é utilizado para percorrer os números de 1 até 20.
        A cada repetição é feita uma verificação usando o operador de porcentagem (%) que verifica o resto de uma divisão.
        Se o resto da divisão do número por 2 for igual a 0, significa que onúmero é par, então ele é exibido na tela.
    */
}