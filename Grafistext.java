/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafistext;
import java.awt.*;


/**
 *
 * @author User
 */
public class Grafistext extends Panel {
    Font f;
    String text =  "HALO KHARISMA";
    Grafistext(){
        setBackground(Color.GRAY); // Konstanta dalam class Color
    }
    public void paint(Graphics g) {
         f = new Font ("Helvetica", Font.BOLD, 48);
    // kotak hijau
    g.setColor(Color.GREEN);
    g.fillRect(8, 8, 335, 105);
    //Warna Hitam Pinggiran
    
    g.setColor(Color.BLACK);
    g.drawRect(8, 8, 335, 105);
    g.setColor(Color.PINK);
    g.fillOval(10, 10, 330, 100);
    //
    g.setColor(Color.RED);
    g.drawOval(10, 10, 330, 100);
    g.drawOval(9, 9, 332, 102);
    g.drawOval(10, 10, 334, 104);
    //Tulisan warna hitam dengan font helvetivcs
    
    g.setColor(Color.BLACK);
    setFont(f);
    g.drawString(text, 40, 75);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Testing Graphics Panel");
        Grafistext gp = new Grafistext();
        f. add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
    
}
