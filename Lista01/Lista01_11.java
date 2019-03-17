import java.util.Scanner;
public class Lista01_11 {
    public static void main(String[] args) {
        System.out.println("Vai levar quantos produtos: ");
        Scanner scan = new Scanner(System.in);
        double valorapagar=0;
        int pedidos = scan.nextInt();
        for (int i=0;i<pedidos;i++){
            System.out.println("codigo do pedido: ");
            int codigo = scan.nextInt();
            System.out.println("quantidade: ");
            int quantidade = scan.nextInt();
            if (codigo==10) valorapagar+=quantidade*1.5;
            else if(codigo==11) valorapagar+=quantidade*1.8;
            else if(codigo==12) valorapagar+=quantidade*1.9;
            else if(codigo==20) valorapagar+=quantidade*10;
            else if(codigo==30) valorapagar+=quantidade*8;
            else if (codigo==50) valorapagar+=quantidade*2.5;
        }
        if (valorapagar>50) valorapagar-=valorapagar*0.05;
        System.out.println("Seu lanche deu um total de: "+valorapagar+" R$");
    }
}
