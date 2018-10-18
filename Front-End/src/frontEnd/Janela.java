package frontEnd;
import javax.swing.JFrame;

/**
 * @author eduardo.cardoso
 * @author Thiago Henirque Santos
 */

//Funcao das variáveis:
//quadro -> JFrame
//meuPainel -> JPanel

public class Janela extends Erro{
    
    public Janela()
    {
        
    }
    
    
    public static void main (String [] args)
    {
        Moldura quadro = new Moldura();
       quadro.preencherMoldura("",0,0);
        
        Painel meuPainel = new Painel();
        quadro.add(meuPainel);
        meuPainel.g.drawRect(150, 150, 100, 100);
    }
}
