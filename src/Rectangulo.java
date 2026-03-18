public class Rectangulo extends Figura{
    private int lado;
    private int lado2;

    public Rectangulo(int lado, int lado2, String nombre) {
        super(nombre);
        this.lado = lado;
        this.lado2 = lado2;
    }

    public void dibujando(){
        System.out.print("Dibujando.....");
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
