package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Object> listObjects = new ArrayList<>();
		
		Quadrado quad1 = new Quadrado(15);
		Quadrado quad2 = new Quadrado(29);
		Quadrado quad3 = new Quadrado(55);
		
		Retangulo ret1 = new Retangulo(17, 16);
		Retangulo ret2 = new Retangulo(23, 33);
		Retangulo ret3 = new Retangulo(86, 97);
		
		Circulo circ1 = new Circulo(29);
		Circulo circ2 = new Circulo(18);
		Circulo circ3 = new Circulo(88);
		
		listObjects.add(quad1);
		listObjects.add(quad2);
		listObjects.add(quad3);
		
		listObjects.add(ret1);
		listObjects.add(ret2);
		listObjects.add(ret3);
		
		listObjects.add(circ1);	
		listObjects.add(circ2);
		listObjects.add(circ3);
		
		for(Object obj : listObjects) {
			if(obj instanceof Quadrado) {
				Quadrado quad = (Quadrado) obj;
				System.out.println("\nQuadrado");
				System.out.println("Valor lado: " + quad.getLado());
				System.out.println("Valor da Area: " + String.format("%.2f", quad.area()));
				System.out.println("Valor do Perímetor: " + String.format("%.2f", quad.perimetro()));
			} else if (obj instanceof Retangulo) {
				System.out.println("\nRetângulo");
				Retangulo ret = (Retangulo) obj;
				System.out.println("Valor da base: " + ret.getBase());
				System.out.println("Valor da Altura: " + ret.getAltura());
				System.out.println("Valor da Area: " + String.format("%.2f", ret.area()));
				System.out.println("Valor do Perímetor: " + String.format("%.2f", ret.perimetro()));
			} else if(obj instanceof Circulo) {
				System.out.println("\nCirculo");
				Circulo circ = (Circulo) obj;
				System.out.println("Valor do Raio: " + circ.getRaio());
				System.out.println("Valor da Area: " + String.format("%.2f", circ.area()));
				System.out.println("Valor do Perímetor: " + String.format("%.2f", circ.perimetro()));
			}
		}
		
	}
}
