package com.company;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad, int vida)
    {
        super(x,y,direccion);
        this.velocidad=velocidad;
        this.vida=vida;
    };

    @Override
    public void irA(int x, int y, char direccion)
    {
        this.posx=x;
        this.posy=y;
        this.direccion=direccion;
    }

    public char girar()
    {
        return super.getDireccion();
    }
    public void restaVida(int valor)
    {
        this.vida=valor;
    }
}
