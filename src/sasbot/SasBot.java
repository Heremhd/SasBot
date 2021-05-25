/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sasbot;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Aiden
 */
public class SasBot extends JFrame{
    private final  JTextArea chatarea = new JTextArea();
    private final JTextField chatbox = new JTextField();
    public SasBot(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("SasBot");
        frame.add(chatarea);
        frame.add(chatbox);
        //For text area
        chatarea.setSize(500, 400);
        chatarea.setLocation(2, 2);
        
        
        //for text box
        chatbox.setSize(540, 30);
        chatbox.setLocation(2, 0);
        
        
        
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set Up frame for Application. I'm sorry if it's not pretty D:
    
            
    }
    
}
