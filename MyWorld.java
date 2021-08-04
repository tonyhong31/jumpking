import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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

    private String[] theme = 
        {"Forest1.jpeg", "Forest2.jpeg", "Forest3.jpeg", 
            "Ice1.jpeg",  "Ice2.jpeg","Ice3.jpeg","Aqurarium1.jpeg", 
            "Aqurarium2.jpeg","Aqurarium3.jpeg", "Desert1.jpeg", "Desert2.jpeg",
            "Desert3.jpeg", "City1.jpeg", "City2.jpeg", "City3.jpeg"};

    public int state;
    public int pos;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        pos = 100;
        state = 1;
        add(state);
        CarSpawn();
    }

    public void add(int state){
        this.state = state;
        String b = "";
        if (state == 1){
            b = "GrassBase1.png";
            setBackground("Forest1.jpeg");}
        else if (state == 2){
            b = "IceBase1.png";
            setBackground("Ice1.jpeg");}
        else if (state == 3) {
            b = "Aqurarium1.jpeg";
            setBackground("Aqurarium1.jpeg");}
        else if (state == 4) {
            b = "Desert1.jpeg";
            setBackground("Desert1.jpeg");}
        else if (state == 5) {
            b = "City1.jpeg";
            setBackground("City1.jpeg");}
        else if (state == 0) {
            
            Greenfoot.stop();
            return;
        }
        
        List<Base> bases = getObjects(Base.class);

        for (Base base : bases)
        {
            removeObject(base);
        }
        Base base1 = new Base(b);
        addObject(base1, pos, 390);
        Base base2 = new Base(b);
        addObject(base2, base1.getX() + Greenfoot.getRandomNumber(150), 290);
        Base base3 = new Base(b);
        addObject(base3, base2.getX() - Greenfoot.getRandomNumber(300), 190);
        Base base4 = new Base(b);
        addObject(base4, base3.getX() + Greenfoot.getRandomNumber(150), 90);
        pos = base4.getX();
        int a = 0;
        if (pos <= 300) 
            a = 1;
        
        else
            a = -1;
        pos = pos + 60*a;
        CarSpawn();
    }

    private void CarSpawn(){
        List<Cars> car = getObjects(Cars.class);

        for (Cars cars : car)
        {
            removeObject(cars);
        }
        Cars pos1 = new Cars();
        addObject(pos1, Greenfoot.getRandomNumber(2)*600, Greenfoot.getRandomNumber(4)*100 +60);
        Cars pos2 = new Cars();
        addObject(pos2, Greenfoot.getRandomNumber(2)*600, Greenfoot.getRandomNumber(4)*100 +60);
    }

}

