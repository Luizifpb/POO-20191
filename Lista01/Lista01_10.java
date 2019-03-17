import java.util.Scanner;
public class Lista01_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        while(true){
            num/=2;
            if(num<1) break;
        }
        System.out.println(num);
    }
}

