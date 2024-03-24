import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Adapter class for ActionListener
class MyActionAdapter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Override only the method you are interested in
        System.out.println("ActionPerformed method called");
    }
}
// Using the adapter in your class
class MyButtonHandler extends MyActionAdapter {
    // Your class can now extend the adapter and override only the necessary methods
}
