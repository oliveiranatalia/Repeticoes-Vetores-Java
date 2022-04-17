//Ler um valor N e imprimir todos os valores pares entre 1 (inclusive) e N (inclusive).
//Considere que o N será sempre maior que ZERO. - usando while
import java.util.Scanner;
public class exercicio04WhileIf {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n----------------------------\n        números pares         \n----------------------------\n");
        System.out.println("Insira um número: ");
        int num = leitor.nextInt();
        int i = 1;
        while(num >= i){
            System.out.println(i);
            i++;
            if (i % 2 != 0) {
                i++;
            }
        }
    }
}
