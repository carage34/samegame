/**
 * La classe <code>MenuFin</code> repr&eacute;sente la fenetre pour 
 * afficher le score  à la fin de la partie et proposer 
 * au joueur de rejouer ou quitter
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MenuFin extends JFrame {
	/**
	* Constructeur destiné a initialise la fenetre
	* @param s : Le nom de l'image a affiche
	* @param score : le score du joueur &eacute; la fin de la partie
	*/
	public MenuFin(String s, int score) {
		super("SameGame");
		this.setSize(800, 450);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(new Fond(s, score));
		this.addMouseListener(new ControllerMouseMenuFin(this));
		this.setVisible(true);
	}
}