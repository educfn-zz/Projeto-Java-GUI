/*
 *  Esta Classe foi criada para concentrar em uma só classe o tratamamento dos 
 * erros do programa.
 */
package frontEnd;

/**
 *
 * @author eduardo.cardoso
 */
public class Erro {
    
    public Erro ()
    {
        
    }
    
    public static void informarErro(String mensagemDeErro)
    {
        System.err.println();
        System.err.println(mensagemDeErro);
        System.err.println();
        
        System.exit(1);
    }
}
