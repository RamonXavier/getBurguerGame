import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    /**
     * Act - do whatever the Personagem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int pontuacao = 0;
    public void act() 
   {
     comer();
     andar();
   }
    protected void andar()
   {
         move(3);
        if(Greenfoot.isKeyDown("left"))
    {
            turn(-3);
    }
    if (Greenfoot.isKeyDown("right"))
    {
            turn (3);
    }
    if (Greenfoot.isKeyDown("Up"))
    {
            turn (1);
    }   
   }
   
    protected void comer()
    {
          
       Actor Objetivo;
    Objetivo = getOneObjectAtOffset(0,0, Objetivo.class);
    if (Objetivo != null)
    {
            World world;
            world = getWorld();
            world.removeObject(Objetivo);
            Greenfoot.playSound("meusom.wav");    

  }    
    }

}

