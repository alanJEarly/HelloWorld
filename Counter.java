package GameMaker;

public class Counter {
	static String sruntime="";
	static int hour=6;
	static int min=0;
	static int sec=0;
	static String AmPm="am";
	static String sClock="";
	
	
	static int runtime=0;
	int[] flag = new int [100];
	
	 public int flag(int x,int y, String set) {//This method controls the settings of the flag array
	     	if (set.equals("u")) {
	            flag[x]++;
	        } else if (set.equals("d")) {
	            flag[x]--;
	        }else if (set.equals("set")) 
	        {flag[x]=y;}
	        // For  other value, flag[x] remains the same
int z=flag[x];
	        return z;
	    }
	 
	 
	 public static int runtime(int x,String set){
		 switch(set) {case "u":runtime++;break;
		 			  case"d":runtime--; break;
		 			  case"set":runtime=x;break;}
		 sruntime= String.valueOf(Bin.count.runtime);
 
		  return runtime;}


	public void clock() {
		String minzero="";
	runtime(0,"u");
	sec++;
	if(sec==60) {min++;sec=0;if (min==60) {hour++;if(hour==12) {hour=1;if (AmPm.equals("pm")) {AmPm="am";}else AmPm="pm"; };
	min=0;}}
	if (min==0) {minzero="0";}else minzero="";
	 sClock=(hour+":"+min+minzero+AmPm+"."+sec);
System.out.println(sClock);	}
	 
	
	 
	 
	
}
