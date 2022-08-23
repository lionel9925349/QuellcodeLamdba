import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Beispiel {

	public static void main(String[] args) {

		// Lambda Beispiel mit einer List
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// forEach mit anonymer Klasse
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		// Lambda mit einem Paramter und einem Block Code { }
		list.forEach((Integer n) -> {
			System.out.println(n);
			System.out.println(n + 2);
		});

		System.out.println("______");

		// Lambda mit einem Parameter und bei nur einem Befehl, braucht man keine { }
		// angeben
		list.forEach((n) -> System.out.println(n));

		// Lambda Beispiel für einen Listener Code
		JFrame jFrame = new JFrame();
		JButton jButton = new JButton("Klick mich");
		jButton.setBounds(100, 100, 100, 50);
		jFrame.add(jButton);
		jFrame.setSize(400, 400);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
		
//		jButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Einloggen erfolgreich");
//				
//			}
//		});
		
		// Lambda verkürzen
		// (Parameter) -> { }
		jButton.addActionListener(e -> System.out.println("Test"));
		
		// Interface Runnable
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World");
				
			}
		};
		
		// Lambda Ausdruck
		Runnable r2 = () -> System.out.println("Hello World");

		r1.run();
		r2.run();

	}
}


























