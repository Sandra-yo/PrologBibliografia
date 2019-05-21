/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conexion.ConsultaProlog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import resource.Strings;

/**
 *
 * @author 52477
 */
public class TitlesSearch {
    
    private JFrame screen; 
    private JLabel search;
    private JLabel type;
    private JLabel result;
    private JTextField titleToSearch;
    private JButton searchButton;
    private String consulta;
    private boolean busqueda=false;
    
    public TitlesSearch(boolean busqueda, String consulta){
        config();
        init();
        this.consulta = consulta;
        this.busqueda = busqueda;
        screen.setVisible(true);
        screen.validate();
        System.out.println(consulta +"---");
    }
    
    protected void config(){
        screen = new JFrame();
        
        screen.setTitle(Strings.TITLE);
        screen.setSize(430,450);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
     
    }
    
    protected void init(){
        this.search        = new JLabel("Introduzca el titulo"); 
        this.type          = new JLabel("Busqueda por titulo");
        this.titleToSearch = new JTextField(12);
        this.result        = new JLabel("Aqui se pondra el resultado");
        this.searchButton  = new JButton("Buscar");
        
        type.setBounds(140, -80, 150, 200);
        search.setBounds(20, -100, 200, 300);
        titleToSearch.setBounds(135, 35, 150, 30);
        result.setBounds(20, -50, 500, 500);
        searchButton.setBounds(290, 34, 100, 30);
        screen.add(type);
        screen.add(result);
     
        //screen.add(titleToSearch);
        screen.add(search);
        
        screen.add(searchButton);
      
        listener();
    } 
    
    protected String searchResponse(){
        return ConsultaProlog.run(consulta);
    }
    protected void listener(){
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                result.setText(searchResponse());
           }
        });
    }
    
    
}
