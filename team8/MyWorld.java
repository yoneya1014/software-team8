import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int time = 0;
    private int time2 = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(610, 350, 1); 
        addObject(new Doctor(), 50, 200);
    }
    
    public void act(){
        time++;
        time2++;
        if(time == 65){
            addObject(new Virus(), 610, Greenfoot.getRandomNumber(350));
            time = 0;
        }
        if(time2 == 150){
            addObject(new Kit(), 610, Greenfoot.getRandomNumber(350));
            time2 = 0;
        }
    }
}
