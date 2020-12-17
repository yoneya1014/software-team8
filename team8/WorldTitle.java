import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTitle extends World
{

    /**
     * Constructor for objects of class WorldTitle.
     * 
     */
    public WorldTitle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage img1 = new GreenfootImage( "images/COVID-19.jpg" );
        img1.setTransparency(75);
        getBackground().drawImage( img1, 0, 0 );
    }
    
    public void act()
    {
        
        
        GreenfootImage OP1 = new GreenfootImage("Stop COVID-19 ambitions!", 50, Color.BLACK, null);
        getBackground().drawImage(OP1, (getWidth()-OP1.getWidth())/2, (getHeight()-OP1.getHeight())/2);
        
        showText("Push space!" , 300, 250);
        
        if(Greenfoot.isKeyDown("space")){
            World game = new MyWorld();
            Greenfoot.setWorld(game);
        }
    }
}
