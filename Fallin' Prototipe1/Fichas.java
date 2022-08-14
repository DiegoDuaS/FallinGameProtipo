import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fichas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fichas extends Actor
{
    public void act()
    {
        //Hacer que las fichas se muevan de abajo hacia arriba, y desaparezcan en caso lleguen hasta Y = 0. 
        if(getY() > 1 ){
            turn(270);
            move(4);
            turn(90);
            move(1/100);
        if(getY() == 0 ){
            getWorld().removeObject(this);
        }
        }
    }
}
