/**
 * La classe <code>Fond</code> est destine a afficher le fond
 * et le score si donné au constructeur
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.lang.*;

public class Fond extends JComponent{
    /**
    * Image a mettre en fond
    */

	private Image fond;

    /**
    * Le score a affiche
    */

	private int score = -1;

    /**
    * Constructeur destine a recuperer le chemin
    * vers l'image a afficher en fond
    * @param s : la chaine de caractere
    */
	public Fond(String s) {
		super();
        this.fond = getToolkit().getImage(this.getClass().getResource(s));
    }

    /**
    * Constrcuteur destine a afficher l image et le score
    */
	public Fond(String s, int score) {
		super();
		this.fond = getToolkit().getImage(this.getClass().getResource(s));
		this.score = score;
	}

	public void paintComponent(Graphics g) {
		if (this.isOpaque()) {

      		g.setColor(this.getBackground());
      		g.fillRect(0, 0, this.getWidth(), this.getHeight());
    	}
    	g.drawImage(this.fond, 0, 0, this);

    	if(this.score > 0) {
    		Font f = null;
    		try {
                f = Font.createFont(0, getClass().getResourceAsStream("/font/comic.ttf")).deriveFont(Font.BOLD,25F);
    		} catch(Exception e) {
    			System.out.println("Erreur d'ouverture");
    		}
    		g.setFont(f);
    		g.drawString("Score : "+this.score, 100, 250);
    	}
	}
}