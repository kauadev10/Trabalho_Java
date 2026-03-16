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
Descritivo: Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir esses atributos.
*******************************************************************************/

public class exercicio11 {

    static class Pessoa {
        String nome;
        int idade;

        void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Wendel";
        pessoa1.idade = 19;

        pessoa1.exibirDados();
    }

    /*
        Explicação do codigo:
        
        Este programa cria uma classe chamada Pessoa que possui dois atributos: nome e idade.
        Esses atributos servem para guardar informações básicas sobre uma pessoa.
        
        Dentro da classe também foi criado um método chamado exibirDados(), que é responsável
        por mostrar na tela o nome e a idade armazenados no objeto.
        
        No método main é criado um objeto da classe Pessoa chamado pessoa1.
        Depois disso, são atribuídos valores para os atributos nome e idade.
        Por fim, o método exibirDados() é chamado para mostrar essas informações na tela.
        
        Dessa forma o programa demonstra de maneira simples como criar uma classe,
        definir atributos e utilizar um método para exibir os dados armazenados.
    */
}