import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kit extends Actor
{
    /**
     * Act - do whatever the TestActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }    
}
