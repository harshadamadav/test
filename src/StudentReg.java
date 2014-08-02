/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author megha
 */
public class StudentReg extends MIDlet implements CommandListener{

    Display dis;
    Form f1=new Form("Reg");
    TextField tf1=new TextField("Enter the user name", "", 10, 0);
    TextField tf2=new TextField("Enter the password", "", 10, 0);
    Command ok=new Command("OK", Command.OK, 1);
    Alert a=new Alert("Validity");
    public void startApp() {
        dis=Display.getDisplay(this);
        f1.append(tf1);
        f1.append(tf2);
        f1.addCommand(ok);
        f1.setCommandListener(this);
        dis.setCurrent(f1);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c,Displayable d)
    {
        if(c.getLabel().equals("OK"))
        {
            if(tf1.getString().equals(tf2.getString()))
            {
                a.setType(AlertType.CONFIRMATION);
                a.setString("Valid");
                dis.setCurrent(a);
            }
            else
            {
                 a.setType(AlertType.ERROR);
                 a.setString("InValid");
                dis.setCurrent(a);
            }
        }
    }
}
