import java.awt.*;
import java.awt.event.*;
public class testListener{
	public static void main(String[] args){
		Frame f = new Frame("doub");
		Button b1 = new Button("press me, xiaopan eats 10000Kg xiang");
		Button b2 = new Button("press me, xiaopan will becomes a doub");
		f.add(b1);
		f.add(b2);
		Actionl al = new Actionl();
		b2.setActionCommand("xiaopan is a doub");
		b1.addActionListener(al);	
		b2.addActionListener(al);	
		//f.pack();
		f.setVisible(true);
	}
}

class Actionl implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("A button has been pressed" + e.getActionCommand());
	}
}