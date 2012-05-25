package chatClient;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class ChatClientGUI extends JFrame{

	JTextArea verlauf;
	JScrollPane scrpVerlauf;
	JLabel labEingab;
	JLabel labBenutzer;
	JLabel labVerlauf;
	JTextField nachricht;
	JList benutzer;
	JPanel unten;
	JPanel rechts;
	JPanel mitte;
	JScrollPane scrpBenutzer;
	Container all;
	
	public ChatClientGUI (){
		
		verlauf = new JTextArea();
		verlauf.setEditable(false);
		verlauf.setLineWrap(true);
        verlauf.setWrapStyleWord(true);
		scrpVerlauf = new JScrollPane(verlauf);
		nachricht = new JTextField(62);
		benutzer = new JList<>();
		unten = new JPanel(new BorderLayout());
		rechts = new JPanel(new BorderLayout());
		mitte = new JPanel(new BorderLayout());
		scrpBenutzer = new JScrollPane(benutzer);
		labEingab = new JLabel("Eingabe:");
		labBenutzer = new JLabel("Benutzerliste:");
		labVerlauf = new JLabel("Chatverlauf:");
		
		Border abstand = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		mitte.setBorder(abstand);
		rechts.setBorder(abstand);
		unten.setBorder(abstand);
		
		unten.add(labEingab, BorderLayout.WEST);
		unten.add(nachricht);
		mitte.add(labVerlauf, BorderLayout.NORTH);
		mitte.add(scrpVerlauf);
		rechts.add(labBenutzer, BorderLayout.NORTH);
		rechts.add(scrpBenutzer);
		
		all = getContentPane();
		all.setLayout( new BorderLayout());
		all.add(mitte);		
		all.add(unten, BorderLayout.SOUTH);
		all.add(rechts, BorderLayout.EAST);
		
		setSize(780, 500);
		setMinimumSize(new Dimension(780, 500));
		setTitle("Chatclient");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		nachricht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verlauf.setText(verlauf.getText() + nachricht.getText()+"\n");
				nachricht.setText("");
					class test extends Thread{
						public void run() {
							int i = 0;
							while (true){
								System.out.println(i);
								i++;}
						}
					}
					test was = new test();
					was.start();

			}	
		});
	}
}