import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstaculo extends Actor
{
    //Modificar el tamaño de la imagen del obstaculo 
    public Obstaculo(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    //Movimiento del obstaculo de izquierda a derecha remover el objeto en caso llegue X = 299.
    public void act()
    {
        if(getX() < 299){
            move(5/2);
            turn(270);
            move(2);
            turn(90);
        if(getX() == 299){
            getWorld().removeObject(this);
        }
    }
}
}
