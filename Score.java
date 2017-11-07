/**
 * La classe <code>Score</code> represente le label qui affiche le score
 *  classe Menu
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Score extends JLabel {
	private int score = 0;
	/**
	* Constructeur qui initialise le score
	*/
	public Score() {
		super();
		Font font = new Font("TYPE1_FONT", Font.BOLD, 33);
		this.setFont(font);
		this.setText("Score : " + this.score);
	}
	/**
	* Methode qui permet de mettre a jour le score
	*/
	public void setScore(int s) {
		this.score = s;
		this.setText("Score : " + this.score);
	}
}