import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Card {

	private JLabel imgLabel;
	private int cardId;
	private static ArrayList<Card> cards = new ArrayList<>();
	private static int currentCard = 0;
	
	public Card(ImageIcon img, int value) {
		cardId = value; 
		imgLabel = new JLabel(img);
		
		//stores all the cards
		cards.add(this);
		
	}
		
	private JLabel getImage() {
		return imgLabel;
	}
	
	private int getValue() {
		return cardId;
	}
	
	/**
	 * Returns the card that will be shown
	 * @return JLabel
	 */
	public static JLabel getImageCard() {
		JLabel l = new JLabel();
		l.setFont(new Font("Ariel",Font.BOLD,40));

		
		
		return cards.get(currentCard).getImage();
				 			
	}
	/**
	 * Shuffle cards in random order
	 */	
	public static void shuffleCards() {
		Collections.shuffle(cards);

	}
		
	public static void nextCard() {
		currentCard++;
	}
	
	public static void initialise() {
		currentCard =0 ;
	}
	
	public static boolean isLastCard() {
		if(currentCard == cards.size()-1)
			return true;
		return false;
	}
	
	
	public static int getCurrentCardValue() {
		return cards.get(currentCard).getValue();
	}
	public static int getPreviousCardValue() {
		return cards.get(currentCard-1).getValue();
	}

}

