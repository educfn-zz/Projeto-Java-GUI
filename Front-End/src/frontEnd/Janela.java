package frontEnd;
import javax.swing.JFrame;

/**
 * @author eduardo.cardoso
 * @author thiago
 */

//***JPANEL***
//***      ***
//***      ***

public class Janela extends Erro{
    //Variaveis de auxilio:
    Moldura mol;//variavel para auxiliar com a manipula do JFrame.
    
    public Janela()
    {
        
    }
    
    
    public static void main (String [] args)
    {
        Moldura quadro = new Moldura();
       quadro.preencherMoldura("",0,0);
        
        Painel meuPainel = new Painel();
        //janela.add(meuPainel);
        
    }
}
