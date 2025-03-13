import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleTextFormatter extends JFrame {
private JTextField textField;
private JTextArea textArea;
public SimpleTextFormatter() {
// Frame setup
setTitle("Text Formatter");
setSize(300, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
// Text input
textField = new JTextField(15);
add(textField);
// Button to apply formatting
JButton formatButton = new JButton("Format Text");
add(formatButton);
// Display area for formatted text
textArea = new JTextArea(5, 20);
textArea.setEditable(false);
add(new JScrollPane(textArea));
// Button action
formatButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
formatText();
}
});

setVisible(true);
}
private void formatText() {
String text = textField.getText();
textArea.setText(text); // Display the text
textArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Set a default font
}
public static void main(String[] args) {
new SimpleTextFormatter();
}
}
