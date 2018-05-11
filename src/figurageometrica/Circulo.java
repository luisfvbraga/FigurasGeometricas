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
public class Circulo extends FiguraGeometrica{
    
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Circulo(){}
    public Circulo(Double raio){
        this.raio = raio;
    }
    
    public Double calcularVolume(Double altura){
        return Math.PI * Math.pow(this.raio, 2) * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
}
