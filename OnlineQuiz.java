import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class QuestionSeries{
static String info ="Java Online Quiz System\n\nINSTRUCTIONS:\n\t*There are 25 questions in this test and 25 minutes to complete them all.\n\t*The finish button is highlighted in green when you reach the end of the test. \n\t*Clicking the finish button will display the results with the correct answers marked in Green.  \n \n\t*The timecounter  begins when you click on the 'Start' button \n \nBest of luck!\n";

static String []question ={"Question 1:\nWhich is a reserved word in the Java programming language?",
"Question 2:\nWhich is the valid declarations within an interface definition?",
"Question 3:\nWhich one is a valid declaration of a boolean?",
"Question 4:\nWhich three are valid declarations of a float?\n1. float f1 = -343;\n2. float f2 = 3.14;\n3. float f3 = 0x12345;\n4. float f4 = 42e7;\n5. float f5 = 2001.0D;\n6. float f6 = 2.81F;",
"Question 5:\nWhich of the following are legal lines of code?\n1. int w = (int)888.8;\n2. byte x = (byte)1000L;\n3. long y = (byte)100;\n4. byte z = (byte)100L;",
"Question 6:\nWhich two statements are equivalent?\n1. 16*4\n2. 16>>2\n3. 16/2^2\n4. 16>>>2",
"Question 7:\nWhich two statements are equivalent?\n1. 3/2\n2. 3<2\n3. 3*4\n4. 3<<2",
"Question 8:\nWhich two are equal?\n1. 32/4\n2. (8>>2)<<4\n3. 2^5\n4. 128>>>2\n5. 2>>5",
"Question 9:\nYou want subclasses in any package to have access to members of a superclass. Which is the most restrictive access that accomplishes this objective?",
"Question 10:\nWhat is the most restrictive access modifier that will allow members of one class to have access to members of another class in the same package?",
"Question 11:\nYou want a class to have access to members of another class in the same package. Which is the most restrictive access that accomplishes this objective?",
"Question 12:\nWhich of the following class level (nonlocal) variable declarations will not compile?",
"Question 13:\nWhich is a valid declaration within an interface?",
"Question 14:\nWhich statement is true?",
"Question 15:\nWhich four can be thrown using the throw statement?\n1. Error\n2. Event\n3. Object\n4. Throwable\n5. Exception\n6. RuntimeException",
"Question 16:\nWhich statement is true?",
"Question 17:\n	Which two are valid constructors for Thread?\n1. Thread(Runnable r, String name)\n2. Thread()\n3.Thread(int priority)\n4. Thread(Runnable r, ThreadGroup g)\n5.Thread(Runnable r, int priority)",
"Question 18:\nWhich three are methods of the Object class\n1. notify();\n2. notifyAll();\n3. isInterrupted();\n4. synchronized();\n5. interrupt();\n6. wait(long msecs);\n7. sleep(long msecs);\n8. yield();",
"Question 19:\nWhich cannot directly cause a thread to stop executing?",
"Question 20:\nWhich of the following will directly stop the execution of a Thread?",
"Question 21:\nWhich method must be defined by a class implementing the java.lang.Runnable interface?",
"Question 22:\nWhich method registers a thread in a thread scheduler?",
"Question 23:\nWhich class or interface defines the wait(), notify(),and notifyAll() methods?",
"Question 24:\nWhich is true about an anonymous inner class?",
"Question 25:\nWhich is true about a method-local inner class?"
};


static String [][]answers ={{"\nmethod\n","\nnative\n","\nsubclasses\n","\nreference\n"},{"\npublic double methoda();\n","\npublic final double methoda();\n","\nstatic void methoda(double d1);\n","\nprotected void methoda(double d1);\n"},{"\nboolean b1 = 0;\n","\nboolean b2 = 'false';\n","\nboolean b3 = false;\n","\nboolean b4 = Boolean.false();\n"},{"\n1, 2, 4\n","\n2, 3, 5\n","\n1, 3, 6\n","\n2, 4, 6\n"},{"\n1 and 2\n","\n2 and 3\n"," \n3 and 4\n","\nAll statements are correct.\n"},{" \n1 and 2\n"," \n2 and 4\n"," \n3 and 4\n"," \n1 and 3\n"},{" \n1 and 2\n"," \n2 and 3\n"," \n3 and 4\n"," \n1 and 4\n"},{" \n1 and 2\n"," \n2 and 4\n"," \n1 and 3\n"," \n2 and 3\n"},{" \npublic\n"," \nprivate\n"," \nprotected\n"," \ntransient\n"},{" \npublic\n"," \nabstract\n"," \nsynchronized\n"," \ndefault access\n"},{" \npublic\n"," \nprivate\n"," \nprotected\n"," \ndefault access\n"},{" \nprotected int a;\n"," \ntransient int b = 3;\n"," \nprivate synchronized int e;\n"," \nvolatile int d;\n"},{"\npublic static short stop = 23;\n"," \nprotected short stop = 23;\n"," \ntransient short stop = 23;\n"," \nfinal void madness(short stop);\n"},{"\ncatch(X x) can catch subclasses of X where X is a subclass of Exception.\n","\nThe Error class is a RuntimeException.\n","\nAny statement that can throw an Error must be enclosed in a try block.\n","\nAny statement that can throw an Exception must be enclosed in a try block.\n"},{" \n1,2,3and 4\n"," \n2,3,4 and 5\n"," \n1,4,5 and 6\n"," \n2,4,5 and 6\n"},{"\nA try statement must have at least one corresponding catch block.\n","\nMultiple catch statements can catch the same class of exception more than once.\n","\nAn Error that might be thrown in a method must be declared as thrown by that method, or be handled within that method.\n","\nExcept in case of VM shutdown, if a try block starts to execute, a corresponding finally block will always start to execute.\n"},{"\n1 and 3\n","\n2 and 4\n","\n1 and 2\n","\n2 and 5\n"},{"\n1,2,7\n","\n2,4,5\n","\n1,2,6\n","\n2,3,8\n"},{"\nCalling the SetPriority() method on a Thread object.\n","\nCalling the wait() method on an object.\n","\nCalling notify() method on an object.\n","\nCalling read() method on an InputStream object.\n"},{"\nwait()\n","\nnotify()\n","\nnotifyall()\n","\nexits synchronized code\n"},{"\nvoid run()\n"," \npublic void run()\n"," \npublic void start()\n"," \nvoid run(int priority)\n"},{"\nrun();\n","\nconstruct();\n","\nstart();\n","\nregister();\n"},{"\nObject\n","\nThread\n","\nRunnable\n","\nClass\n"},{"\nIt can extend exactly one class and implement exactly one interface.\n","\nIt can extend exactly one class and can implement multiple interfaces.\n","\nIt can extend exactly one class or implement exactly one interface.\n"," \nIt can implement multiple interfaces regardless of whether it also extends a class.\n"},{"\nIt must be marked final.\n","\nIt can be marked abstract.\n","\nIt can be marked public.\n","\nIt can be marked static.\n"}};

static int []n = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
static String []choice= {"2","1","3","3","4","2","3","2","3","4","4","3","1","1","3","4","3","3","3","1","2","3","1","3","2"};
static int tally = choice.length;
static String testtitle="Java Programming Online Quiz";
static int timeLimit =25;
static int passMark = 40;
}

