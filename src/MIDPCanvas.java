/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author megha
 */
public class MIDPCanvas extends Canvas implements CommandListener {
String s="";
    /**
     * constructor
     */
    public MIDPCanvas() {
       
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        g.setColor(0, 0, 255);
        g.setColor(255, 0, 0);
        g.drawString(s, 0, 0, Graphics.TOP | Graphics.LEFT);
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
        
        s="("+x+", "+y+")";
        repaint();
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
