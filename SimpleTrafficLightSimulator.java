import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleTrafficLightSimulator extends JFrame {
private JLabel messageLabel;
public SimpleTrafficLightSimulator() {
setTitle("Traffic Light Simulator");


setSize(300, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
messageLabel = new JLabel(""); // Initial empty message
messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
add(messageLabel);
// Create radio buttons for traffic lights
JRadioButton redButton = new JRadioButton("Red");
JRadioButton yellowButton = new JRadioButton("Yellow");
JRadioButton greenButton = new JRadioButton("Green");
// Group buttons so only one can be selected
ButtonGroup group = new ButtonGroup();
group.add(redButton);
group.add(yellowButton);
group.add(greenButton);
add(redButton);
add(yellowButton);
add(greenButton);
// Action listener for buttons
redButton.addActionListener(e -> updateMessage("Stop", Color.RED));
yellowButton.addActionListener(e -> updateMessage("Ready", Color.YELLOW));
greenButton.addActionListener(e -> updateMessage("Go", Color.GREEN));
setVisible(true);
}
private void updateMessage(String message, Color color) {
messageLabel.setText(message);
messageLabel.setForeground(color);
}
public static void main(String[] args) {
new SimpleTrafficLightSimulator();
}


}
