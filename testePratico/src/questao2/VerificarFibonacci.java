package questao2;

public class VerificarFibonacci {

    public boolean fibonacci(int valor) {
        //Valores que iniciam a sequencia
        int x = 0, y = 1;

        while (x <= valor) {
            if (x == valor) {
                return true;
            } else {
                int temporario = x;
                x = y;
                y = temporario + y;
            }

        }
        return false;
    }
}
