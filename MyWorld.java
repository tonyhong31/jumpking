
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    private String state;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        state = "ice";
        add(state);
    }

    public void add(String state){
        String b = "";
        if (state.equals("grass")){
            b = "GrassBase1.png";
            setBackground("Forest1.jpeg");}
        else if (state.equals("ice")){
            b = "IceBase1.png";
            setBackground("Ice1.jpeg");}
        //if (state.equals("grass"))
        //b = "GrassBase.png";
        //if (state.equals("grass"))
        //b = "GrassBase.png";
        Base base1 = new Base(b);
        addObject(base1, Greenfoot.getRandomNumber(600), 90);
        Base base2 = new Base(b);
        addObject(base2, Greenfoot.getRandomNumber(600), 190);
        Base base3 = new Base(b);
        addObject(base3, Greenfoot.getRandomNumber(600), 290);
        Base base4 = new Base(b);
        addObject(base4, Greenfoot.getRandomNumber(600), 390);
    }
}
