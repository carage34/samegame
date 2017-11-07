/**
 * La classe <code>ControllerMouseMenuFin</code> permet de controller de controller
 * les clics de classe MenuFin
 * @version 0.1
 * @author Morgan Jully et Killian Mocret
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class ControllerMouseMenuFin implements MouseListener {

	private MenuFin menu;

	ControllerMouseMenuFin(MenuFin m) {
		this.menu = m;
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
		if((e.getX() > 66+8) && (e.getX()<352+8) && (e.getY()>289+30) && (e.getY()<359+30)) {
			System.out.println("Rejouer");
			menu.dispose();
			Menu menu = new Menu();
		}

		if((e.getX() > 491+8) && (e.getX()<759+8) && (e.getY()>287+30) && (e.getY()<360+30)) {
			System.out.println("Quitter");
			this.menu.dispose();
		}
	}        
}