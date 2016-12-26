import java.awt.*;
import java.io.*;
import javax.swing.*;


public class TextEditor extends JFrame {
    private JPanel mainPanel;
    public TextEditor() {
	mainPanel = new JPanel();
	mainPanel.add(new JButton("Tester Button"));
	this.add(mainPanel);
	this.setVisible(true);
    }

    public static void main(String[] args) {
	    new TextEditor();
    }
}
