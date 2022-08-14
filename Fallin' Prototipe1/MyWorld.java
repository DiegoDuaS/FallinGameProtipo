import greenfoot.*; 
public class MyWorld extends World
{
    //Dandole las medidas a la pantalla principal
    public MyWorld()
    {    
        super(300, 500, 1); 
        prepare();
    }
    
    //Apareciendo el avatar del jugador antes de inciar al juego
    private void prepare()
    {
        Jugador Jugador1 = new Jugador();
        addObject(Jugador1,150,200);

    }
    
    //Dandole Instrucciones de que aparecer mientras se corre el juego. 
    public void act()
    {
        //Hacer que los obstaculos aparezcan de una forma aleatoria 
        if(Greenfoot.getRandomNumber(200) == 1)
        {
            addObject(new Obstaculo(),0, Greenfoot.getRandomNumber(100)+ 250);
        }
         if(Greenfoot.getRandomNumber(200) == 1)
        {
            addObject(new Obstaculo2(),299, Greenfoot.getRandomNumber(100)+ 250);
        }
        //Hacer que las Fichas aparezcan de una forma aleatoria 
        if(Greenfoot.getRandomNumber(150) == 1)
        {
            addObject(new Fichas(), Greenfoot.getRandomNumber(300),500);
        }
        //Hacer que las fichas aparezcan de una forma aleatoria
        if(Greenfoot.getRandomNumber(850) == 1)
        {
            addObject(new Vida(), Greenfoot.getRandomNumber(300),500);
        }
    }
}
