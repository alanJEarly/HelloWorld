package GameMaker;

import java.util.HashMap;
import java.util.Map;



public class InputParse {
	static String cmd;
	static String lastCmd="";
	Map<String, String> parseMap = Bin.InputMap.map();

	 
public void parse() {
	
	cmd=parseMap.get(Bin.win.userInput.toLowerCase());
	
	if (cmd==(null)) {cmd="";}
	if (cmd.equalsIgnoreCase("")) {}
	else {lastCmd=cmd;}
}
	

	

	}
    
    
    
    

