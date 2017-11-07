/**
 * La classe <code>Frame</code> correspond à la fenetre principale du jeu
 * 
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Frame extends JFrame{

	/**
	* Tableau d'objet qui correspond aux objets de la grille
	* quand le joueur choisit de jouer avec une 
	* grille aletoire
	*/
	private Couleur[][] tab;
	/**
	* Tableau qui correspond au tablaux d'objet mais avec des
	* entiers (1 = vert, 2 = bleu, 3 = rouge)
	*/
	private int[][] tabi;
	/**
	* Attribut pour recuperer l objet de la classe Lire
	*/
	private Lire lire;

	/**
	* Constructeur destin&eacute; a recuperer l objet de la classe Lire
	* pour recuperer les differents tableaux quand l'utilisateur choisit 
	* une grille definit par un fichier
	*
	* @param l l objet de la classe Lire pour recuperer les tableaux
	*/

	public Frame(Lire l) {
		super("Fichier");
		this.setLocation(300, 300);
		this.setSize(800, 650);
		this.setResizable(false);
		this.lire = l;
		this.tab=lire.getTab();
		this.tabi=lire.getTabi();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	/**
	*Ne sert à rien
	*/
	public Frame() {

	}

	/**
	* Methode destine a initialiser les tableaux et remplir la grille
	* quand l'utilisateur choisit une grille aléatoire et initialise le fenetre
	*/
	public void initTab() {
		JPanel temp = new JPanel();
		this.add(temp);
		this.tab = new Couleur[10][15];
		this.tabi = new int[10][15];

		Random random = new Random();
		int alea;
		

		temp.setLayout(new GridLayout(10,15,0,0));
		for(int i = 0;i<10;i++) {
			for(int j=0; j<15; j++) {
				alea = random.nextInt(3);
				if(alea == 0) {
					this.tab[i][j] = new Vert();
					temp.add(tab[i][j]);
					this.tabi[i][j] = 1;
				}

				if(alea == 1) {
					this.tab[i][j] = new Bleu();
					temp.add(tab[i][j]);
					this.tabi[i][j] = 2;
				}

				if(alea == 2) {
					this.tab[i][j] = new Rouge();
					temp.add(tab[i][j]);
					this.tabi[i][j] = 3;
				}
			}
		}
		this.setSize(800, 650);
		this.setLocation(300, 300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
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
}