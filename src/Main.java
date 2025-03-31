import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        System.out.println("argumento 1:" + args[0]);
        System.out.println("argumento 2:" + args[1]);

        //estudando padroes de desenvolvimento e conceitos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);

        var scanner = new Scanner(System.in);
        System.out.println(" Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir?  (%s) \n", canDrive);

        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);


        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome");
        var name = scanner.next();
        System.out.println("Informe o seu nao de nascimento");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá %s você tem %s anos \n", name, age);*/

        //Estudando estrutura condicional com if
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        var name = scanner.next();
        System.out.println("Informe sua idade");
        var age = scanner.nextInt();

        if (age >= 18) System.out.printf("%s tem %s anos, você pode dirigir \n", name, age);

        System.out.println("Fim do programa");


    }
}
