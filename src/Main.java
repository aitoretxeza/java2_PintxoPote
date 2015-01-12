import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) throws IOException {

		int respuestaUno;

		do {

			Scanner sc = new Scanner(System.in);

			System.out.print("\n    ------------------------ MENU -------------------------");
			System.out.print("\n   |                                                       |");
			System.out.print("\n   |   1 - Cargar Pintxos (pintxos.txt)                    |");
			System.out.print("\n   |   2 - Cargar Potes (potes.txt)                        |");
			System.out.print("\n   |   3 - Cargar Bares (bares.txt)                        |");
			System.out.print("\n   |   4 - Asignar pintxos y potes a cada bar manualmente  |");
			System.out.print("\n   |   5 - PintxoPote                                      |");
			//Visualizar la cuenta, con los pintxos y bebidas consumidas y el importe total de cada ronda.//
			System.out.print("\n   |   6 - Salir                                           |");
			System.out.print("\n   |                                                       |");
			System.out.print("\n    -------------------------------------------------------");

			System.out.print("\n\nElija un número de las opciones de arriba: ");
			respuestaUno = Integer.parseInt(sc.nextLine());

			switch (respuestaUno) {

/*-------------------------------------------------------- CARGAR PINTXOS ----------------------------------------------------------*/

				case 1: {

					FileReader fr = new FileReader("pintxos.txt");
					BufferedReader br = new BufferedReader(fr); 
					ArrayList<Pintxo> pintxos = new ArrayList<Pintxo>();
					String s;		
					while((s = br.readLine()) != null) { 

						Pintxo pintxoObjeto = new Pintxo();	
					
						String[] palabras = s.split(";");
						
				 		pintxoObjeto.setId(Integer.parseInt(palabras[0]));
				 		pintxoObjeto.setNombre(palabras[1]);
						String[] ingredientes = palabras[2].split(",");
				 		pintxoObjeto.setIngredientes(ingredientes);
				 		pintxoObjeto.setTipo(Integer.parseInt(palabras[3]));
					
						pintxos.add(pintxoObjeto);
					}

					System.out.println("\nHas seleccionado la opción 1 (Cargar Pintxos)\n");
					System.out.println("\nLISTA DE LOS PINTXOS\n");
					for(int x = 0; x < pintxos.size(); x++){
						System.out.println("ID: " + pintxos.get(x).getId());
						System.out.println("Nombre: " + pintxos.get(x).getNombre());
						System.out.print("Ingredientes: ");
						for(int y = 0; y < pintxos.get(x).getIngredientes().length; y++){
							if (y != (pintxos.get(x).getIngredientes().length - 1)){
								System.out.print(pintxos.get(x).getIngredientes()[y] + ", ");
							} else {
								System.out.print(pintxos.get(x).getIngredientes()[y] + "\n");
							}
						}
						if (pintxos.get(x).getTipo() == 1) {
							System.out.println("Tipo: Básico\n");
						} else if (pintxos.get(x).getTipo() == 2) {
							System.out.println("Tipo: Selecto\n");
						}
					}

					break;
				}

/*--------------------------------------------------------- CARGAR POTES ------------------------------------------------------------*/

				case 2: {

					FileReader fr = new FileReader("potes.txt");
					BufferedReader br = new BufferedReader(fr); 
					ArrayList<Pote> potes = new ArrayList<Pote>();
					String s;
					while((s = br.readLine()) != null) { 

						Pote poteObjeto = new Pote();	
					
						String[] palabras = s.split(";");
						
				 		poteObjeto.setId(Integer.parseInt(palabras[0]));
				 		poteObjeto.setNombre(palabras[1]);
				 		poteObjeto.setTipo(Integer.parseInt(palabras[2]));
					
						potes.add(poteObjeto);
					}

					System.out.println("\nHas seleccionado la opción 2 (Cargar Potes)\n");
					System.out.println("\nLISTA DE LOS POTES\n");
					for(int x = 0; x < potes.size(); x++){
						System.out.println("ID: " + potes.get(x).getId());
						System.out.println("Nombre: " + potes.get(x).getNombre());
						if (potes.get(x).getTipo() == 1) {
							System.out.println("Tipo: Básico\n");
						} else if (potes.get(x).getTipo() == 2) {
							System.out.println("Tipo: Selecto\n");
						}
					}

					break;
				}

/*--------------------------------------------------------- CARGAR BARES ------------------------------------------------------------*/

				case 3: {

					FileReader fr = new FileReader("bares.txt");
					BufferedReader br = new BufferedReader(fr);
					ArrayList<Bar> bares = new ArrayList<Bar>();
					String s;
					while((s = br.readLine()) != null) { 

						Bar barObjeto = new Bar();
					
						String[] palabras = s.split("_");
						
				 		barObjeto.setId(Integer.parseInt(palabras[0]));
				 		barObjeto.setNombre(palabras[1]);
				 		barObjeto.setDireccion(palabras[2]);

				 		String[] pintxosEnteros = palabras[3].split("\\.");

						ArrayList<Pintxo> pintxosBar = new ArrayList<Pintxo>();
				 		for (int i = 0; i < pintxosEnteros.length; i++){

				 			Pintxo pintxoObjetoBar = new Pintxo();

				 			String[] pintxosPalabras = pintxosEnteros[i].split(";");

				 			pintxoObjetoBar.setId(Integer.parseInt(pintxosPalabras[0]));
					 		pintxoObjetoBar.setNombre(pintxosPalabras[1]);
							String[] ingredientesBar = pintxosPalabras[2].split(",");
					 		pintxoObjetoBar.setIngredientes(ingredientesBar);
					 		pintxoObjetoBar.setTipo(Integer.parseInt(pintxosPalabras[3]));
						
							pintxosBar.add(pintxoObjetoBar);
				 		}

				 		barObjeto.setPintxos(pintxosBar);

				 		String[] potesEnteros = palabras[4].split("\\.");

						ArrayList<Pote> potesBar = new ArrayList<Pote>();
				 		for (int j = 0; j < potesEnteros.length; j++){

				 			Pote poteObjetoBar = new Pote();

				 			String[] potesPalabras = potesEnteros[j].split(";");

				 			poteObjetoBar.setId(Integer.parseInt(potesPalabras[0]));
					 		poteObjetoBar.setNombre(potesPalabras[1]);
					 		poteObjetoBar.setTipo(Integer.parseInt(potesPalabras[2]));
						
							potesBar.add(poteObjetoBar);
				 		}

				 		barObjeto.setPotes(potesBar);
					
						bares.add(barObjeto);
					}

					System.out.println("\nHas seleccionado la opción 3 (Cargar Bares)\n");
					System.out.println("\nLISTA DE LOS BARES\n");
					for(int x = 0; x < bares.size(); x++){
						System.out.println("BAR " + bares.get(x).getNombre().toUpperCase());
						System.out.println("ID: " + bares.get(x).getId() + " Dirección: " + bares.get(x).getDireccion());

						System.out.println("\n\nLista de los PINTXOS del bar " + bares.get(x).getNombre().toUpperCase() + "\n");
						System.out.printf("%-6s%-1s%-20s%-1s%-20s%-1s%-10s\n","  ID","|","       NOMBRE","|","    INGREDIENTES","|","   TIPO");
						for(int y = 0; y < bares.get(x).getPintxos().size(); y++) {

							String ingrediente = "";
							for(int z = 0; z < bares.get(x).getPintxos().get(y).getIngredientes().length; z++){
								if (z != (bares.get(x).getPintxos().get(y).getIngredientes().length - 1)){
									ingrediente = (ingrediente + bares.get(x).getPintxos().get(y).getIngredientes()[z] + ", ");
								} else {
									ingrediente = (ingrediente + bares.get(x).getPintxos().get(y).getIngredientes()[z]);
								}
							}

							String tipo = "";
							if (bares.get(x).getPintxos().get(y).getTipo() == 1) {
								tipo = "Básico";
							} else if (bares.get(x).getPintxos().get(y).getTipo() == 2) {
								tipo = "Selecto";
							}

							System.out.printf("%-6s%-1s%-20s%-1s%-20s%-1s%-10s\n","------","|","--------------------","|","--------------------","|","----------");
							System.out.printf("%-6s%-1s%-20s%-1s%-20s%-1s%-10s\n"," " + bares.get(x).getPintxos().get(y).getId(),"|"," " + bares.get(x).getPintxos().get(y).getNombre(),"|"," " + ingrediente,"|"," " + tipo);
						}

						System.out.println("\n\nLista de los POTES del bar " + bares.get(x).getNombre().toUpperCase() + "\n");
						System.out.printf("%-6s%-1s%-15s%-1s%-10s\n","  ID","|","     NOMBRE","|","   TIPO");
						for(int y = 0; y < bares.get(x).getPotes().size(); y++) {
							
							String tipo = "";
							if (bares.get(x).getPotes().get(y).getTipo() == 1) {
								tipo = "Básico";
							} else if (bares.get(x).getPotes().get(y).getTipo() == 2) {
								tipo = "Selecto";
							}

							System.out.printf("%-6s%-1s%-15s%-1s%-10s\n","------","|","---------------","|","----------");
							System.out.printf("%-6s%-1s%-15s%-1s%-10s\n"," " + bares.get(x).getPotes().get(y).getId(),"|"," " + bares.get(x).getPotes().get(y).getNombre(),"|"," " + tipo);
						}

						System.out.println("\n");
					}

					break;
				}

/*---------------------------------------------- ASIGNAR PINTXOS Y POTES MANUALMENTE ------------------------------------------------*/

				case 4: {
					System.out.println("\nHas seleccionado la opción 4 (Asignar pintxos y potes a cada bar manualmente)\n");

					Scanner scBar = new Scanner(System.in);
					FileReader fr = new FileReader("bares.txt");
					BufferedReader br = new BufferedReader(fr);
					ArrayList<Bar> bares = new ArrayList<Bar>();
					String s;
					while((s = br.readLine()) != null) {

						Bar barObjeto = new Bar();
					
						String[] palabras = s.split("_");
						
				 		barObjeto.setId(Integer.parseInt(palabras[0]));
				 		barObjeto.setNombre(palabras[1]);

						bares.add(barObjeto);
					}

					System.out.println("\nLISTA DE LOS BARES\n");
					for(int x = 0; x < bares.size(); x++) {
						System.out.println("BAR " + bares.get(x).getNombre().toUpperCase() + " (ID: " + bares.get(x).getId() + ")\n");
					}
					System.out.print("Ingrese el número de la ID del bar al que desea añadirle Pintxos o Potes: ");
					int respuestaBar = Integer.parseInt(scBar.nextLine());

					break;
				}

/*---------------------------------------------------------- PINTXOPOTE -------------------------------------------------------------*/

				case 5: {
					System.out.println("\nHas seleccionado la opción 5 (PintxoPote)\n");

					break;
				}

/*------------------------------------------------------------ SALIR ----------------------------------------------------------------*/

				case 6: {
					System.out.println("\nHas seleccionado la opción 6 (Salir del programa)\n");
					break;
				}

/*----------------------------------------------------------- DEFAULT ---------------------------------------------------------------*/

				default: {
					System.out.println("\nHas seleccionado una opcion no válida");
					System.out.println("\nLas opciones válidas son: 1 - 2 - 3 - 4 - 5 - 6");
					System.out.println("\nIntentelo de nuevo");
					break;
				}
			}
		} while (respuestaUno != 6);
	}
}