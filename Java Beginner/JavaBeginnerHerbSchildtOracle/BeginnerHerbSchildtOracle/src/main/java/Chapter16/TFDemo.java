/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16;

/**
 *
 * @author MO
 */
// Use a text field. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {

    JTextField jtf;
    JButton buttonrev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {

        //create new JFrame container
        JFrame jframe = new JFrame("Use text field");

        //flow layout for layout manager
        jframe.setLayout(new FlowLayout());

        //give frame initial size
        jframe.setSize(1024, 720);

        //terminating program when use close
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create text field
        jtf = new JTextField(10);

        //set action commands for text field
        jtf.setActionCommand("myTF");

        //create reverse button
        JButton buttonrev = new JButton("Reverse");

        // Add action listeners. 
        jtf.addActionListener(this);
        buttonrev.addActionListener(this);

        // Create the labels. 
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Add the components to the content pane. 
        jframe.add(jlabPrompt);
        jframe.add(jtf);
        jframe.add(buttonrev);
        jframe.add(jlabContents);

        // Display the frame. 
        jframe.setVisible(true);
    }

    // Handle action events. 
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Reverse")) {
            // The Reverse button was pressed.  
            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse the string in the text field. 
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                resStr += orgStr.charAt(i);
            }

            // Store the reversed string in the text field. 
            jtf.setText(resStr);
        } else // Enter was pressed while focus was in the  
        // text field. 
        {
            jlabContents.setText("You pressed ENTER. Text is: "
                    + jtf.getText());
        }
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread. 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TFDemo();
            }
        });
    }

}
