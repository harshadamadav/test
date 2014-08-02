/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmrc_practicle;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class Sguage extends MIDlet {
Gauge g;
Display dis;
Form f=new Form("Rate the movie");
    public void startApp() {
        dis=Display.getDisplay(this);
        g=new Gauge("Rate", true, 50, 10);
        f.append(g);
        dis.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
