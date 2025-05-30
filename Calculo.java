   import java.util.Scanner;

   public class Calculo {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int n1, n2;
           double media;

           System.out.print("Digite o número 1: ");
           n1 = scanner.nextInt();

           System.out.print("Digite o número 2: ");
           n2 = scanner.nextInt();

           media = (n1 + n2) / 2.0;
           System.out.printf("A média é: %.2f%n", media);
           scanner.close();
       }
   }
   