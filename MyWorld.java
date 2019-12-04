import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        Greenfoot.playSound("worldsom.mp3");
    }
    


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Objetivo2 objetivo2 = new Objetivo2();
        addObject(objetivo2,422,71);
        Objetivo2 objetivo22 = new Objetivo2();
        addObject(objetivo22,284,73);
        Objetivo2 objetivo23 = new Objetivo2();
        addObject(objetivo23,176,104);
        Objetivo3 objetivo3 = new Objetivo3();
        addObject(objetivo3,470,154);
        Objetivo3 objetivo32 = new Objetivo3();
        addObject(objetivo32,392,186);
        Objetivo4 objetivo4 = new Objetivo4();
        addObject(objetivo4,513,286);
        Objetivo4 objetivo42 = new Objetivo4();
        addObject(objetivo42,444,314);
        Objetivo4 objetivo43 = new Objetivo4();
        addObject(objetivo43,374,316);
        Inimigo1 inimigo1 = new Inimigo1();
        addObject(inimigo1,171,203);
        Inimigo inimigo = new Inimigo();
        addObject(inimigo,272,175);
        Inimigo inimigo2 = new Inimigo();
        addObject(inimigo2,362,272);
        Inimigo inimigo3 = new Inimigo();
        addObject(inimigo3,327,230);
        Inimigo1 inimigo12 = new Inimigo1();
        addObject(inimigo12,291,301);
        Personagem personagem = new Personagem();
        addObject(personagem,55,347);
        objetivo3.setLocation(714,92);
        objetivo4.setLocation(725,421);
        objetivo42.setLocation(637,265);
        objetivo32.setLocation(455,164);
        objetivo2.setLocation(561,43);
        objetivo22.setLocation(349,43);
        objetivo22.act();
        objetivo32.setLocation(540,180);
        objetivo43.setLocation(511,428);
        inimigo2.setLocation(486,321);
        inimigo3.setLocation(437,173);
        inimigo.setLocation(280,114);
        inimigo12.setLocation(670,149);
        objetivo32.setLocation(340,270);
        inimigo2.setLocation(319,372);
        Inimigo2 inimigo22 = new Inimigo2();
        addObject(inimigo22,222,446);
        Inimigo2 inimigo23 = new Inimigo2();
        addObject(inimigo23,597,350);
        Inimigo2 inimigo24 = new Inimigo2();
        addObject(inimigo24,590,228);
        Inimigo2 inimigo25 = new Inimigo2();
        addObject(inimigo25,738,225);
        inimigo23.setLocation(613,423);
        objetivo42.setLocation(524,153);
        objetivo2.setLocation(654,337);
        objetivo22.setLocation(556,52);
        objetivo3.setLocation(67,100);
        objetivo23.setLocation(338,76);
        inimigo3.setLocation(431,40);
        objetivo42.setLocation(488,224);
        inimigo24.setLocation(463,157);
        inimigo12.setLocation(591,103);
        inimigo1.setLocation(125,112);
    }
}
