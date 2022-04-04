/* Faça um programa de lista de chamada que armazene o nome de
10 alunos e apresente a lista completa para o usuário */
import java.util.Scanner;
public class vetor2 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        String[] chamada = new String[10];
        
        System.out.println("Lista de chamada. Insira o nome de 10 alunos(as) abaixo.\n");

        for(int i = 0; i < chamada.length; i++){
            int indice = i + 1;
            System.out.print("Digite o nome do(a) "+indice+"° aluno(a): ");
            chamada[i] = nome.nextLine();
        }
        
        System.out.println("\n Lista inserida: \n");

        for (int i = 0; i < chamada.length; i++) {
            System.out.println("Nome: "+chamada[i]);
        }
    }
}