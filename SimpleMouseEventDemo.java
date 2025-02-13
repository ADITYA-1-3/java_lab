import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class SimpleMouseEventDemo extends JFrame {
	 private JLabel label;
	 public SimpleMouseEventDemo() {
	 setTitle("Mouse Event Demo");
	 setSize(400, 300);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(new BorderLayout());
	 label = new JLabel("", SwingConstants.CENTER);
	 label.setFont(new Font("Arial", Font.PLAIN, 24));
	 add(label, BorderLayout.CENTER);
	 addMouseListener(new MouseAdapter() {
	 public void mouseClicked(MouseEvent e) {
	 label.setText("Mouse Clicked");
	 }
	 public void mouseEntered(MouseEvent e) {
	 label.setText("Mouse Entered");
	 }
	 public void mouseExited(MouseEvent e) {
	 label.setText("Mouse Exited");
	 }
	 });
	 setVisible(true);
	 }
	 public static void main(String[] args) {
	 new SimpleMouseEventDemo();
	 } 
}