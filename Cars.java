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
        {"AlfaRomeo.png", "AlphaTauri.png", "Alphine.png", "AstonMartin.png",
            "Ferrari.png", "Haas.png", "McLaren.png", "Mercedes.png", 
            "Redbull.png", "Williams.png"};
    public Cars(){ 
        int i = Greenfoot.getRandomNumber(10);
        //int n = I;
        GreenfootImage image = new GreenfootImage(I[i]);
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
        speed();

    }   
    public void speed(){
       
    }
}
