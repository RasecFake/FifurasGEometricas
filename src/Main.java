public class Main {
    public static void main(String[] args) {

        Circulo c = new Circulo(2,"Circulo 1");
        Rectangulo cu = new Rectangulo(3,4,"cuadrado 1");
        Triangulo tri =new Triangulo(1,2,3,"Triangulo 1");

        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());
        c.dibujar();
        System.out.println();
        System.out.println();

        System.out.println(cu.calcularPerimetro());
        System.out.println(cu.calcularArea());
        cu.dibujando();
        System.out.println();
        System.out.println();

        System.out.println(tri.calcularPerimetro());
        System.out.println(tri.calcularArea());
        tri.dibujando();
        tri.mostrarTriangulo();


    }
}
