import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class MainScreen {

	private JFrame frame;
	private JButton play, info, settings,higher,notHigher;
	private JPanel mainPanel,game,southPanel,west;
	private JLabel score,temp;
	private int scoreNum = 0;
	private int tries = 0;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(150, 150, 900, 750);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setVisible(true);
		//Create buttons
		play= new JButton("PLAY");
		play.setFont(new Font("Ariel",Font.BOLD,40));

		info = new JButton("HOW TO PLAY");
		info.setFont(new Font("Ariel",Font.BOLD,40));
		
		settings = new JButton("SETTINGS");
		settings.setFont(new Font("Ariel",Font.BOLD,40));		
		
		//Add the title image
		ImageIcon img = new ImageIcon("../title.png");
		JLabel titleImage = new JLabel(img);
		frame.getContentPane().add(titleImage, BorderLayout.NORTH);
		
		//add the main JPanel
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EmptyBorder(20,100,100,100));
		setMainPanel(menu());
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		createCards();
      	play.addActionListener(e -> {
      		createGame();
      		
      	});
      	
      	info.addActionListener(e -> {
      		String s = "Choose HIGHER if you think the next card will be higher than the current one"
      				+ "\nChoose NOT HIGHER if you think the next card will not be higher than the current one"
      				+ "\nYou can make up to 3 errors";
      		JOptionPane.showMessageDialog(frame, s, "HOW TO PLAY", JOptionPane.INFORMATION_MESSAGE);
      	});
      	
				
	}
	
	private void setMainPanel(JPanel panel) {
		mainPanel.removeAll();
		mainPanel.add(panel, BorderLayout.CENTER);
		frame.repaint();
		frame.revalidate();

	}
		
	private JPanel menu() {
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
        play.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(play);

        main.add(Box.createRigidArea(new Dimension(0,50)));
		
        info.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(info);
        
        main.add(Box.createRigidArea(new Dimension(0,50)));

        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(settings);
        
        main.add(Box.createRigidArea(new Dimension(0,50)));
        
        //Add the image
        ImageIcon img = new ImageIcon("cards.png");
      	JLabel titleImage = new JLabel(img);
      	titleImage.setAlignmentX(Component.CENTER_ALIGNMENT);
      	main.add(titleImage);
		
		return main;
	}
	
	private void createCards() {
		Card as = new Card(new ImageIcon("../AS.png"), 1);
		Card ac = new Card(new ImageIcon("../AC.png"), 1);
		Card ad = new Card(new ImageIcon("../AD.png"), 1);
		Card ah = new Card(new ImageIcon("../AH.png"), 1);
		
		Card s2 = new Card(new ImageIcon("../2S.png"), 2);
		Card c2 = new Card(new ImageIcon("../2C.png"), 2);
		Card d2 = new Card(new ImageIcon("../2D.png"), 2);
		Card h2 = new Card(new ImageIcon("../2H.png"), 2);
		
		Card s3 = new Card(new ImageIcon("../3S.png"), 3);
		Card c3 = new Card(new ImageIcon("../3C.png"), 3);
		Card d3 = new Card(new ImageIcon("../3D.png"), 3);
		Card h3 = new Card(new ImageIcon("../3H.png"), 3);
		
		Card s4 = new Card(new ImageIcon("../4S.png"), 4);
		Card c4 = new Card(new ImageIcon("../4C.png"), 4);
		Card d4 = new Card(new ImageIcon("../4D.png"), 4);
		Card h4 = new Card(new ImageIcon("../4H.png"), 4);
		
		Card s5 = new Card(new ImageIcon("../5S.png"), 5);
		Card c5 = new Card(new ImageIcon("../5C.png"), 5);
		Card d5 = new Card(new ImageIcon("../5D.png"), 5);
		Card h5 = new Card(new ImageIcon("../5H.png"), 5);
		
		Card s6 = new Card(new ImageIcon("../6S.png"), 6);
		Card c6 = new Card(new ImageIcon("../6C.png"), 6);
		Card d6 = new Card(new ImageIcon("../6D.png"), 6);
		Card h6 = new Card(new ImageIcon("../6H.png"), 6);
		
		Card s7 = new Card(new ImageIcon("../7S.png"), 7);
		Card c7 = new Card(new ImageIcon("../7C.png"), 7);
		Card d7 = new Card(new ImageIcon("../7D.png"), 7);
		Card h7 = new Card(new ImageIcon("../7H.png"), 7);
		
		Card s8 = new Card(new ImageIcon("../8S.png"), 8);
		Card c8 = new Card(new ImageIcon("../8C.png"), 8);
		Card d8 = new Card(new ImageIcon("../8D.png"), 8);
		Card h8 = new Card(new ImageIcon("../8H.png"), 8);
		
		Card s9 = new Card(new ImageIcon("../9S.png"), 9);
		Card c9 = new Card(new ImageIcon("../9C.png"), 9);
		Card d9 = new Card(new ImageIcon("../9D.png"), 9);
		Card h9 = new Card(new ImageIcon("../9H.png"), 9);
		
		Card s10 = new Card(new ImageIcon("../10S.png"), 10);
		Card c10 = new Card(new ImageIcon("../10C.png"), 10);
		Card d10 = new Card(new ImageIcon("../10D.png"), 10);
		Card h10 = new Card(new ImageIcon("../10H.png"), 10);
		
		Card sj = new Card(new ImageIcon("../JS.png"), 11);
		Card cj = new Card(new ImageIcon("../JC.png"), 11);
		Card dj = new Card(new ImageIcon("../JD.png"), 11);
		Card hj = new Card(new ImageIcon("../JH.png"), 11);

		Card sq = new Card(new ImageIcon("../QS.png"), 12);
		Card cq = new Card(new ImageIcon("../QC.png"), 12);
		Card dq = new Card(new ImageIcon("../QD.png"), 12);
		Card hq = new Card(new ImageIcon("../QH.png"), 12);
		
		Card sk = new Card(new ImageIcon("../KS.png"), 13);
		Card ck = new Card(new ImageIcon("../KC.png"), 13);
		Card dk = new Card(new ImageIcon("../KD.png"), 13);
		Card hk = new Card(new ImageIcon("../KH.png"), 13);
		
	}
	
	/**
	 * Create the game
	 */
	private void createGame() {
		game = new JPanel();
		game.setBackground(Color.WHITE);
		game.setLayout(new BorderLayout());
		
		Card.shuffleCards();
		Card.initialise();
		//Create centre of the game
		game.add(Card.getImageCard(),BorderLayout.CENTER);
		
		//Create north side of the game
		score = new JLabel("<html>" + scoreNum +"</html>");
		score.setFont(new Font("Ariel",Font.BOLD,25));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setVerticalAlignment(SwingConstants.CENTER);
		game.add(score,BorderLayout.NORTH);

		/**
		 * Create west side of the panel
		 */
		west = new JPanel();
		west.setBackground(Color.WHITE);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		west.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		JButton newGame = new JButton("NEW GAME");
		newGame.setFont(new Font("Ariel",Font.ITALIC,25));
		newGame.addActionListener(e -> {
			createNewGame();
		});
		west.add(newGame);
		
        west.add(Box.createRigidArea(new Dimension(0,25)));

		JButton back = new JButton("BACK");
		back.setFont(new Font("Ariel",Font.ITALIC,25));
		back.addActionListener(e -> {
			setMainPanel(menu());
		});
		west.add(back);
		
		game.add(west, BorderLayout.WEST);
		
		/**
		 * Create not shown label in the EAST SIDE
		 */
		temp = new JLabel("AAAAAAAAAAAAAAAAAAAAA");
		temp.setSize(temp.getMaximumSize());
		temp.setForeground(Color.WHITE);
		game.add(temp, BorderLayout.EAST);
		
		
		//Create south side of the game
		southPanel = new JPanel(new BorderLayout());
		southPanel.setBackground(Color.WHITE);
		
		/**
		 * Create panel which holds the buttons
		 */
		JPanel southBtns = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
		southBtns.setBackground(Color.WHITE);
		southBtns.setBorder(new EmptyBorder(15,15,15,15));
		
		notHigher = new JButton("NOT HIGHER");
		notHigher.setFont(new Font("Ariel",Font.BOLD,25));
		southBtns.add(notHigher);
		
		higher = new JButton("HIGHER");
		higher.setFont(new Font("Ariel",Font.BOLD,25));
		southBtns.add(higher);
		
		//Create label
		JLabel labelInfo = new JLabel("<html>THE NEXT CARD WILL BE</html>");
		labelInfo.setFont(new Font("Ariel",Font.BOLD,30));
		labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
        labelInfo.setVerticalAlignment(SwingConstants.CENTER);
        southPanel.add(labelInfo,BorderLayout.NORTH);	
        
        southPanel.add(southBtns, BorderLayout.CENTER);
		game.add(southPanel,BorderLayout.SOUTH);
			
		
		setMainPanel(game);
		
		/**
		 * BUTTON HIGHER 
		 */
		higher.addActionListener( e -> {
			Card.nextCard();
			if(Card.getCurrentCardValue() > Card.getPreviousCardValue())
			{
				increaseScore();
			}
			else
			{
				increaseTries();
					
			}
			
			refreshGame();	
			
			if(hasLost()) {
				disableButtons();
	      		JOptionPane.showMessageDialog(frame, "You Lost !!!", "LOST", JOptionPane.ERROR_MESSAGE);
			}
			
		 });
		
		/**
		 * BUTTON NOT HIGHER
		 */
		notHigher.addActionListener( e -> {
			Card.nextCard();
			if(Card.getCurrentCardValue() < Card.getPreviousCardValue())
			{
				increaseScore();
			}			
			else
			{
				increaseTries();
					
			}
			
			refreshGame();
			
			if(hasLost()) {
				disableButtons();
	      		JOptionPane.showMessageDialog(frame, "You Lost !!!", "LOST", JOptionPane.ERROR_MESSAGE);
			}
		 });
		initialiseScore();
	}  

	private void refreshGame() {
		
		game.removeAll();
		
		game.add(score,BorderLayout.NORTH);
		game.add(Card.getImageCard(),BorderLayout.CENTER);
		game.add(southPanel,BorderLayout.SOUTH);
		game.add(temp,BorderLayout.EAST);
		game.add(west, BorderLayout.WEST);

		game.repaint();
		game.revalidate();
		if(Card.isLastCard()) {
			disableButtons();
			JOptionPane.showMessageDialog(frame,
				    "This is the last card");
		}
	}
	
	private void disableButtons() {
		notHigher.setEnabled(false);
		higher.setEnabled(false);
	}
	
	private void enableButtons() {
		notHigher.setEnabled(true);
		higher.setEnabled(true);
	}
	
	private void increaseScore() {
		scoreNum++;
		score.setText(""+scoreNum);

	}
	private void initialiseScore() {
		tries = 0;
		scoreNum = 0;
		score.setText("<html>" + scoreNum + "</html>" );
	}

	private void increaseTries() {
		tries++;
	}
	
	private boolean hasLost() {
		if(tries == 3) 
			return true;
		return false;

	}
	
	private void createNewGame() {
		initialiseScore();
		enableButtons();
		createGame();
		
	}
}














