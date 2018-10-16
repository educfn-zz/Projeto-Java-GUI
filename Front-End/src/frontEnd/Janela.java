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
        jf.setTitle("Matriz");
        jf.setSize(500,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Informa que a janela deve 
        //fechar ao clicar em "close"(botão x)
    }
    
    public static void main (String [] args)
    {
        new Janela();
        
        
    }
}
