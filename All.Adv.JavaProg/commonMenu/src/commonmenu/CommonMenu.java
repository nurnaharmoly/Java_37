
package commonmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static sun.net.www.http.HttpClient.New;
import static sun.net.www.http.HttpClient.New;
import view.New;
import view.Open;

public class CommonMenu {
    
    public static void getCommonMenu(JFrame f){
      JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        jMenuBar.add(file);
        
        jMenuBar.add(new JMenu("About"));
        
        JMenu help = new JMenu("Help");
        jMenuBar.add(help);
        JMenuItem item1 = new JMenuItem("New");
        item1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              f.setVisible(true);
              new New().setVisible(true);
              
          }
      } );
        
        JMenuItem item2 = new JMenuItem("Open");
        item2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              f.setVisible(true);
              
              new Open().setVisible(true);
          }
      } );
        
        JMenuItem item3 = new JMenuItem("Exit");
        item3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
           System.exit(0);
          }
      } );
        
        file.add(item1);
        file.add(item2);
        file.add(item3);
       
        f.setJMenuBar(jMenuBar);
        
    }
   
    
}