/* OnlineQuiz class */

public class OnlineQuiz extends JFrame{
    	static String studentname ="";
    	static int TOTAL=0;
	static {
		try{
			TOTAL = QuestionSeries.tally;		
			/* The input window */
			studentname = JOptionPane.showInputDialog("Enter your name: ");
			if(studentname.length() < 1) studentname = "Anonymous   ";
			else studentname = studentname.trim() + " ";
		}catch(NullPointerException e){ System.exit(0); }
	}	

    	int seconds, minutes;
    	int quesnum, itemCheck, mark; 
	final String TESTTITLE = QuestionSeries.testtitle;
    	final int TIMELIMIT = QuestionSeries.timeLimit;
    	final int PASS = QuestionSeries.passMark;
    	String []answers = new String[TOTAL];
	JButton []choice_button = new JButton[6];
	JTextArea answerboxes[] = new JTextArea[4];
	JCheckBox []boxes = new JCheckBox[4];
    	JTextPane pane = new JTextPane();
	JLabel student, choose, message, timecounter, testresult;
    	boolean start_test, check_answer, allowRestart, finishtest;
	Northwindow panelNorth = new Northwindow();
	Southwindow panelSouth = new Southwindow();
	Centerwindow panelCenter = new Centerwindow();

/*  OnlineQuiz Constructor */
	protected OnlineQuiz(){
        for (int i=0; i<TOTAL; i++) answers[i] ="";
		getContentPane().setLayout(new BorderLayout() );
		getContentPane().add("North", panelNorth);
		getContentPane().add("South", panelSouth);
		getContentPane().add("Center", panelCenter);
		int width = 0, height=0; 
	        if(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth()<799){width=640;height=460; }
	        else {width=720; height=540; }
		setSize(width,height);
		Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width-width)/2, (dim.height-height)/2);
	}

