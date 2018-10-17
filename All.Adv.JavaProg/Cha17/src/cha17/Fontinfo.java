
package cha17;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class Fontinfo {

    public static void main(String[] args) {
        Toolkit theKit = Toolkit.getDefaultToolkit();
        
        System.out.println("\nScreen Resolusion: " + theKit.getScreenResolution() + " dots per inch");
        
        Dimension screenDim = theKit.getScreenSize();
        System.out.println("Screen Size: " + screenDim.width + " by " + screenDim.height + " pixels");
        
        
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames = e.getAvailableFontFamilyNames();
        System.out.println("\nFonts available on this platform: ");
        int count = 0;
        for (String fontname : fontnames){
            System.out.println("%-30s"+ fontname);
            if(++count % 3 == 0){
                System.out.println();
            }
        }
        return;
    }
    
}
