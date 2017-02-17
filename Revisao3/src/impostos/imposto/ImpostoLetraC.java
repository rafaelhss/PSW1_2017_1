/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos.imposto;

import impostos.produto.Produto;

/**
 *
 * @author Rafael.Soares
 */
public class ImpostoLetraC extends Imposto{

    public ImpostoLetraC(String n) {
        super(n);
    }

    @Override
    public float calcularValor(Produto p) {
            
        if(verificarLetra(p)){
            float aliquota = 0.3F;
            return p.getPreco() * aliquota;
        }
        return 0;

        
    }

    private boolean verificarLetra(Produto p) {
       if(p.getNome()
                .toUpperCase()
                .startsWith("C"))
           return true;
       return false;
    }
    
}
