/* Faça um programa que receba de lista de compras, sendo que o usuário irá inserir a quantidade de 
itens que quer adicionar na lista de compras e após inserir a quantidade o programa deverá permitir 
que o usuário insira os produtos nessa lista. Exiba a lista completa para o usuário. */

import java.util.Scanner;
public class vetor4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos itens você quer inserir? ");
        int qtdItens = leitor.nextInt();
        String[] itens = new String[qtdItens];
        
        for(int i = 0; i < itens.length; i++) {
            int indice = i + 1; 
            System.out.println("Insira o "+indice+"º item à lista: ");
            itens[i] = leitor.next();
        }
        System.out.println("\nLista de compras: \n");

        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i]);
        }
    }
}