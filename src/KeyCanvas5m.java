/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class KeyCanvas5m extends MIDlet {
    
    private Display dis;
    private CanvasKey5c c=new CanvasKey5c();
    private MIDPCanvas mc=new MIDPCanvas();
    private homed hd=new homed();
    private Sunimg s=new Sunimg();
    public void startApp() {
        dis=Display.getDisplay(this);
        dis.setCurrent(s);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
