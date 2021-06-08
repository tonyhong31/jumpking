import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cars extends Actor
{
    private String[] I = 
        {"Haas.png", "Williams.png", "AlfaRomeo.png", "Alphine.png", 
            "AlphaTauri.png",  "AstonMartin.png","Ferrari.png",
            "Mercedes.png", "Redbull.png", "McLaren.png"};
    int i = Greenfoot.getRandomNumber(10);
    GreenfootImage image = new GreenfootImage(I[i]);
    public Cars(){ 
        image.scale(160, 110);
        setImage(image);
    }

    /**
     * Act - do whatever the Cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(i+1);
    }   
}

