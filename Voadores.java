import greenfoot.*;
/**
 * Write a description of class Voadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voadores extends Menu 
{
    public void act()
    {
        movim();
    }  
    
    public void movim()
    {
                     move(2);
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
}
