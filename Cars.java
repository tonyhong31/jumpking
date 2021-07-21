import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cars extends Actor
{
    private String[] R = 
        {"HaasR.png", "WilliamsR.png", "AlfaRomeoR.png", "AlphineR.png", 
            "AlphaTauriR.png",  "AstonMartinR.png","FerrariR.png",
            "MercedesR.png", "RedBullR.png", "McLarenR.png"};
    int i = Greenfoot.getRandomNumber(10);
    GreenfootImage imageR = new GreenfootImage(R[i]);

    private String[] L = 
        {"HaasL.png", "WilliamsL.png", "AlfaRomeoL.png", "AlphineL.png", 
            "AlphaTauriL.png",  "AstonMartinL.png","FerrariL.png",
            "MercedesL.png", "RedBullL.png", "McLarenL.png"};
    GreenfootImage imageL = new GreenfootImage(L[i]);

    int speed = i+1;
    public Cars(){ 
        imageR.scale(160, 110);
        imageL.scale (160, 110);
        setImage(imageR);
    }

    /**
     * Act - do whatever the Cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        edge();
    }   

    public void edge(){
        if (isAtEdge()){
            if (getImage().equals (imageR))
                setImage(imageL);
            else 
                setImage(imageR);
                speed = -speed;
        }
    }
}