/**
**  Northwindow class
**/

class Northwindow extends JPanel{

/**
**  Northwindow constructor 
**/
    	public Northwindow(){
		setLayout(new GridLayout(2,2));
		setBackground(new Color(230, 230, 255));
		student = new JLabel("\t Welcome "+studentname+" to the Online Java Quiz");
		student.setFont(new Font("",Font.BOLD,16) );
		message = new JLabel();
		message.setForeground(Color.blue);
		add(student);
		add(message);
		add(new JLabel("               ") );
		add(new JLabel("               ") );
        	setBorder(BorderFactory.createEtchedBorder() );
	}
}
//
/**
**  Southwindow class
**/
class Southwindow extends JPanel{
	public Southwindow(){
		String []key = {"","Start","Next","Finish","Check Next","Check Previous"};
			for(int i=0; i<choice_button.length; i++)
                   	{
				choice_button[i] = new JButton(key[i]);
				choice_button[i].addActionListener(new ActionHandler() );
				if(i !=0)add(choice_button[i]);
			}
        	setBorder(BorderFactory.createEtchedBorder() );
	}
}

/**
**  Centerwindow class 
**/
class Centerwindow extends JPanel{

	public Centerwindow(){
		setLayout(new GridLayout(1,2) );
		JScrollPane west = new JScrollPane(pane);       
		pane.setForeground(Color.black);	       
   		pane.setFont(new Font ("monospaced",0,20) );
		pane.setText(QuestionSeries.info);
		pane.setEditable(false);
		JPanel east = new JPanel();
		east.setLayout(new BorderLayout() );	
		JPanel northEast = new JPanel();
		northEast.setBackground(new Color(230, 230, 255) ); 
		east.add("North", northEast);
		JPanel westEast = new JPanel();
		westEast.setLayout(new GridLayout(6,1) );
		east.add("West", westEast);
		JPanel centerEast = new JPanel();
		centerEast.setLayout(new GridLayout(6,1) );
		centerEast.setBackground(new Color(255,255,200));
		east.add("Center", centerEast);       
		timecounter = new JLabel("     There are "+TOTAL+" questions in total");
		timecounter.setFont(new Font ("Arial",Font.BOLD,16) );
		timecounter.setForeground(new Color(0,90,20) );
		northEast.add(timecounter);
		westEast.add(new JLabel(" "));
        	String []boxs = {" A ", " B ", " C ", " D "};
		for(int i=0; i<boxes.length; i++) { 
			boxes[i] = new JCheckBox(boxs[i]);
			boxes[i].addItemListener(new ItemHandler() );
			westEast.add(boxes[i]);
		}
        	westEast.add(new JLabel() );
		choose = new JLabel("    CHOOSE CORRECT ANSWERS");
		choose.setBorder(BorderFactory.createEtchedBorder() );
		centerEast.add(choose);
        	JScrollPane panes[] = new JScrollPane[4];
		for(int i=0; i<answerboxes.length; i++){
			answerboxes[i] = new JTextArea();
			answerboxes[i].setBorder(BorderFactory.createEtchedBorder() );
			answerboxes[i].setEditable(false);
			answerboxes[i].setBackground(Color.white);
			answerboxes[i].setFont(new Font("",0,20) );
	            	answerboxes[i].setLineWrap(true);      
                	answerboxes[i].setWrapStyleWord(true);
                	panes[i] = new JScrollPane(answerboxes[i]);
			centerEast.add(panes[i]);
		}
		if(TIMELIMIT >0)testresult = new JLabel(studentname+",   You have only  "+TIMELIMIT+" minutes to complete.");   
		else testresult = new JLabel("     There is no time limit for this test");
		testresult.setBorder(BorderFactory.createEtchedBorder() );
		centerEast.add(testresult);
		add(west);
		add(east);
	}
}

