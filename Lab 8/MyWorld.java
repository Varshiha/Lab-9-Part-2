import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1); 
        prepare();
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CannonBall cannonBall = new CannonBall();
        addObject(cannonBall,323,264);
        cannonBall.setLocation(755,283);
        CannonBall cannonBall2 = new CannonBall();
        addObject(cannonBall2,551,394);
        CannonBall cannonBall3 = new CannonBall();
        addObject(cannonBall3,332,489);
        CannonBall cannonBall4 = new CannonBall();
        addObject(cannonBall4,138,355);
        cannonBall.setLocation(754,286);
        removeObject(cannonBall);
        removeObject(cannonBall2);
        removeObject(cannonBall3);
        removeObject(cannonBall4);
        Cannon cannon = new Cannon();
        addObject(cannon,158,639);
        Target target = new Target();
        addObject(target,464,340);
        Target target2 = new Target();
        addObject(target2,634,444);
        Target target3 = new Target();
        addObject(target3,780,569);
        Target target4 = new Target();
        addObject(target4,836,696);
    }

    public void act(){
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }
    public double getTimeStepDuration(){
        return timeStepDuration;
    }
}
