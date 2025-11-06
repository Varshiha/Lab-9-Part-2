import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        List<CannonBall> cannonBalls = getWorld().getObjects(CannonBall.class);
        
        for(int i = 0; i < cannonBalls.size(); i ++){
            CannonBall ball = cannonBalls.get(i);
            Vector2D targetToBall = new Vector2D(ball.getX() - getX(), ball.getY() - getY());
            double distance = targetToBall.magnitude();
            
            if(distance < getImage().getHeight()/2 + ball.getImage().getHeight()/2){
                setImage(new GreenfootImage("targetDestroyed.png"));
            }
        }
    }
}
