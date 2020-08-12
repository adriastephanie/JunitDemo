package company;

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(4, 3, 4);

        if (triangulo.isTriangle())
            System.out.println("É um triangulo");
        else
            System.out.println("Não é um triangulo");

        System.out.println(triangulo.checkType());
    }
}
