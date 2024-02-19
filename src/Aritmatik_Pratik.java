import java.util.Scanner;

public class Aritmatik_Pratik {
    //Pratik- Aritmatik İşlemler --- İşlem Önceliği
    public static void main(String[] args) {


        long a, b, c,d;

        Scanner input = new Scanner(System.in);

        System.out.println("Sırasıyla a, b ve c değerini giriniz :");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        d= a+b*c-b;

        System.out.println("Sonuc :" + d);
    }
}
