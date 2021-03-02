package com.company;

import java.util.Scanner;

public class Gracz
{
    public Gracz(int hp, int def)
    {
        Scanner scan = new Scanner(System.in);
        int playerAtack;
        int PlayertotalHp;
        PlayertotalHp = hp + def;
        System.out.println("Wybierz bron: ");
        System.out.println("1.Miecz krotki - 35 dmg");
        System.out.println("2.Miecz dlugi - 50dmg");
        System.out.println("3.Maczuga - 40dmg");
        System.out.println("4.Luk - 30");
        System.out.println("Wybierz po przez wpisaniu liczby i zatwierdzenia decyzji");
        int wybor = scan.nextInt();
        switch (wybor)
        {
            case 1:
                playerAtack = 35;
                break;
            case 2:
                playerAtack = 50;
                break;
            case 3:
                playerAtack = 40;
                break;
            case 4:
                playerAtack = 30;
                break;
            default:
        }
    }
}