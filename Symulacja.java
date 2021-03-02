package com.company;

import java.util.Scanner;

public class Symulacja
{
    public Symulacja(int Playerhp, int Playerdef, int Enemyhp, int Enemydef)
    {
        Scanner scan = new Scanner(System.in);
        int playerAtack = 0;
        int PlayertotalHp;
        PlayertotalHp = Playerhp + Playerdef;
        System.out.println("wybierz bron gracza: ");
        System.out.println("1.Miecz krotki - 35 dmg");
        System.out.println("2.Miecz dlugi - 50dmg");
        System.out.println("3.Maczuga - 40dmg");
        System.out.println("4.luk - 30");
        System.out.println("wybierz po przez wpisaniu liczby i zatwierdzenia decyzji");
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
        int enemyAtack = 0;
        int EnemytotalHp;
        EnemytotalHp = Enemyhp + Enemydef;
        System.out.println("Wybierz bron przeciwnika: ");
        System.out.println("1.Miecz krotki - 35 dmg");
        System.out.println("2.Miecz dlugi - 50dmg");
        System.out.println("3.Maczuga - 40dmg");
        System.out.println("4.Luk - 30");
        System.out.println("Wybierz po przez wpisaniu liczby i zatwierdzenia decyzji");
        int wybor1 = scan.nextInt();
        switch (wybor1)
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

        do{
            EnemytotalHp = EnemytotalHp - playerAtack;
            PlayertotalHp = PlayertotalHp - enemyAtack;

        }while(EnemytotalHp == 0 || PlayertotalHp == 0);
        if (EnemytotalHp<PlayertotalHp){
            System.out.println("Wygrywa gracz");
        }else{
            System.out.println("Wygrywa przeciwnik");
        }
    }
}