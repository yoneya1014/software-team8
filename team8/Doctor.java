import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kaomozi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doctor extends Actor
{
    /**
     * Act - do whatever the Kaomozi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean movingleft = true;
    public void act() 
    {   
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
            if( ! movingleft ){
                movingleft = true;
                getImage().mirrorHorizontally();
            }
            setLocation( x-1,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            if( movingleft ){
                movingleft = false;
                getImage().mirrorHorizontally();
            }
            setLocation( x+1,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-1 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+1 );
        }
        
        Actor virus = getOneIntersectingObject( Virus.class );
        if( virus != null ){
            getWorld().removeObject(virus);
        }
        Actor kit = getOneIntersectingObject( Kit.class );
        if( kit != null ){
            getWorld().removeObject(kit);
        }
    }
}
