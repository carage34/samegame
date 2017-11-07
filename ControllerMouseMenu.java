/**
 * La classe <code>ControllerMouseMenu</code> est un controller pour gérer les clics de
 *  classe Menu
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;


public class ControllerMouseMenu implements MouseListener{
	/**
	* JFrame qui correspond à la fenetre du Menu
	*/
	private JFrame fenetre;
	

	/**
	* Constructeur destin&eacute; à récupérer la fenetre
	* de la classe Menu
	*
	* @param f la fenetre de la classe Menu
	*/
	public ControllerMouseMenu(JFrame f) {
		this.fenetre = f;
	}

public void mouseClicked(MouseEvent e) {

}         
public void mouseEntered(MouseEvent e) {

}        
public void mouseExited(MouseEvent e) {

}       
public void mousePressed(MouseEvent e) {

}         
public void mouseReleased(MouseEvent e) {




	if((e.getX() > 66) && (e.getX()<339) && (e.getY()>248) && (e.getY()<318)) {
		System.out.println("Jeu aléatoire");
		this.fenetre.dispose();
	    Frame fenetre = new Frame();
	    fenetre.initTab();
	    ControllerMouse controller = new ControllerMouse(fenetre);
	    fenetre.addMouseListener(controller);
	}

	if((e.getX() > 441) && (e.getX()<719) && (e.getY()>253) && (e.getY()<310)) {
	    JFileChooser choix = new JFileChooser(new File("./fichier"));
	    PrintWriter sortie;
	    File fichier;
	    try {
		if (choix.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
		    fichier = choix.getSelectedFile();
		    sortie = new PrintWriter(new FileWriter(fichier.getPath(), true));
		    System.out.println("J'ai bien pris ton fichier Bro");
		    sortie.close();
		    Lire lire = new Lire();
		    lire.lecture(fichier);
		    
		}
	    }catch(IOException ee) {
		System.out.println("ça a foirer");
	    }
	    this.fenetre.dispose();
	}
}
}