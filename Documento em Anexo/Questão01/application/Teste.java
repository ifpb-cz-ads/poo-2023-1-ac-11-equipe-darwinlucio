package application;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
			List<LiberadorDeCarbono> listLiberadores = new ArrayList<>();
			
			Edifício edificio = new Edifício("Enegia e Gás de cozinha", 450, 1237, 7000, "Rua A", 20, 102);
			Carro carro = new Carro("Gasolina", 39, "Fusca azul", 1959, "Gasolina");
			Bicicleta bike = new Bicicleta("Metal", "Diamus", 2023);
			
			edificio.getPegadaDeCarbano();
			carro.getPegadaDeCarbano();
			bike.getPegadaDeCarbano();
			
			listLiberadores.add(edificio);
			listLiberadores.add(carro);
			listLiberadores.add(bike);
			
			for(LiberadorDeCarbono liberador : listLiberadores) {
				liberador.imprimir();
			}
	}

}
