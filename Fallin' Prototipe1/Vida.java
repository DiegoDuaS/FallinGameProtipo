import greenfoot.*;  

public class Vida extends Actor
{
    //Modificación del tamaño de la imagen de vidas. 
    public Vida(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    //Movimiento de las vidas de abajo hacia arriba, y remover el objeto en caso de que llegue a Y = 1. 
    public void act()
    {
        if(getY() > 1 ){
            turn(270);
            move(2);
            turn(90);
            move(1/100);
        if(getY() == 1 ){
            getWorld().removeObject(this);
        }
        }
    }
}
