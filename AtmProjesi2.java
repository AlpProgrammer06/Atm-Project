package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String password;
        int select = 3;
        String userName;
        Scanner scanner = new Scanner(System.in);
        int balance = 15000;
        int price = 0, price2;
        while (select > 0) {

            System.out.println("L�tfen kullan�c� ad�n� giriniz : ");
            userName = scanner.nextLine();
            System.out.println("L�tfen �ifrenizi giriniz : ");
            password = scanner.nextLine();


            if ((userName.equals("patika")) && password.equals("1453")) {
                System.out.println("Merhaba Patika Bankam�za hos geldiniz. ");

                do {
                    System.out.println(" 1-Para Cekme\n 2-Para Yatirma\n 3-Bakiye sorgu\n 4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("�ekmek istedi�iniz para tutar�n� girin.");
                            price=scanner.nextInt();

                            if (price <= balance) {
                                balance-=price;
                                System.out.println("Yeni Bakiyeniz : " + balance);
                                break;
                            } else {
                                System.out.println("Yeterli Bakiyeniz Yok...");
                                break;
                            }
                        case 2:
                            System.out.println("Yat�rmak istedi�iniz para tutar�n� giriniz: ");
                            price2 = scanner.nextInt();
                            balance += price2;
                            System.out.println("yeni bakiyeniz : " + balance);
                            break;
                        case 3:
                            System.out.print("Bakiyeniz : " + balance );
                            break;
                        case 4:
                            System.out.println("��k�� yap�l�yor. Yine beekleriz.");
                            break;
                    }

                } while (select != 4);
                break;
            } else {
                select--;
                System.out.println("Hatal� kullan�c� ad� veya �isfre girdiniz. L�tfen tekrar deneyiniz.");
                if (select == 0) {
                    System.out.println("Kart�n�z bloke olmu�tur l�tfen Bankan�z ile ileti�ime ge�iniz.");
                } else {
                    System.out.println("kalan hakk�n�z :" + select);
                }

            }


        }

    }
}




