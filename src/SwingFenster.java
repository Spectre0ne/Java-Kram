import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import java.awt.Insets;



public class SwingFenster {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Fancy GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(new Insets(10, 20, 10, 20)));



        JPanel firstRowPanel = new JPanel();
        panel.add(firstRowPanel, BorderLayout.NORTH);

        JLabel label = new JLabel("Was dein Name Bruder?");
        firstRowPanel.add(label);

        JTextField textField = new JTextField(20); // Specify the width of the text field
        firstRowPanel.add(textField);

        JPanel secondRowPanel = new JPanel(new BorderLayout());
        panel.add(secondRowPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel);


        String[] elements = {"Hallo", "Schüss", "Auf Wiedersehen"};
        JList<String> list = new JList<>(elements);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        secondRowPanel.add(list, BorderLayout.CENTER);

        JPanel lastRowPanel = new JPanel();
        panel.add(lastRowPanel, BorderLayout.SOUTH);


        JPanel thirdRowPanel = new JPanel();
        panel.add(thirdRowPanel, BorderLayout.SOUTH);

        JLabel resultLabel = new JLabel();
        thirdRowPanel.add(resultLabel);


        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedElement = list.getSelectedValue();
                    String inputText = textField.getText();
                    String result = inputText + " " + selectedElement;
                    resultLabel.setText(result);
                }
            }
        });
        frame.getContentPane().add(panel);



        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}