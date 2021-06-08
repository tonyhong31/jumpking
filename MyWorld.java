<<<<<<< HEAD

=======
>>>>>>> 51416917ad0a438a36db1f74ee5978a4ebbc87bc
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
<<<<<<< HEAD
=======

>>>>>>> 51416917ad0a438a36db1f74ee5978a4ebbc87bc
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
<<<<<<< HEAD
    private String state;
=======
>>>>>>> 51416917ad0a438a36db1f74ee5978a4ebbc87bc
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
<<<<<<< HEAD
        state = "ice";
        add(state);
    }

    private void add(String state){
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
=======
>>>>>>> 51416917ad0a438a36db1f74ee5978a4ebbc87bc
    }
}
