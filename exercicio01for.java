//Faça um programa que mostre os números pares até 100 - usando estrutura de repetição for
public class exercicio01for {
    public static void main(String[] args) {
        System.out.println("\n----------------------------\n        números pares         \n----------------------------\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}