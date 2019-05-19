
package view;

import java.awt.Color;
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
 * 
 *  Construction of graphical interface for 
 *  the query system in a database of facts built in prolog
 */
public final class Display{
    private JFrame screen; 
    private JLabel subTitle;
    private JLabel menuTitle;
    private JLabel cover;
    
    private JButton searchTitles;
    private JButton searchGenders;
    private JButton searchEditorials;
    private JButton searchWriters;
    private JButton searchYears;
    
    private JButton searchByTitle;
    private JButton searchByGenders;
    private JButton searchByEditorials;
    private JButton searchByWriters;
    private JButton searchByYear;
    
    private JButton more;
    
    public Display(){
        config();
        init();
        screen.setVisible(true);
    }
    
    protected void config(){
        screen = new JFrame();
        
        screen.setTitle(Strings.TITLE);
        screen.setSize(400,450);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    protected void init(){
        subTitle            = new JLabel();
        menuTitle           = new JLabel();
        cover               = new JLabel();
        
        searchTitles        = new JButton();
        searchGenders       = new JButton();
        searchEditorials    = new JButton();
        searchWriters       = new JButton();
        searchYears         = new JButton();
        
        searchByTitle       = new JButton();
        searchByGenders     = new JButton();
        searchByEditorials  = new JButton();
        searchByWriters     = new JButton();
        searchByYear        = new JButton();
        
        more                = new JButton();
        
        //component config
        subTitle.setText(Strings.SUB_TITLE);
        subTitle.setBounds(175, 10, 50, 20);
        
        cover.setIcon(new ImageIcon(Strings.RESOURCE_ROUTE+"cover.png"));
        cover.setBounds(50, 25, 300, 200);
        
        menuTitle.setText(Strings.MENU_TITLE_FIRST);
        menuTitle.setBounds(25,225,200,20);
        
        searchTitles.setText(Strings.MENU_TITLES_BUTTON);
        searchTitles.setBounds(25, 260, 150, 20);
        
        searchGenders.setText(Strings.MENU_GENDERS_BUTTON);
        searchGenders.setBounds(25, 290, 150, 20);
        
        searchEditorials.setText(Strings.MENU_EDITORIALS_BUTTON);
        searchEditorials.setBounds(25, 320, 150, 20);
        
        searchWriters.setText(Strings.MENU_WRITERS_BUTTON);
        searchWriters.setBounds(25, 350, 150, 20);
        
        searchYears.setText(Strings.MENU_YEARS_BUTTON);
        searchYears.setBounds(25, 380, 150, 20);
        
        searchByTitle.setText(Strings.MENU_TITLE_BUTTON);
        searchByTitle.setBounds(200, 260, 150, 20);
        
        searchByGenders.setText(Strings.MENU_GENDER_BUTTON);
        searchByGenders.setBounds(200, 290, 150, 20);
        
        searchByEditorials.setText(Strings.MENU_EDITORIAL_BUTTON);
        searchByEditorials.setBounds(200, 320, 150, 20);
        
        searchByWriters.setText(Strings.MENU_WRITER_BUTTON);
        searchByWriters.setBounds(200, 350, 150, 20);
        
        searchByYear.setText(Strings.MENU_YEAR_BUTTON);
        searchByYear.setBounds(200, 380, 150, 20);
        
        listeners();
        
        screen.add(subTitle);
        screen.add(cover);
        screen.add(menuTitle);
        screen.add(searchTitles);
        screen.add(searchGenders);
        screen.add(searchEditorials);
        screen.add(searchWriters);
        screen.add(searchYears);
        screen.add(searchByTitle);
        screen.add(searchByGenders);
        screen.add(searchByEditorials);
        screen.add(searchByWriters);
        screen.add(searchByYear);
        
                
    }
    
    protected void listeners(){
        //ok button listener
        searchTitles.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(false,"libro(X).");
            System.out.println("2");
        });
        
        searchGenders.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(false, "genero(X).");
        });
        
        searchEditorials.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(false,"editorial(X).");
        });
        
        searchWriters.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(false,"autor(X).");
        });
        
        searchYears.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(false,"fecha(X).");
        });
        
        searchByTitle.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(true,"libro(X).");
        });
        
        searchByGenders.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(true,"libro(X).");
        });
        
        searchByEditorials.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(true,"libro(X).");
        });
        
        searchByWriters.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(true,"libro(X).");
        });
        
        searchByYear.addActionListener((ActionEvent ae) -> {
            new TitlesSearch(true,"libro(X).");
        });
    }
    
    
    
    
}