/**
**  ActionHandler class to handle all the action events from the buttons. 
**/

class ActionHandler implements ActionListener{

/* actionPerformed method */
	public void actionPerformed(ActionEvent evt){
	  String source = evt.getActionCommand();
		if(source.equals("Start")){
			choice_button[1].setVisible(false);
			start_test=true;
			allowRestart=true;
            	if(TIMELIMIT >0)new Timer(); // inner Timer class 
			panelSouth.remove(choice_button[1]); //start
            	displayquestion();            
        }
	if(start_test){
		if(source.equals("Previous"))  {            			
			recordanswer();
			quesnum--;
    		if(quesnum ==  -1) quesnum=TOTAL-1;
			checkteststatus();
            	displayquestion(); 
		}
		if(source.equals("Next")) {
			recordanswer();
			quesnum++;            
			if(quesnum ==  TOTAL-1) finishtest=true;
			if(quesnum ==  TOTAL) quesnum=0;
            		checkteststatus();
            		displayquestion(); 
		}
		if(source.equals("Finish")) {
			if (finishtest){
				recordanswer();
				quesnum = 0;

				
				timecounter.setForeground(Color.blue);
				timecounter.setFont(new Font ("Arial",0,14) );
				start_test=false; 
				check_answer=true;
				panelSouth.add(choice_button[0]);
				mark_ques();
				displayquestion();
				checkteststatus();
				calculateResult();
			}
			else  JOptionPane.showMessageDialog(null,"Cycle through all questions before pressing finish",
														       "User Message",JOptionPane.INFORMATION_MESSAGE);
		}
	} 

	if (check_answer){
		if(source.equals("Check Next")) {
			quesnum++;
			if(quesnum ==  TOTAL) quesnum=0;
			mark_ques();
			displayquestion();
			checkteststatus();
		}
		if(source.equals("Check Previous")) {
			quesnum--;
			if(quesnum ==  -1) quesnum=TOTAL-1;
			mark_ques();
			displayquestion();
			checkteststatus();
		}
	}
	validate();        
	}

/* Timer class */

class Timer extends Thread implements Runnable{
	public Timer(){
		new Thread(this).start();
	}

    	public void run() {
		while(start_test){
            		try {
               			Thread.sleep(1000);
               			seconds++;
				if(seconds % 60 == 0 && seconds != 0){
                    			seconds -= 60;
                    			minutes++;
				}
				timecounter.setText("    Time Counter:  "+minutes+" mins : "+seconds+" secs ");
				if(minutes==TIMELIMIT){
					start_test=false;
					endTest();
                		}
		    	}
            		catch(InterruptedException ex)  { System.out.print(ex); }
			}
    	}
}

/* checkteststatus method */

		public void checkteststatus(){
		if((quesnum ==  TOTAL-1)&&(start_test))choice_button[3].setBackground(Color.green);
		
      	  	if(answers[quesnum].length() >0){ 
			for(int i=0; i<answers[quesnum].length(); i++)
			boxes[Integer.parseInt(answers[quesnum].substring(i,i+1) )-1].setSelected(true);
		}
		else for(int i=0; i<boxes.length; i++)boxes[i].setSelected(false);
		}

/* displayquestion method */

	public void displayquestion(){
        int j = quesnum+1;
	pane.setText(QuestionSeries.question[quesnum]);
	if(start_test)message.setText("Question "+j+" out of "+TOTAL);
        for (int i=0; i<4; i++)answerboxes[i].setText(QuestionSeries.answers[quesnum][i]);
	if(start_test){
            	String temp="";
		if(QuestionSeries.n[quesnum]==1) temp="<html>&nbsp;&nbsp;&nbsp;Choose only <b>ONE</b>  Option</html>";
		else if(QuestionSeries.n[quesnum]==2) temp="<html>&nbsp;&nbsp;Choose <b>TWO </b> Options</html>";
		else if(QuestionSeries.n[quesnum]==3) temp="<html>&nbsp;&nbsp;Choose <b>THREE</b> Options</html>";
            	else temp="<html>&nbsp;&nbsp;<b>ALL are true</b> true</html>";
		choose.setText(temp);
	}
	else {
		timecounter.setText("    Your choices are shown in the boxes");
            	choose.setText("    Correct answers are marked in Green Colour.");
	     }
	}

/* record answer method */

