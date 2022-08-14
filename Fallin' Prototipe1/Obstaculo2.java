import greenfoot.*;  

public class Obstaculo2 extends Actor
{
    //Modificación del tamaño de la imagen del obstaculo 
    public Obstaculo2(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    //Movimiento del obstaculo de derecha a izquierda y remover el objeto en caso llegue X = 0.
    public void act()
    {
        if(getX() > 0){
            move(-(5/2));
            turn(90);
            move(-2);
            turn(270);
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}
}
