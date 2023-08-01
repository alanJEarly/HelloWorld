package GameMaker;

public class Update {

String stime="";
String cmd="";
String lastCmd="";
void update() throws InterruptedException {


	 
		if(cmd.equals("x")) {Bin.say.say("///Goodbye////", 1, 8);System.exit(0);}
		Thread.sleep(Bin.setUp.gamespeed);
		
		Bin.InputParse.parse();
		cmd=Bin.InputParse.cmd;
		lastCmd=Bin.InputParse.lastCmd;
		Bin.say.say(lastCmd, 2, 2);
	
	
	
}

}