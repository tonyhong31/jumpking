import greenfoot.*;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and a score.
 * 
 * @author M Kölling
 * @version 1.1
 */
public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 70.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoard()
    {
        this(true);
    }

    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(boolean isClear)
    {
        if(isClear){
        makeImage("ㅇㅅㅇ");}
        else{
        makeImage("ㅠㅅㅠ");}
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 115, 160);
        
        setImage(image);
    }
}
