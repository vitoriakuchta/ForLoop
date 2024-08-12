import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //for (int i = 0; i <= 100; i++, i++)
        //    System.out.print(i + " ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();
        for (int i = 0; i < palavra.length(); i++)
            System.out.print(palavra.charAt(i) + " ");
    }
}