package frontEnd;
import javax.swing.JFrame;

/**
 *
 * @author eduardo.cardoso
 */




public class Janela {
    
    public Janela()
    {
        JFrame jf = new JFrame();
        jf.setTitle("Título da Janela");
        jf.setSize(500,400);
        jf.setVisible(true);
    }
    
    public static void main (String [] args)
    {
        new Janela();
    }
}
