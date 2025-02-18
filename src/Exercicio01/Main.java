package Exercicio01;


public class Main {
    public static void main(String[] args) {
        Poligono r = new Quadrado();
        r.setLargura(5);
        r.setAltura(10);
        System.out.println("Área esperada: 5 * 10 = 50, mas retorna: " + r.getArea());
    }
}