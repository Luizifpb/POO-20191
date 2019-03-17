import java.util.Scanner;
public class Lista01_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int menor;
        int maior;
        int controle;
        int pares=0;
        int impares=0;
        if (num1 < num2) {
            menor = num1;
            maior= num2;
        }
        else {
            menor = num2;
            maior = num1;
        }
        controle=menor;
        while(true){
            controle+=1;
            if (controle%2==1) impares++;
            else pares++;
            if (controle+1==maior) break;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: "+impares);
        System.out.println("Soma: " +(menor+maior) );
    }
}
