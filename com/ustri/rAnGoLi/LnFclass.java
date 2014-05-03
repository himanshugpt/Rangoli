package com.ustri.rAnGoLi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class LnFclass implements ActionListener {
mainClass Main=null;
	
	public LnFclass (mainClass mc) {
		Main=mc;
	}

	MetalLookAndFeel metalLF = new MetalLookAndFeel();
	MotifLookAndFeel motifLF = new MotifLookAndFeel();
	WindowsLookAndFeel windowsLF = new WindowsLookAndFeel();
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equalsIgnoreCase("metal")){
			System.out.println("ya...");
			try {
				UIManager.setLookAndFeel(metalLF);
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(Main.frame);
		}
		
		
		if (e.getActionCommand().equalsIgnoreCase("motif")) {
			try {
				UIManager.setLookAndFeel(motifLF);
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(Main.frame);
		}
		
		if (e.getActionCommand().equalsIgnoreCase("Windows")) {
			try {
				UIManager.setLookAndFeel(windowsLF);
			} catch (UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			SwingUtilities.updateComponentTreeUI(Main.frame);
		}
		
		
		}
		
	}
	
	
	
	
	

