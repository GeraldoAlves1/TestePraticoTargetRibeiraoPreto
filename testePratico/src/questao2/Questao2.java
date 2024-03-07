package questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o número: ");
        int valor = sc.nextInt();

        VerificarFibonacci verificarFibonacci = new VerificarFibonacci();
        if (verificarFibonacci.fibonacci(valor)) {
            System.out.println(valor + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println(valor + " não pertence a sequência de Fibonacci.");
        }



        sc.close();
    }
}
