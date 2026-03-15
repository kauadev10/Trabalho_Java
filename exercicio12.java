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
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um 
atributo matricula.
*******************************************************************************/

public class exercicio12 {
    static class Pessoa {
        //atributos
        String nome;
        int idade;

        //construtor
        Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        //metodo
        public void mostrarDados(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    static class Aluno extends Pessoa{
        //atributos
        String matricula;
        
        //construtor
        Aluno(String nome, int idade, String matricula){
            super(nome, idade);
            this.matricula = matricula;
        }
        
        //metodo
        public void mostrarAluno(){
            mostrarDados();
            System.out.println("Matricula: " + matricula);
        }
    }
    public static void main(String[] args){
        Aluno aluno = new Aluno("Vinicius", 20, "1234");

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Idade do aluno: " + aluno.idade);
        System.out.println("Matricula do aluno: " + aluno.matricula + "\n\n+======================================+\n");

        Aluno aluno2 = new Aluno("Pedro", 20, "1235");

        System.out.println("Nome do aluno: " + aluno2.nome);
        System.out.println("Idade do aluno: " + aluno2.idade);
        System.out.println("Matricula do aluno: " + aluno2.matricula);
    }

    /*
        Explicação do codigo:

        O programa demonstra o uso de herança na programação orientada a objetos em Java.
        Primeiramente é criada a classe Pessoa, que possui os atributos nome e idade,
        além de um construtor para inicializar esses valores e um método para exibir
        essas informações.

        Em seguida é criada a classe Aluno, que herda as características da classe
        Pessoa utilizando a palavra-chave "extends". Além dos atributos herdados,
        a classe Aluno adiciona um novo atributo chamado matricula. O construtor da
        classe Aluno utiliza o comando "super" para chamar o construtor da classe
        Pessoa e inicializar os atributos nome e idade.

        No método main é criado dois objetos da classe Aluno, passando valores para
        nome, idade e matrícula. Como Aluno herda de Pessoa, ele pode acessar
        os atributos da classe base e também o atributo próprio. Por fim, os dados
        dos alunos são exibidos na tela.
    */
}