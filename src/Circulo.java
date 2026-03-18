import java.util.Random;

public class Circulo extends Figura implements Dibujable {
    private int radio;

    public Circulo(int radio, String nombre) {
        super(nombre);
        this.radio= radio;
    }
    public double calcularArea(){
       double s = Math.PI*radio*radio;
       return s;
    }
    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public void dibujar(){
        System.out.print("Dibujando........" + nombre);
    }

}