	public void recordanswer(){
	String tmp = "";
	for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected() ) tmp +=i+1;
        answers[quesnum] = tmp;
    }

/* endTest method */ 

	public void endTest(){
		message.setText("TIME OVER: Please Press 'Finish'");
        	choice_button[2].setEnabled(false); 
        	choice_button[3].setEnabled(false); 
        	choice_button[4].setEnabled(true); 
	}

/* mark_ques() method to highlight correct answers */

	public void mark_ques(){
		for(int i=0; i<answerboxes.length; i++) answerboxes[i].setBackground(Color.white);
		for(int i=0; i<QuestionSeries.choice[quesnum].length(); i++)
			answerboxes[Integer.parseInt(QuestionSeries.choice[quesnum].substring(i,i+1))-1].setBackground(Color.green);
		if(QuestionSeries.choice[quesnum].equals(answers[quesnum])) message.setText("Answer Correct, Well Done!");
		else message.setText("Sorry, You Got This One Wrong.");
	}


	public void calculateResult(){
		mark=0;
		double temp=0.0;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#0.#");
		for(int i=0; i<TOTAL; i++)if(QuestionSeries.choice[i].equals(answers[i]))mark++;
		temp=(double)mark;
		if(temp/TOTAL*100 >=PASS) testresult.setText("  Well done "+studentname.substring(0,studentname.indexOf(' ') )+", you passed");
		else testresult.setText("  Better luck next time "+studentname.substring(0,studentname.indexOf(' ') ) );
		student.setText(" Final score for "+studentname+":  "+mark+" out of "+TOTAL+":  "+df.format(temp/TOTAL*100)+"%");
		new Resultwindow().show();
	}
}

/* Resultwindow class */

class Resultwindow extends JFrame{
		Resultwindow() {
      			super( studentname+" results: " +(mark*100/TOTAL >=PASS?"PASS":"FAIL") );
  			Container cont = getContentPane();
			cont.setLayout(new GridLayout(TOTAL/2+3,5,2,5) );
			cont.setBackground(new Color(255,220,255) );
			cont.add(new JLabel("  "+"Marks:    "+mark+"/"+TOTAL+": "+"Percentage:  "+(mark*100/TOTAL)+"%") );
           		for(int i=0; i<3; i++)cont.add(new JLabel() );
      	  		String temp[] = new String[TOTAL];
			for(int i=0; i<TOTAL; i++){
				if(QuestionSeries.choice[i].equals(answers[i])) temp[i]="correct";
				else temp[i]="wrong";
			}
			for(int i=0; i<TOTAL; i++) cont.add(new JLabel("  Question "+(i+1)+":  "+temp[i]) );
			pack();
			setLocation(200,200);
		}
}

/* ItemHandler class */

class ItemHandler implements ItemListener{
	public void itemStateChanged(ItemEvent evt){
	  	if(start_test){
			for(int i=0; i<boxes.length; i++) if(boxes[i].isSelected() ) itemCheck++; 
			if(itemCheck > QuestionSeries.n[quesnum]){
				java.awt.Toolkit.getDefaultToolkit().beep();
            			if(QuestionSeries.n[quesnum]==1)	
					JOptionPane.showMessageDialog(null,"<html><font size='4' color='00308a'><center>"+
      					"There is only "+QuestionSeries.n[quesnum]+" possible<br> answer to question "+(quesnum+1)+
                    			"<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null,"<html><font size='4' color='00308a'><center>"+
                    			"There are only "+QuestionSeries.n[quesnum]+" possible<br> answers to question "+(quesnum+1)+
                    			"<html>","User Information Message",JOptionPane.INFORMATION_MESSAGE);
			}
			itemCheck=0;
	  	}	  
	}
}

/*  main method */

	public static void main(String [] args){
		OnlineQuiz frame = new OnlineQuiz();
		frame.setTitle("    "+QuestionSeries.testtitle);
		frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
		frame.setVisible(true);
    }
}
