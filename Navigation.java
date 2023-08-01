package GameMaker;

import java.util.HashMap;


public class Navigation {
	public HashMap<Integer, String> viewParse = new HashMap<>();

	
	
	public int stepNorth(int y){return y++;}
	
	public int stepSouth(int y) {return y--;}
	
	public int stepEast(int x) {return x++;}
	
	public int stepWest(int x) {return x--;}
	

	

	public int look(String v) {
		
		
		
		return 0;}
	

	
	
	
	  public HashMap<Integer, String> viewParse(String set) {
		  	
	        viewParse.put(1, "n");
	        viewParse.put(2, "s");
	        viewParse.put(3, "e");
	        viewParse.put(4, "w");
	        viewParse.put(5, "d");
	        viewParse.put(6, "u");
	        viewParse.put(7,"c");
	return viewParse;
	

	
	
}}
