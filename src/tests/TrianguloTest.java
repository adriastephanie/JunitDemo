package tests;


import static org.junit.Assert.*;

import company.Triangulo;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void testEquilatero(){
        Triangulo triangulo = new Triangulo(3,3,3);
        assertEquals("deve ser um triangulo equilatero", "triangulo equilatero", triangulo.checkType());
    }
    @Test
    public void testIsoscele(){
        Triangulo triangulo = new Triangulo(4,5,3);
        assertEquals("deve ser um triangulo isoscele", "triangulo isoscele", triangulo.checkType());
    }
    @Test
    public void testEscaleno(){
        Triangulo triangulo = new Triangulo(4,3,4);
        assertEquals("deve ser um triangulo escaleno", "triangulo escaleno", triangulo.checkType());
    }
    @Test
    public void testValidarTriangulo(){
        Triangulo triangulo = new Triangulo(3,3,3);
        assertEquals("É um triangulo", true, triangulo.isTriangle());
    }

}
