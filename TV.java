package com.company;

public class TV
{
    int chanel;
    int volume;
    int online;

    public TV(int chanel, int volume, int online )
    {
        this.online =  online;
        if (online>5)
        {
            System.out.println("TV jest wlączony");
            this.chanel = chanel ;
            System.out.println("wyswietlamy kanal: " + chanel);
            this.volume = volume;
            System.out.println("glosnosc ustawiona na: " + volume);
        }
        else
            {
            System.out.println("Tv jest wylaczony");
            }
    }
}