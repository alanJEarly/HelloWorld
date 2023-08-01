package GameMaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class UserWindow extends JFrame implements ActionListener {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;
    Font FT;
    Font FST;
    Font Dflt;
    JLabel lineT;
    JLabel lineST;
    JLabel line1;
    JLabel line2;
    JLabel line3;
    JLabel line4;
    JLabel line5;
    JLabel line6;
    JLabel line7;
    JLabel line8;
   
    JPanel panel;
    JButton button;
    JTextField tell;
//winsetup defines the ui windows default state.
    public void winsetup( ) {
        frame = new JFrame();
        // ImageIcon image = new ImageIcon("")
        // frame.setIconImage(image.getImage)
        FT= new Font("COMICSANS",Font.BOLD | Font.ITALIC,25);
 
        FST=new Font("Comicsans",Font.BOLD,22);
        Dflt=new Font("Times New Roman",Font.PLAIN,20);
        
        lineT=new JLabel("Adventure");
	     lineT.setFont(FT);
	     
        lineST = new JLabel("Welcome");
        lineST.setFont(FST);
      
        
        line1 = new JLabel("--");
        line2= new JLabel("");
        line3 = new JLabel("--");
        line4 = new JLabel("---");
        line5 = new JLabel("------");
        line6 = new JLabel("-----");
        line7 = new JLabel("----");
        line8 = new JLabel("---");
        

        line1.setFont(Dflt);    line5.setFont(Dflt);    
        line2.setFont(Dflt); 	line6.setFont(Dflt);     
        line3.setFont(Dflt);	line7.setFont(Dflt);
        line4.setFont(Dflt);    line8.setFont(Dflt);
        
        button = new JButton();
        tell = new JTextField(10);
        button.setText("Enter");
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(75, 60));

        line1.setText("");

        frame.setTitle(Bin.setUp.Title);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());

        panel.setBackground(new Color(10, 150, 110));
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.SOUTH;

         // Add lineT label
         constraints.gridy = 0;
         panel.add(lineT, constraints);

         // Add lineST label
         constraints.gridy = 1;
         panel.add(lineST, constraints);

         // Add location label
         constraints.gridy = 2;
         panel.add(line1, constraints);

         // Add location label
         constraints.gridy = 3;
         panel.add(line2, constraints);

         // Add text field
         constraints.gridy = 4;
         panel.add(tell, constraints);

         // Add button
         constraints.gridy = 5;
         constraints.anchor = GridBagConstraints.NORTH;
         constraints.anchor = GridBagConstraints.CENTER;
         panel.add(button, constraints);

          // Add line3 label
          constraints.gridy = 6;
          panel.add(line3, constraints);

          // Add line4 label
          constraints.gridy = 7;
          panel.add(line4, constraints);

          // Add line5 label
          constraints.gridy = 8;
          panel.add(line5, constraints);

          // Add line6 label
          constraints.gridy = 9;
          panel.add(line6, constraints);

          // Add line7 label
          constraints.gridy = 10;
          panel.add(line7, constraints);

          // Add line8 label
          constraints.gridy = 11;
          panel.add(line8, constraints);

          frame.add(panel);

          frame.setResizable(true);
          frame.setSize(Bin.setUp.sizex,Bin.setUp.sizey );
          frame.setVisible(true);
          frame.getContentPane().setBackground(new Color(0, 30, 20));

          frame.getRootPane().setDefaultButton(button);
          
     
    }


      public void actionPerformed(ActionEvent e) {
    	  userInput = tell.getText();/*when the butten is pressed
    	  UserInput is set = to whatever the user types in the text field  */
       try {
		Thread.sleep(Bin.setUp.gamespeed);/*the thread is put to sleep for what ever the-
		speed limiter is set to, this is done so the player has the chance to see there text before 
		clear() is called and it all disappears, this also gives the system a chance to read userInput*/
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
       clear();//the clear method clears the user input and the text field;
    }
    
    String userInput="";
    
        
        
    

    public String getUserInput() {//when called this gives user input
    	return userInput;
    }
    
public void clear() {tell.setText("");//see actionPreformed 
userInput="";
}


    
        

    }

