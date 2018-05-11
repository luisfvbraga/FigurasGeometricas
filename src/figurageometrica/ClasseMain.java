/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author luisfilipe
 */
public class ClasseMain {
    
        public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica fig = new Triangulo(3.4, 4.5, 5.0);
        FiguraGeometrica fig2 = new Circulo(3.0);
        Circulo c = (Circulo)fig2;
        
        ((Circulo)fig2).setRaio(5.0);
        
        System.out.println(fig2.calcularPerimetro());
    }
    
}
