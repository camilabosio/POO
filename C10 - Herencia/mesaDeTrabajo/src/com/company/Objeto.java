package com.company;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int x, int y, char direccion)
    {
        this.posx=x;
        this.posy=y;
        this.direccion=direccion;

    }

    public void irA(int x, int y, char direccion)
    {
        this.posx=x;
        this.posy=y;
        this.direccion=direccion;
    }

    public char getDireccion() {
        return direccion;
    }
}
