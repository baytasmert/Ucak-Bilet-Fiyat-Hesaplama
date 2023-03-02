import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,tip;
        double km,ucret=0,maliyet=0.1;
        double yasind1=0.5;
        double yasind2=0.9;
        double yasind3=0.7;
        double gidisdonusind=0.8;
        double yasOran=0,gidisOran=0;
        Scanner oku=new Scanner(System.in);

        System.out.print("\nKm giriniz : ");
        km=oku.nextInt();
        if(km<0){
            System.out.print("\nHatali giris yaptiniz.");
            km=0;
        }else {
            ucret+=km*maliyet;
        }

        System.out.print("\nYasinizi giriniz :");
        yas=oku.nextInt();
        if(yas<0){
            System.out.println("\nHatali giris yaptiniz.");
                    }else {
            if(yas<12){
                ucret=ucret*yasind1;
                yasOran=yasind1;
            } else if (yas>=12 && yas<24) {
                ucret=ucret*yasind2;
                yasOran=yasind2;
            } else if (yas>65) {
                ucret=ucret*yasind3;
                yasOran=yasind3;
            }
        }

        System.out.print("Yolculuk tipi giriniz( 1 => Tek Yon , 2 => Gidis Donus ) : ");
        tip= oku.nextInt();
        if(tip==1 || tip ==2){
            if(tip==2){
                ucret=ucret*gidisdonusind;
                gidisOran=gidisdonusind;
            }

        }else {
            System.out.println("Hatali giris yaptiniz.");
        }
        System.out.println("Normal Tutar ="+km*maliyet);
        if(yasOran!=0){
        System.out.println("Yas indirimi = "+(km*maliyet*(1-yasOran)));}
        if(gidisOran!=0){

        System.out.println("Gidis Donus Bilet indirimi = "+(km*maliyet*(1-gidisOran)));}
        if(gidisOran!=0 || yasOran!=0)
        System.out.println("indirimli Tutar = "+ucret);

    }
}