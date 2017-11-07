/**
 * La classe <code>Lire</code> permet d'initialiser les tableaux de la grille
 * quand l utilisateur a choisit un fichier
 * 
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader.*;
public class Lire {

	/**
	* Tableau d'objet qui correspond aux objets de la grille
	* quand le joueur choisit de jouer avec une 
	* grille aletoire
	*/
	private int[][] tabi = new int[10][15];

	/**
	* Tableau qui correspond au tablaux d'objet mais avec des
	* entiers (1 = vert, 2 = bleu, 3 = rouge)
	*/
	private Couleur[][] tab = new Couleur[10][15];
	/**
	* Fenetre creer pour appeler le contructeur de Frame qui recupere
	* l objet de la classe Lire
	*/
	private Frame fenetre = new Frame(this);

	/**
	* Methode qui permet de recuperer le tableaux d'objets
	* dans d'autre classe
	*/
    public Couleur[][] getTab() {
		return this.tab;
	}
	/**
	* Methode qui permet de recuperer le tableaux d'entier
	* dans d'autre classe
	*/
	public int[][] getTabi() {
		return this.tabi;
	}

	/**
	* Methode qui remplit les tableaux de la grille en
	* fonction du fichier
	* @param fichier qui définit la grille
	*/
    public void lecture(File fichier) {
    JPanel temp = new JPanel();
    fenetre.add(temp);
    temp.setLayout(new GridLayout(10, 15, 0, 0));
	int lettre;
	
	try {
	    
	    FileReader re = new FileReader (fichier);
	    BufferedReader bufer =new BufferedReader(re);
		
		for (int i=0; i<10; i++) {
	    	for (int j=0; j<15; j++) {
	    		lettre=bufer.read();

	    	if(lettre == 66){
	    		System.out.println('B');
		    	tabi[i][j]=2;
		    	tab[i][j] = new Bleu();
		    	temp.add(tab[i][j]);
		    }

	    	if(lettre == 82) {
		    	tabi[i][j]=3;
		    	System.out.println('R');	
		    	tab[i][j] = new Rouge();
		    	temp.add(tab[i][j]);
		    }

		    if(lettre == 86) {
		    	System.out.println('V');
		    	tab[i][j] = new Vert();
		    	temp.add(tab[i][j]);
		    	tabi[i][j]=1;
		    }


	    	}
	    	bufer.skip(1);
	    }

		

		
	    
	    for (int i=0; i<10; i++) {
			System.out.println(" ");
			for (int j=0; j<15; j++) {
				System.out.print(tabi[i][j]);
			}
		}
		System.out.println("");


	    try {
		bufer.close();
	    } catch (IOException e) {
		System.out.println("Erreur de fermeture");
	    }
	} catch (IOException e) {
	    System.out.println("Erreur d'ouverture");
	}

	ControllerMouse controller = new ControllerMouse(fenetre);
	fenetre.addMouseListener(controller);
}
}


