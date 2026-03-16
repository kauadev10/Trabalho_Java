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
Descritivo: Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e exiba o resultado com a classificação correspondente.
*******************************************************************************/

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite seu peso em kg: ");
        peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        scanner.close();
    }

    /*
        Explicação do codigo:
        
        Este programa calcula o IMC (Índice de Massa Corporal) a partir do peso e da altura informados pelo usuário.
        Primeiro é utilizado o Scanner para permitir que o usuário digite os valores pelo teclado.
        
        O programa solicita o peso em quilogramas e a altura em metros, armazenando esses valores em variáveis.
        Em seguida é feito o cálculo do IMC utilizando a fórmula: peso dividido pela altura ao quadrado.
        
        Depois de calcular o valor do IMC, o resultado é exibido na tela.
        Logo após, uma estrutura de decisão com vários if e else if é utilizada para verificar em qual faixa
        o valor do IMC se encaixa, mostrando assim a classificação correspondente, como abaixo do peso,
        peso normal, sobrepeso ou algum grau de obesidade.
        
        Dessa forma o programa consegue calcular o IMC e também informar ao usuário em qual classificação ele se encontra.
        OBS: Na hora de colocar a altura precisa utilizar a virgula para separar, por exemplo "1,70"
        */
}