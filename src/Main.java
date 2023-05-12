import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner ssn = new Scanner(System.in);
        System.out.println("şimdi 4 işlm için iki sayı giricez");
        System.out.println("ilk sayıyı sayi1 = giriniz");
        int sayi1 = ssn.nextInt();
        System.out.println("sayi2 yi giriniz =");
        int sayi2 = ssn.nextInt();
        System.out.println("yapmak istediğiniz 4 işlemden birini saçiniz = >");
        System.out.println("+,/,*,-");
        String islem = ssn.next();
        switch (islem){
            case "*":
                System.out.println("çarpam sonucu= "+ (sayi1*sayi2));
            case "-":
                System.out.println("çıkarma sonucu= "+ (sayi2-sayi1));
            case "/":
                System.out.println("bölme sonucu= "+ (sayi1/sayi2));
            case "+":
                System.out.println("toplama sonucu= "+ (sayi1+sayi2));

        }
    }
}