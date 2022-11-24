import java.util.Scanner;

public class Main {

    static  int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam: " +result);
        return result;
    }

    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Fark: " +result);
        return  result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpma: "+result);
        return result;
    }
    static int divided(int a,int b) {
        if (b == 0) {
            System.err.println("İkinci sayı 0'dan farklı olmalı.");
            return 0;
        }
            int result = a / b;
        System.out.println("Bölüm: " +result);
        return result;
        }

        static int power(int a,int b){
        int result=1;
            for (int i = 1; i <=b ; i++) {
                result*=a;

            }
            return result;


    }

    static  int mod(int a,int b){
        return a%b;
    }

    static  void calc(int a,int b){
        System.out.println("Çevre: " +(2*(a+b)));
        System.out.println("Alan: " +(a*b));

    }


    public static void main(String[] args) {


        Scanner klavye=new Scanner(System.in);
        int secim;

        String menu="1.Toplama İşlemi \n"
                    +"2.Çıkarma İşlemi \n"
                    +"3.Çarpma İşlemi \n"
                    +"4.Bölme İşlemi \n"
                    +"5.Üslü Sayı Hesaplama \n"
                    +"6.Mod Alma \n"
                    +"7.Dikdörtgen Alan ve Çevre Hesabı \n"
                    +"0.Çıkış Yap";



        while (true){
            System.out.println(menu);
            System.out.print("Bir İşlem Seciniz: ");
            secim= klavye.nextInt();

            if (secim==0){
                System.out.println("Sistemden Çıkış Yapılıyor...");
                break;
            }

            System.out.print("1.Sayı: ");
            int a= klavye.nextInt();

            System.out.print("2.Sayı: ");
            int b= klavye.nextInt();


            switch (secim){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;

                case 3:
                    times(a,b);
                    break;
                case 4:
                   divided(a,b);
                    break;

                case 5:
                    System.out.println("Üs hesabı: " +power(a,b));
                    break;

                case 6:
                    System.out.println("Mod İşlemi: " +mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;

                default:
                    System.err.println("Geçersiz İşlem Girdiniz.");

            }

        }



    }
}