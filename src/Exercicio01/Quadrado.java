package Exercicio01;

public class Quadrado extends Poligono{
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * largura;
    }
}
