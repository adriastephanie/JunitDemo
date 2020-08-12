package company;

public class Triangulo {

    int lado1;
    int lado2;
    int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean isTriangle() {
        return (this.lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1 + lado2);
    }

    public String checkType() {
        if (!isTriangle())
            return "não é triangulo";

        //equilatero todos os lados iguais
        if (lado1 == lado2 && lado1 == lado3) {
            return "triangulo equilatero";
            //escaleno todos diferentes
        } else if (lado1 == lado2 || lado1 == lado3) {
            return "triangulo escaleno";
        } else {
            return "triangulo isoscele";
        }
    }
}
