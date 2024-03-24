import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelegationEventModelDemo {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Delegation Event Model Demo");

        // Create a button
        Button myButton = new Button("Click Me");

        // Create an ActionListener
        ActionListener myButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        };

        // Register the listener with the button source
        myButton.addActionListener(myButtonListener);

        // Add the button to the frame
        frame.add(myButton);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        // Close the frame on window close
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
