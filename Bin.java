package GameMaker;

public class Bin {
    static UserWindow win;
    static Run run;


    static Update update;
    static Counter count; 
    static Directroy dir;
    static SetUp	setUp;
    static Say say;
    static GameLogic GameLogic;
    static Player Player;
    static InputMap InputMap;
    static InputParse InputParse;
    public Bin() {
        // Create instances of other classes in the constructor
    	InputParse=new InputParse();
       win = new UserWindow();
        run = new Run();
        InputMap = new InputMap();
        update=new Update();
        count=new Counter();
        dir=new Directroy();
        setUp=new SetUp();
        say=new Say();
        GameLogic=new GameLogic();
        Player=new Player();
        
    
        
    }}

  
