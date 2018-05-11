/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.ArrayList;

/**
 *
 * @author luisfilipe
 */
public class ClasseMain {
    
        public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica fig = new Triangulo(3.4, 4.5, 5.0);
        FiguraGeometrica fig2 = new Circulo(3.0);
        
        ArrayList<FiguraGeometrica> l;
        l = new ArrayList();
        
        l.add(fig);
        l.add(fig2);
        
        Double perimetroTotal = 0.0;
        
        for(FiguraGeometrica f : l){
            perimetroTotal += f.calcularPerimetro();
        }
        
        
        

        
        System.out.println(perimetroTotal);
    }
    
}
