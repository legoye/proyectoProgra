/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


import elementos.Elemento;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;

class Listas2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Listas 2");
		final JTextArea area = new JTextArea(5, 20);
		Elemento [] elementos = {new elementos.H() , new elementos.H() , new elementos.O()};

                JList lista = new JList(elementos);



		lista.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				area.setText("");
				java.util.List<String> elementos = lista.getSelectedValuesList();
				for (String s: elementos)
					area.append(s + "\n");
			}
		});

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(lista);
		frame.getContentPane().add(area);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.pack();
		frame.setVisible(true);
	}
}
