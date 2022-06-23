package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print(" Kart no giriniz : ");
        String cardNumber = input.next();

        System.out.print(" Son Kullanım Tarihi giriniz : ");
        String date= input.next();

        System.out.print(" Güvenlik Kodu giriniz : ");
        String cvc= input.next();

        System.out.println("1. ING BANK");
        System.out.println("2. AK BANK");
        System.out.println("3. İŞ BANK");

        System.out.println(" Banka seçiniz : ");
        int selectBank = input.nextInt();
        switch (selectBank){
            case 1:
                IngBankasi aPos = new IngBankasi("IngBankası", "2345654", "34565433");
                aPos.connect("343.2345.345.64");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                AkBankasi bPos = new AkBankasi("IngBankası", "2345654", "34565433");
                bPos.connect("asdas");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli bir banka giriniz: ");
        }

    }
}
