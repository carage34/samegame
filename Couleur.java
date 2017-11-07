/**
 * La classe <code>Couleur</code> est destine a dessiner les images
 * correspondant au bloc dans la grille
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Couleur extends JPanel{
	protected int white;
	protected int bleu;
	protected int vert;
	protected int rouge;
	protected int couleur;
	protected Image img;
	private static boolean fin = false;

	public Couleur() {
		super();
	}

    /**
    * sert a definir la couleur element selon la valeur du tableau 
    */
	@Override
	public void paintComponent(Graphics g) {
		if (this.isOpaque()) {
	    	
	    	g.setColor(this.getBackground());
	    	g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

		if(fin) {
			
		}
		
		if(this.couleur == 3) {
			Image img = getToolkit().getImage(this.getClass().getResource("/img/rouge.png"));
			g.drawImage(img, 0, 0, this);
		}
		
		if(this.couleur == 0) {
			g.setColor(Color.WHITE);
			g.drawOval(0, 0, 50, 50);
			g.fillOval(0, 0, 50, 50);
		}
		
		if(this.couleur==1) {
			Image img = getToolkit().getImage(this.getClass().getResource("/img/vert.png"));

			g.drawImage(img, 0, 0, this);
		}
		
		if(this.couleur==2) {
			Image img = getToolkit().getImage(this.getClass().getResource("/img/bleu.png"));
			g.drawImage(img, 0, 0, this);	
		}
	}
    /**
    * Dessine les image
    */
	public void setCouleur(int c) {
		this.couleur = c;
		this.repaint();
	}
    /**
    * remet toute les valeur a 0 pour les couleur
    */
	public void resetCouleur() {
		this.vert = 0;
		this.bleu = 0;
		this.rouge = 0;
		this.white = 0;
		this.couleur = 0;
	}

	public void setSurvol() {
		
	}
    /**
    * methode destine mettre la fin a vrai
    */
	public static void setFin(boolean f) {
		fin = f;
	}
    /**
    * methode a retourner la valeur de fin
    * @return fin : la variable fin
    */
	public static boolean getFin() {
		return fin;
	}
}
