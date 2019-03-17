import java.util.Scanner;
public class Lista01_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        int diarias = scan.nextInt();
        double valor;
        System.out.println(nome);
        if(diarias>15) valor = 60 + diarias*5.5;
        else if(diarias == 15) valor = 60 + diarias*6;
        else valor = 60 + diarias*8;
        System.out.println(valor);
    }
}
