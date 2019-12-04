import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inimigo extends Actor
{
   protected  void movimentar()
    {
           move(5);
           if ((Greenfoot.getRandomNumber(100) < 10))
    {
          turn(Greenfoot.getRandomNumber(90) - 45); 
    }
           if (getX() <= 5 || getX() >= getWorld().getWidth() -5)
    {
            turn(180);
    }
    
           if (getY() <= 5 || getY() >= getWorld().getWidth()-5)
    {
            turn(180);
    }
           

    }
    
    public void act() 
    {
       Actor Personagem;
            Personagem = getOneObjectAtOffset(0,0,Personagem.class);
            if(Personagem != null)
            {
                World world;
                world = getWorld();
                world.removeObject(Personagem);
                Greenfoot.playSound("sedeumal.mp3");
                
            }
            movimentar();
    }
    
}
