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
public class Highapi6 extends MIDlet implements CommandListener{
Display dis;
List menu;
Command exit=new Command("Exit",Command.EXIT,1);
Command back =new Command("Back",Command.BACK,0);
TextBox t;
List clist;
Alert sa=new Alert("Sound Alert");
Form f2=new Form("Today's Date Displayer:");
DateField date=new DateField("Today's Date", DateField.DATE);
Form f1=new Form("Form filler ");
Gauge g=new Gauge("Prgress bar", true, 10, 5);
TextField tb=new TextField("Enter the name ", "", 20,0);

    public void startApp() {
        dis=Display.getDisplay(this);
        menu=new List("Main Menu",List.IMPLICIT);
        menu.append("Text Box",null );
        menu.append("Lists",null );
        menu.append("Alert",null );
        menu.append("Date",null );
        menu.append("Form",null );
        menu.addCommand(exit);
        menu.setCommandListener(this);
        dis.setCurrent(menu);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    void testDate()
    {
        java.util.Date now= new java.util.Date();
        date.setDate(now);
        f2.addCommand(back);
        f2.append(date);
        f2.setCommandListener(this);
        dis.setCurrent(f2);
    }
    void testText()
    {
        t=new TextBox("Enter the text", "", 500, 0);
        t.addCommand(back);
        t.setCommandListener(this);
        dis.setCurrent(t);
    }
    void testAlert()
    {
        sa.setType(AlertType.ERROR);
        sa.setString("Alerting.....!!!");
        dis.setCurrent(sa);
    }
    void testform()
    {
        f1.append(g);
        f1.append(tb);
        f1.addCommand(back);
        f1.setCommandListener(this);
        dis.setCurrent(f1);
    }
    void list()
    {
        clist=new List("Choose item ",List.MULTIPLE);
        clist.append("Product 1", null);
        clist.append("Product 2",null);
        clist.addCommand(back);
        clist.setCommandListener(this);
        dis.setCurrent(clist);
    }
    
    public void commandAction(Command c,Displayable d)
    {
        if(c.getLabel().equals("Exit"))
        {
            notifyDestroyed();
        }
        else if(c.getLabel().equals("Back"))
        {
            dis.setCurrent(menu);
        }
        else
        {
            List si=(List)dis.getCurrent();
            switch(si.getSelectedIndex())
            {
                case 0: testText();break;
                case 1:list();break;
                case 2:testAlert();break;
                case 3:testDate();break;
                case 4: testform();   break;
            }
        }
    }
}
