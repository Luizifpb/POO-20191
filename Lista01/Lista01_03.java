import java.util.Scanner;
public class Lista01_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double prova1 = scan.nextDouble();
        double prova2 = scan.nextDouble();
        double prova3 = scan.nextDouble();
        double formula = (prova1*2 + prova2*3 + prova3*5)/10;
        System.out.println(formula);
    }
}
