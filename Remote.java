package com.company;

import java.util.Scanner;

public class Remote
{
    int chanel;
    int volume;
    int online;

    public Remote(int chanel, int volume, int online)
    {
        Scanner scan = new Scanner(System.in);
        this.online = online;
        System.out.println("Wlaczyc tv?");
        System.out.println("1 - tak");
        System.out.println("0 - nie");
        int wybor1 = scan.nextInt();
        if(wybor1 == 1)
        {
            int nowy = online + 5;
            System.out.println("Wlaczyczony");

            this.chanel = chanel;
            System.out.println("Obecny kanal = "+ this.chanel);
            System.out.println("Program w tyl - 2");
            System.out.println("Program w przod - 1");
            int wybor2 = scan.nextInt();
            if (wybor2 == 1)
            {
                System.out.println("O ile kanalow w przod ?");
                int ilosc = scan.nextInt();
                int nowy1 = chanel + ilosc;

                System.out.println("Obecny kanal = "+ nowy1 );
            }
            if (wybor2 == 2)
            {
                System.out.println("O ile kanalow w tyl?");
                int ilosc = scan.nextInt();
                int nowy1 = chanel - ilosc;
                System.out.println("Obecny kanal = "+ nowy1 );
            }

            this.volume = volume;
            System.out.println("Obecny vol = "+ this.volume);
            System.out.println("Vol w dol - 2");
            System.out.println("Vol w gore - 1");
            int wybor3 = scan.nextInt();
            if (wybor3 == 1)
            {
                System.out.println("O ile vol w gore ?");
                int ilosc = scan.nextInt();
                int nowy2 = volume + ilosc;
                System.out.println("Obecny vol = "+ nowy2 );
            }
            if (wybor3 == 2)
            {
                System.out.println("Obecny vol = "+ this.volume);
                System.out.println("O ile vol w dol ?");
                int ilosc = scan.nextInt();
                int nowy2 = volume - ilosc;
                System.out.println("Obecny vol = "+ nowy2 );
            }
        }
            else
            {
            System.out.println("Dowidzenia");
            }
    }
}