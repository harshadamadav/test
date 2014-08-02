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
public class Midlet extends MIDlet {

    private Display dis;
    private TextBox txt;
    Midlet()
    {
        dis=Display.getDisplay(this);
        txt=new TextBox("Hello","Hello Harshada" , 100, 0);        
    }
    public void startApp() {
        dis.setCurrent(txt);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
