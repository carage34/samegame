/**
 * La classe <code>Menu</code> repr&eacute;sente la premi&agrave; fenetre que va voir l'utilisateur
 * pour choisir son mode de jeu.
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame {
	 /**
	 * Constructeur destin&eacute; uniquement à l'affichage de la fenetre et l'ajout du controller
	 */
	public Menu() {
		super("SameGame");
		this.setSize(800, 450);
		this.setLocation(300, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new Fond("/img/accueil.png"));
		this.setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());
		this.setVisible(true);
		ControllerMouseMenu controller = new ControllerMouseMenu(this);
		this.addMouseListener(controller);
	}


}