import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Iniciar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iniciar extends Botoes
{
    /**
     * Act - do whatever the Iniciar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if (Greenfoot.isKeyDown("enter"))
    {
         Greenfoot.setWorld(new MyWorld());
         
           
    } 
    }
}
