/*
 *  Função: Concentrar nesta classe todas as modificações relacionadas a objetos
 * JFrame.
 */
package frontEnd;

import javax.swing.JFrame;

/**
 * @author eduardo.cardoso
 */
public class Moldura 
{
    JFrame jf;
    
    public void Moldura()
    {
        jf = new JFrame();
    }
    
    public void preencherMoldura(String titulo,int x,int y)//Função: realizar o 
    //preenchimento dos valores para a criação do JFrame.
    //(uso para o inicio do programa).
    {
        //Tratamento de erro
        if(jf == null) Erro.informarErro("Erro: variavel jf da funcao 'moldura()' está vazia(null)");
        if(titulo == null) titulo = "Titulo Padrao";
        if(x == 0) x = 500;
        if(y == 0) y = 400;
            
        jf.setTitle(titulo);
        jf.setSize(x,y);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Informa que a janela deve 
        //fechar ao clicar em "close"(botão x)
    }
}
