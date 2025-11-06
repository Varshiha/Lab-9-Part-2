import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{   private static final double CANNON_BALL_VELOCITY = 1500.00;
    /**
     * Act - do whatever the Canon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.\
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            Vector2D cannonToMouse = new Vector2D(mouse.getX() - getY(),
                                                  mouse.getX() - getY());
            
            alignWithVector(cannonToMouse);
            
            if(Greenfoot.mouseClicked(null)){
                cannonToMouse.normalize();
                cannonToMouse = Vector2D.multiply(cannonToMouse, CANNON_BALL_VELOCITY);
                
                CannonBall newBall = new CannonBall();
                newBall.setVelocity(cannonToMouse);
                getWorld().addObject(newBall, getX(), getY());
            }
        }
        }
    public void alignWithVector(Vector2D v){
        double adjacent = v.getX();
        double opposite = v.getY();
            
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
            
        setRotation((int) angleDegrees);
    }
    }

