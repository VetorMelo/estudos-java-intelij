import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("Hello World!");
        System.out.println("argumento 1:" + args[0]);
        System.out.println("argumento 2:" + args[1]); */

        //estudando padroes de desenvolvimento e conceitos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}
