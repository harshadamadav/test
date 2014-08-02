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
public class formui4 extends MIDlet implements CommandListener {
    
    private Command exit=new Command("Exit", Command.EXIT ,1);
    private TextBox t;
    private Display d;
    
    public formui4()
    {
        String msg;
        d=Display.getDisplay(this);
        if(d.isColor())
        {
            msg="Color Display";
        }
        else
        {
            msg="No Color Display";
        }
        t=new TextBox("CD", msg, 50, 0);
        t.addCommand(exit);
        t.setCommandListener(this);
    }

    public void startApp() {
        d.setCurrent(t);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c,Displayable d)
    {
        if(c.getLabel().equals("Exit"))
        {
            notifyDestroyed();
        }
    }
}
