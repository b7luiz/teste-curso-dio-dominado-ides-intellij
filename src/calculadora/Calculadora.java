package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a=scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b=scan.nextInt();

        int somar = somar(a, b);
        int subt = subt(a, b);
        int mult= subt(a,b);
        double div = div(a,b);

        System.out.println("Somar: "+somar);
        System.out.println("Subtrair" +subt);
        System.out.println("Multiplicar: "+mult);
        System.out.println("Dividir: "+div);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subt(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return a / b;
    }
}
