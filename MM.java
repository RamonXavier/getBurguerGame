import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MM extends World
{

    /**
     * Constructor for objects of class MM.
     * 
     */
    public MM()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
       

    }
    
    private void mmSong()
    {
        Greenfoot.playSound("gangnam.mp3");
         
           /* if (World == MM){
               Greenfoot.playSound("gangnam.mp3");
            }else
            {
               Greenfoot.playSound("meusom.mp3");
            }*/
    
        }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Voador1 voador1 = new Voador1();
        addObject(voador1,43,66);
        Voador1 voador12 = new Voador1();
        addObject(voador12,284,80);
        Voador1 voador13 = new Voador1();
        addObject(voador13,526,97);
        Voador2 voador2 = new Voador2();
        addObject(voador2,88,369);
        Voador2 voador22 = new Voador2();
        addObject(voador22,495,376);
        Sair sair = new Sair();
        addObject(sair,410,274);
        Iniciar iniciar = new Iniciar();
        addObject(iniciar,208,283);
        sair.setLocation(368,263);
        iniciar.setLocation(250,266);
        iniciar.setLocation(137,213);
        sair.setLocation(449,222);
        sair.setLocation(467,208);
        iniciar.setLocation(146,215);
        Voador6 voador6 = new Voador6();
        addObject(voador6,269,364);
        Voador6 voador62 = new Voador6();
        addObject(voador62,160,77);
        Voador6 voador63 = new Voador6();
        addObject(voador63,407,49);
        Voador6 voador64 = new Voador6();
        addObject(voador64,79,158);
        Voador6 voador65 = new Voador6();
        addObject(voador65,544,329);
        Voador4 voador4 = new Voador4();
        addObject(voador4,191,258);
        Voador4 voador42 = new Voador4();
        addObject(voador42,338,219);
        Voador4 voador43 = new Voador4();
        addObject(voador43,306,147);
        Voador4 voador44 = new Voador4();
        addObject(voador44,110,61);
        voador43.setLocation(347,37);
        voador42.setLocation(339,364);
        voador4.setLocation(543,357);
        Voador3 voador3 = new Voador3();
        addObject(voador3,150,316);
        Voador3 voador32 = new Voador3();
        addObject(voador32,312,182);
        Voador3 voador33 = new Voador3();
        addObject(voador33,151,17);
    }
}
