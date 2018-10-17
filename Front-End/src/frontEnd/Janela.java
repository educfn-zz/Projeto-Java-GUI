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
    
    
    public Janela()
    {
        
    }
    
     public void moldura(JFrame jf,String titulo,int x,int y)//Preenchimento da moldura com valores 
     //repassados ou padrões.
    {
        //Tratamento de erro
        if(jf == null)informarErro("Erro: variavel jf da funcao 'moldura()' está vazia(null)");
        if(titulo == null) titulo = "Titulo Padrao";
        if(x == 0) x = 500;
        if(y == 0) y = 400;
         
        jf = new JFrame();     
        jf.setTitle(titulo);
        jf.setSize(x,y);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Informa que a janela deve 
        //fechar ao clicar em "close"(botão x)
    }
    
    public static void main (String [] args)
    {
        JFrame mol = new JFrame();
       
        
        Painel meuPainel = new Painel();
        //janela.add(meuPainel);
        
    }
}
