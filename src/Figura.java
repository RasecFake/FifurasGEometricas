public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();


    public void mostrar() {
        System.out.printf("\n Nombre: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.printf("Perimetro: " + calcularPerimetro());
    }
}
