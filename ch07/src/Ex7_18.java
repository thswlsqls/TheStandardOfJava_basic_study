import java.awt.*;
import java.awt.event.*;

//class Ex7_18 {
//	public static void main(String[] args) {
//		Button b = new Button("Start");
//		b.addActionListener(new EventHandler());
//	}
//}

class Ex7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}

//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}