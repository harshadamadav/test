package pmrc_practicle;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
public class GuiTests extends MIDlet implements CommandListener
{
Display display;
List menu;
List choose;
TextBox input;
Ticker ticker = new Ticker("Test GUI Components");
final Alert soundAlert = new Alert("Sound alert");
DateField date = new DateField ("Today's date:",DateField.DATE);
Form form=new Form("FRorm for stuff");
Form today=new Form("Today's date");
Gauge gauge=new Gauge("Progress bar",false,20,9);
TextField textfield=new TextField("Text Field Label","abc",50,0);
static final Command backCommand=new Command("Back",Command.BACK,0);
static final Command mainMenuCommand= new Command("Main",Command.SCREEN,1);
static final Command exitCommand=new Command("Exit",Command.STOP,2);
String currentMenu;
public GuiTests()
{
}

public void startApp() throws MIDletStateChangeException
{
display=Display.getDisplay(this);
menu=new List("Test Components",Choice.IMPLICIT);
menu.append("Text TextBox",null);
menu.append("Test List",null);
menu.append("Test Alert",null);
menu.append("Test Date",null);
menu.append("Test Form",null);
menu.addCommand(exitCommand);
menu.setCommandListener(this);
menu.setTicker(ticker);
mainMenu();
form.append(gauge);
form.append(textfield);
today.append(date);
}
protected void pauseApp()
{
display=null;
choose=null;
menu=null;
ticker=null;
form=null;
today=null;
input=null;
gauge=null;
textfield=null;
}

protected void destroyApp(boolean unconditional) throws MIDletStateChangeException
{
notifyDestroyed();
}

void mainMenu()
{
display.setCurrent(menu);
currentMenu="Main";
}

public void testTextBox()
{
input=new TextBox("Enter some text:"," ",10,TextField.ANY);
input.setTicker(new Ticker("Testing TextBox"));
input.addCommand(backCommand);
input.setCommandListener(this);
input.setString("");
display.setCurrent(input);
currentMenu="input";
}

public void testList()
{
choose=new List("Choose items",Choice.MULTIPLE);
choose.setTicker(new Ticker("Testing List"));
choose.addCommand(backCommand);
choose.setCommandListener(this);
choose.append("Item 1",null);
choose.append("Item 2",null);
display.setCurrent(choose);
currentMenu="list";
}

public void testAlert()
{
soundAlert.setType(AlertType.ERROR);
soundAlert.setString("**ERROR**");
display.setCurrent(soundAlert);
}
public void testDate()
{
java.util.Date now=new java.util.Date();
date.setDate(now);
today.addCommand(backCommand);
today.setCommandListener(this);
display.setCurrent(today);
currentMenu="date";
}
public void testForm()
{
form.addCommand(backCommand);
form.setCommandListener(this);
display.setCurrent(form);
currentMenu="form";
}
public void commandAction(Command c,Displayable d)
{
String label=c.getLabel();
if(label.equals("Exit"))
{
try{
destroyApp(true);
}
catch(MIDletStateChangeException ex)
{
ex.printStackTrace();
}
}
else if(label.equals("Back"))
{
if(currentMenu.equals("list") || currentMenu.equals("input") || currentMenu.equals("date") || currentMenu.equals("form"))
{
mainMenu();
}
}
else
{
List down=(List)display.getCurrent();
switch(down.getSelectedIndex())
{
case 0: testTextBox(); break;
case 1: testList(); break;
case 2: testAlert(); break;
case 3: testDate(); break;
case 4: testForm(); break;
}
}
}
}
