/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Rafael.Soares
 */
public class Subtrair extends Servico{
    public String executar(String recurso){
        String p1 = Util.LeitorParam.leParametro(recurso, 0);
        String p2 = Util.LeitorParam.leParametro(recurso, 1);
        int result = Integer.parseInt(p1) - Integer.parseInt(p2);
        
        return String.valueOf(result);
            
    }
    
}
