package procesador;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoProcesador4 miMarco = new MarcoProcesador4();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador4 extends JFrame{
	
	public MarcoProcesador4() {
		
		setBounds(800, 100, 400, 350);
		setTitle("Word");
		LaminaProcesador4 miLamina = new LaminaProcesador4();
		add(miLamina);
	}
}

class LaminaProcesador4 extends JPanel{
	
	public LaminaProcesador4() {
		
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JTextPane textArea = new JTextPane();
		JMenuBar miBarra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem calibri = new JMenuItem("Calibri");
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem negrita = new JMenuItem("Negrita", new ImageIcon("src/procesador/bola_amarilla.gif"));
		JMenuItem cursiva = new JMenuItem("Cursiva", new ImageIcon("src/procesador/bola_azul.gif"));
		JMenuItem tamano12 = new JMenuItem("12");
		JMenuItem tamano16 = new JMenuItem("16");
		JMenuItem tamano18 = new JMenuItem("18");
		JMenuItem tamano20 = new JMenuItem("20");
		
		arial.addActionListener(new StyledEditorKit.FontFamilyAction("", "Arial"));
		
		calibri.addActionListener(new StyledEditorKit.FontFamilyAction("", "Calibri"));
		
		courier.addActionListener(new StyledEditorKit.FontFamilyAction("", "Courier"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		tamano12.addActionListener(new StyledEditorKit.FontSizeAction("", 12));
		
		tamano16.addActionListener(new StyledEditorKit.FontSizeAction("", 16));
		
		tamano18.addActionListener(new StyledEditorKit.FontSizeAction("", 18));
		
		tamano20.addActionListener(new StyledEditorKit.FontSizeAction("", 20));
		
		fuente.add(arial);
		fuente.add(calibri);
		fuente.add(courier);
		estilo.add(negrita);
		estilo.add(cursiva);
		tamano.add(tamano12);
		tamano.add(tamano16);
		tamano.add(tamano18);
		tamano.add(tamano20);
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamano);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
	}
}