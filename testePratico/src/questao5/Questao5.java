package questao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int recuo = palavra.length() - 1;

        if (!palavra.isEmpty()) {
            for (int i = 0; i <= palavra.length() - 1; i++) {
                System.out.print(palavra.charAt(recuo));
                recuo--;

            }
        }
    }
}
