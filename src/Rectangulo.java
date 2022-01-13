/**
 * Clase rectángulo con cuatro lados
 * @author raulpalao
 * @version 1.0
 */
public class Rectangulo {

    private int lado1;
    private int lado2;
    
    /**
     * Calcula el perímetro del rectángulo
     * @return El perímetro del rectángulo
     */
    public int perimetro(){
        return lado1 + lado1 + lado2 + lado2;
    }
    
    /**
     * Calcula el área del rectángulo
     * @return El área del rectángulo
     */
    public int area(){
        return lado1 * lado2;
    }
    
    /**
     * Escalar el rectángulo
     * @param factor Valor a multiplicar
     */
    public void multiplicar(int factor){
        int name = lado1 * factor;
        int name2 = lado2 * factor;
    }
}
