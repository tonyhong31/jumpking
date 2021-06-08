import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Base(String version){ // Grassbase1.png
        image1 = new GreenfootImage(version);
        image1.scale(125,30);
        //image2 = new GreenfootImage("")
        setImage(image1);
    }
    /**
     * Act - do whatever the Base wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
}
