/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.*;

/**
 * @author megha
 */
public class Sunimg extends Canvas implements CommandListener {

    /**
     * constructor
     */
    public Sunimg() {
        
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        g.setColor(255,0,0);
        g.drawArc(50, 50, 100, 100, 0, 360);
        //g.drawLine(100, 50, 50, 100);
        //g.drawLine(100, 50, 150, 100);
        //g.drawLine(100, 150, 150, 100);
        //g.drawLine(100, 150, 50, 100);
        
        g.drawLine(100, 50, 85, 85);
        g.drawLine(100, 50, 115, 85);
        g.drawLine(50, 100, 85, 85);
        g.drawLine(50, 100, 85, 115);
        g.drawLine(150, 100, 115, 85);
        g.drawLine(150, 100, 115, 115);
        g.drawLine(100, 150, 85, 115);
        g.drawLine(100, 150, 115, 115);
        
        g.fillTriangle(100, 20, 80, 40, 120, 40);
        g.fillTriangle(100, 180, 80, 160, 120, 160);
        
        g.fillTriangle(40, 80, 40,120 , 20, 100);
        g.fillTriangle(180, 100, 160, 80, 160, 120);
        
        //g.fillTriangle(40, 70, 70, 40, 30, 40);
        //g.fillTriangle(160, 70, 170, 40, 130, 40);
        
        g.fillTriangle(40, 70, 70, 40, 30, 40);
        g.fillTriangle(160, 70, 170, 40, 130, 40);
        
       //g.fillTriangle(40, 130, 70, 160, 30, 150);
        //g.fillTriangle(130,160,160,130,170,150);
        
        g.fillTriangle(40, 130, 70, 160, 30, 160);
        g.fillTriangle(130,160,160,130,170,160);
        
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
