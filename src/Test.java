public class Test {
    public static void main(String[] args) {
        Punto p1=new Punto(2,4);
        Punto puntoMedio=p1.puntoMedio(new Punto(3,6));
        Punto p2=new Punto(7,5);
        System.out.println("Ascissa del punto: "+p1.getX());
        System.out.println("Ordinata del punto: "+p1.getY());
        System.out.println("Modulo del punto: "+p1.getRho());
        System.out.println("Punto medio: (" + puntoMedio.getX() + ", " + puntoMedio.getY() + ")");
        System.out.println("Sono uguali: "+p1.equals(p2));
    }
}