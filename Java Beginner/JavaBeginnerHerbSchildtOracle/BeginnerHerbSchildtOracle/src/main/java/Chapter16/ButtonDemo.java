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

// shows push button and handle action events

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener{
    
    JLabel jlab;
    ButtonDemo(){
    
    //create a JFrame container
    JFrame jframe = new JFrame("Button example");
    
    //specifiy FlowLayout for layout manager
    jframe.setLayout(new FlowLayout());
    
    //giving frame initial size
    jframe.setSize(220, 90);
    
    //terminating programm when i exit program
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //making two buttons
    JButton  upbutton = new JButton("Up");
    JButton downbutton = new JButton("Down");
    
    //adding action listeners
    upbutton.addActionListener(this);
    downbutton.addActionListener(this);
    
    //adding buttons to cintent pane
    jframe.add(upbutton);
    jframe.add(downbutton);
    
    //create a label
    jlab = new JLabel("Press a button");
    
    //add label to frame
    jframe.add(jlab);
    
    //display frame
    jframe.setVisible(true);
    }
    
    //handle button events
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed up");
        else
            jlab.setText("You pressed down");
    }
    public static void main(String[] args) {
        //creating frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new ButtonDemo();
            }
        });
    }
}
