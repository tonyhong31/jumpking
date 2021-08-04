import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class King extends Mover
{
    private GreenfootImage walkingLeft1, walkingLeft2, faceFront, walkingRight1,
    walkingRight2;
    int count=0;
    private static final int jumpStrength = 16;

    public King()
    {
        walkingLeft1 = new GreenfootImage("left1.png");
        walkingLeft2 = new GreenfootImage("left2.png");
        faceFront = new GreenfootImage("standing front.png");
        walkingRight1 = new GreenfootImage("right1.png");
        walkingRight2 = new GreenfootImage("right2.png");
        setImage(faceFront);
    }

    /**
     * Act - do whatever the King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        checkKeys();
        checkFall();
        mapChange();
        fallDown();
        
    }    

   
    private void checkKeys(){

        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            count ++;
            if (getImage() == faceFront)
            {
                setImage(walkingLeft1);
            }
            if (getImage() == walkingLeft1){
                if (count == 5){
                    setImage(walkingLeft2);
                    count = 0;
                }
            }
            else
            {
                if (count == 5){
                    setImage(walkingLeft1);
                    count = 0;
                }
            }  
        }    

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+5, getY());
            if (getImage() == faceFront)
            {
                setImage(walkingRight1);
            }
            if (getImage() == walkingRight1){
                count ++;
                if (count == 5){
                    setImage(walkingRight2);
                    count = 0;
                }
            }
            else
            {
                count ++;
                if (count == 5){
                    setImage(walkingRight1);
                    count = 0;
                }
            }  
        }

        if (Greenfoot.isKeyDown("space"))
        {
            if (onGround())
            {
                jump();
            }   
        }   
    }

    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }

    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
    
    private void mapChange()
    {
        if (getY() == 0){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.add(1); 
            
            setLocation(getX(), 340);
        }
    }
    
     private void fallDown()
    {
        if (getY() == 399){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.add(1); 
            
            setLocation(getX(), 20);
        }
    }
    
}
