package nru;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Not Recent Used");
		Memory memory = new Memory(32);
		PageTable pageTable = new PageTable(64);
	}
}
