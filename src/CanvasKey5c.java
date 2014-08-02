/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author megha
 */
public class CanvasKey5c extends Canvas implements CommandListener {
    
   // Font f;
    String s="[Press Key]";
    public CanvasKey5c() {
        //f=Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        int w=getWidth();
        int h=getHeight();
        g.setColor(255, 0, 0);
        g.fillRect(0, 0, w-1, h-1);
        g.setColor(0, 0, 255);
        g.drawString(s, w/2, h/2, Graphics.BASELINE|Graphics.HCENTER);
       // g.drawString("Sample Text", 0, 0, Graphics.TOP | Graphics.LEFT);
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
        int ga=getGameAction(keyCode);
        switch(ga)
        {
            case RIGHT:
                s="Right";
                break;
            case DOWN:
                s="down";
                break;
            case LEFT:
                s="left";
                break;
            case UP:
                s="up";
                break;
            case FIRE:
                s="fire";
                break;
            case GAME_A:
                s="gameb";
                break;
            case GAME_B:
                s="gamea";
                break;
            
        }
        repaint();
    }

    /**
     * Called when a key is released.
     */
    protected void keyReleased(int keyCode) {
    }

    /**
     * Called when a key is repeated (held down).
     */
    protected void keyRepeated(int keyCode) {
    }

    /**
     * Called when the pointer is dragged.
     */
    protected void pointerDragged(int x, int y) {
    }

    /**
     * Called when the pointer is pressed.
     */
    protected void pointerPressed(int x, int y) {
    }

    /**
     * Called when the pointer is released.
     */
    protected void pointerReleased(int x, int y) {
    }

    /**
     * Called when action should be handled
     */
    public void commandAction(Command command, Displayable displayable) {
    }
}
