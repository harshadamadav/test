/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author megha
 */
public class homed extends Canvas implements CommandListener {

    /**
     * constructor
     */
    public homed() {
        
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        
        
        g.setColor(255,0,0);
        g.fillTriangle(75, 75, 125, 75, 100, 50);
        g.drawRect(75,75,50,50);
        g.drawRect(95,95,15,25);
        
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
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
