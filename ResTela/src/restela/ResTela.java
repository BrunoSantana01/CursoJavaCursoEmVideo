package restela;

import java.awt.Dimension;

public class ResTela {

    public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dm = tk.getScreenSize();
    System.out.println("sreen width = " + dm.width);
    System.out.println("Screen height = " + dm.height);
    
    }
    
}
