import java.util.Scanner;
public class Lista01_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double formula = (nota + nota2 + nota3 + nota4)/4;
        if(formula>=7){
            System.out.println("Aprovado");
        }
        else if(formula>=5){
            System.out.println("Prova Final");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
