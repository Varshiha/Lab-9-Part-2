import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    
    private static final double GRAVITY = 9.8;
    
    public CannonBall()
    {
        position = null;
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
    }
    public void setVelocity(Vector2D v){
        velocity = v;
    }
    public void act() 
    {
        if (position == null){
            position = new Point2D(getX(), getY());
        }
        MyWorld world = (MyWorld) getWorld();
        double dt = world.getTimeStepDuration();
        
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
        
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        
        setLocation((int) position.getX(), (int) position.getY());
    }    
}
