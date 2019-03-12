import java.util.Scanner;
public class Lista0108 {
    public static void main(String[] args) {
        int maior,menor,acumulador=0;
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        for(int i=0;i<10;i++) {
            numeros[i] = scan.nextInt();
        }
        maior = numeros[0];
        menor = numeros[0];
        for(int i=0;i<10;i++){
            if (numeros[i]>maior) maior = numeros[i];
            if (numeros[i]<menor) menor = numeros[i];
            acumulador += numeros[i];
        }
        double media = acumulador/10;
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media);
    }
}
