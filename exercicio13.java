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
        22001126-2 - Eric Ruthes
    Data: 16 de março de 2026
    Descritivo: Escreva um programa que define uma interface Veiculo com metodos acelerar() e frear(), e implemente essa interface em uma classe Carro.
 *******************************************************************************/

public class exercicio13 {

    public static void main(String[] args) {

        // Cria um objeto da classe Carro
        Carro carro = new Carro();

        // Chama o método acelerar
        carro.acelerar();

        // Chama o método frear
        carro.frear();

    }
}