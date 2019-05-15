
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import resource.Strings;

/**
 *
 * @author 
 *  Argel Ortiz Arenas
 *  15/05/2019
 */
public final class Display{
    private JFrame screen; 
    private JLabel subTitle;
    private JButton ok; //temp
    private JLabel cover;
    
    public Display(){
        config();
        init();
        screen.setVisible(true);
    }
    
    protected void config(){
        screen = new JFrame();
        
        screen.setTitle(Strings.TITLE);
        screen.setSize(400,400);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    protected void init(){
        subTitle    = new JLabel();
        ok          = new JButton();
        cover       = new JLabel();
        
        //component config
        subTitle.setText(Strings.SUB_TITLE);
        subTitle.setBounds(175, 10, 50, 20);
        
        ok.setText(Strings.OK_BUTTON);
        ok.setBounds(125, 350, 150, 20);
        
        cover.setIcon(new ImageIcon(Strings.RESOURCE_ROUTE+"cover.png"));
        cover.setBounds(10, 25, 200, 200);
        
        
        listeners();
        
        screen.add(subTitle);
        screen.add(ok);
        screen.add(cover);
                
    }
    
    protected void listeners(){
        //ok button listener
        ok.addActionListener((ActionEvent ae) -> {
            System.out.println("click");
        });
    }
    
    
    
    
}
