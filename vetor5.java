/* Faça um programa que permita que o usuário digite o nome de uma banda musical e insira o nome de 3 músicas 
dessa banda, as músicas deverão ser armazenadas e no final o programa deverá mostrar a seguinte mensagem:
NomeDaBanda    Musica1    Musica2      Musica3 */ 
import java.util.Scanner;
public class vetor5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Crie uma seleção de músicas da sua banda preferida.");
        System.out.println("Digite o nome da banda desejada: ");
        String banda = leitor.nextLine();
        String musicas[] = new String[3];

        for (int i = 0; i < musicas.length; i++){
            int indice = i + 1;
            System.out.println("Insira a "+indice+"ª música da banda "+banda+": ");
            musicas[i] = leitor.nextLine();
        }
        
        System.out.println("\nEssa foi a seleção que você escolheu: \n");
        System.out.println("\n"+banda+"\n");
        for (int i = 0; i < musicas.length; i++){
            System.out.println(musicas[i]);
        }
    }    
}