public class Triangulo extends Figura {
    public String nombre;
    private int lado;
    private int lado2;
    private int lado3;

    public Triangulo(int lado, int lado2, int lado3, String nombre) {
        super(nombre);
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.nombre = nombre;
    }
    public double calcularArea(){
       double s = lado*lado2*lado3/2;
       return Math.sqrt(s);
    }
    public double calcularPerimetro(){
        double perimetro = lado+lado2+lado3;
        return perimetro;
    }
    public void mostrarTriangulo(){
        System.out.printf("\n Nombre: " +  nombre);
        System.out.println("Area: " + calcularArea());
        System.out.printf("Perimetro: " + calcularPerimetro());
    }
    public void dibujando(){
        System.out.print("Dibujando.....");
    }

    public int getLado() {
        return lado;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
}
