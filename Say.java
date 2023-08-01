package GameMaker;

import javax.swing.JLabel;

public class Say {


	
	  public static void say(String text, int X, int Y) {
	        JLabel[] labels = { Bin.win.line1, Bin.win.line2, Bin.win.line3, Bin.win.line4, Bin.win.line5, Bin.win.line6, Bin.win.line7, Bin.win.line8 };

	        if (X < 1 || X > 8 || Y < 1 || Y > 8 || X > Y) {
	            System.out.println("Err at Util.lines Programer can't count");
	            return;
	        }

	        String[] parts = text.split("/");
	        int partsCount = parts.length;

	        for (int i = 0; i < partsCount && X + i <= Y; i++) {
	            labels[X + i - 1].setText(parts[i]);
	        }
	    }
	
	public static void clear(int x,int y) {  say(cl+cl+cl+cl+cl+cl+cl+cl,x,y);}

static String cl="/----------------------------------------------";
public static void time(int x) {say(Bin.update.stime, x,8);;}}
