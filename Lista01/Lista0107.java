import java.util.Scanner;
public class Lista0107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        if (nota<50) System.out.println("Insuficiente");
        else if (nota<65) System.out.println("Regular");
        else if (nota<85) System.out.println("Bom");
        else System.out.println("Ótimo");
    }
}
