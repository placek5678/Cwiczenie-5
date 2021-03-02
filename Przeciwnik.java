package com.company;

import java.util.Scanner;

public class Przeciwnik
{
    public Przeciwnik(int hp, int def)
    {
        Scanner scan = new Scanner(System.in);
        int enemyAtack;
        int EnemytotalHp;
        EnemytotalHp = hp + def;
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
                enemyAtack = 35;
                break;
            case 2:
                enemyAtack = 50;
                break;
            case 3:
                enemyAtack = 40;
                break;
            case 4:
                enemyAtack = 30;
                break;
            default:
        }
    }
}