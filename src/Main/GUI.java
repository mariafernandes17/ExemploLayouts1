
package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maria
 */
public class GUI extends JFrame {
    Container cp;
    JPanel pnNorte = new JPanel();
    JPanel pnSul = new JPanel();
    JPanel pnOeste = new JPanel();
    JPanel pnLeste = new JPanel();
    JPanel pnCentro = new JPanel();
    private JLabel lbTitulo = new JLabel("Um titulo qualquer");
    
    public GUI() {
        setSize(400,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(pnNorte,BorderLayout.NORTH);
        cp.add(pnSul,BorderLayout.SOUTH);
        cp.add(pnOeste,BorderLayout.WEST);
        cp.add(pnLeste, BorderLayout.EAST);
        cp.add(pnCentro, BorderLayout.CENTER);
        pnNorte.setBackground(Color.red);
        pnSul.setBackground(Color.blue);
        pnOeste.setBackground(Color.PINK);
        pnLeste.setBackground(Color.MAGENTA);
        pnCentro.setBackground(Color.black);
        
        pnNorte.add(lbTitulo);
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        
    }
    
    
}
