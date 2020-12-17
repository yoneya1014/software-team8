import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hinomaru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends Actor
{
    /**
     * Act - do whatever the Hinomaru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if(getX() == 0){
            getWorld().removeObject(this);
        }
        // Add your action code here.
        Actor actor = getOneIntersectingObject( Virus.class );
        if( actor != null ){
        getWorld().removeObject( actor ); 
        }  
    }    
}
