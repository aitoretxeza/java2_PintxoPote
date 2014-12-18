import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) throws IOException {

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

		System.out.print("\nElija un número de las opciones de arriba: ");		
		String respuesta = sc.nextLine();		

		switch (respuesta) {

/*-------------------------------------------------------- CARGAR PINTXOS ----------------------------------------------------------*/

			case "1": {

				FileReader fr = new FileReader("pintxos.txt");
				BufferedReader br = new BufferedReader(fr); 
				String [] palabras = null;
				String s;
				ArrayList<Pintxo> pintxos = new ArrayList<Pintxo> ();		
				while((s = br.readLine()) != null) { 

					Pintxo pintxoObjeto = new Pintxo();	
					
					palabras = s.split("; ");
				    
			 		pintxoObjeto.setId(Integer.parseInt(palabras[0]));
			 		pintxoObjeto.setNombre(palabras[1]);
			 		pintxoObjeto.setIngredientes(palabras[2]);
			 		pintxoObjeto.setTipo(Integer.parseInt(palabras[3]));
					
					pintxos.add(pintxoObjeto);
				}

				System.out.println("\nPINTXOS\n");
				for(int x = 0; x < pintxos.size(); x++){
					System.out.println("ID: " + pintxos.get(x).getId());
					System.out.println("Nombre: " + pintxos.get(x).getNombre());
					System.out.println("Ingredientes: " + pintxos.get(x).getIngredientes());
					System.out.println("Tipo: " + pintxos.get(x).getTipo() + "\n");
				}

				break;
			}

/*--------------------------------------------------------- CARGAR POTES ------------------------------------------------------------*/

			case "2": {

				FileReader fr = new FileReader("potes.txt");
				BufferedReader br = new BufferedReader(fr); 
				String [] palabras = null;
				String s;
				ArrayList<Pote> potes = new ArrayList<Pote> ();		
				while((s = br.readLine()) != null) { 

					Pote poteObjeto = new Pote();	
					
					palabras = s.split("; ");
				    
			 		poteObjeto.setId(Integer.parseInt(palabras[0]));
			 		poteObjeto.setNombre(palabras[1]);
			 		poteObjeto.setTipo(Integer.parseInt(palabras[2]));
					
					potes.add(poteObjeto);
				}

				System.out.println("\nPOTES\n");
				for(int x = 0; x < potes.size(); x++){
					System.out.println("ID: " + potes.get(x).getId());
					System.out.println("Nombre: " + potes.get(x).getNombre());
					System.out.println("Tipo: " + potes.get(x).getTipo() + "\n");
				}
				
				break;
			}
				
/*--------------------------------------------------------- CARGAR BARES ------------------------------------------------------------*/

			case "3": {

				FileReader fr = new FileReader("bares.txt");
				BufferedReader br = new BufferedReader(fr); 
				String [] palabras = null;
				String s;
				ArrayList<Bar> bares = new ArrayList<Bar> ();		
				while((s = br.readLine()) != null) { 

					Bar barObjeto = new Bar();	
					
					palabras = s.split("; ");
				    
			 		barObjeto.setId(Integer.parseInt(palabras[0]));
			 		barObjeto.setNombre(palabras[1]);
			 		barObjeto.setDireccion(palabras[2]);

			 		ArrayList<Pintxo> pintxosBares = new ArrayList<Pintxo> ();
					
					bares.add(barObjeto);
				}

				System.out.println("\nBARES\n");
				for(int x = 0; x < bares.size(); x++){
					System.out.println("ID: " + bares.get(x).getId());
					System.out.println("Nombre: " + bares.get(x).getNombre());
					System.out.println("Direccion: " + bares.get(x).getDireccion() + "\n");
				}
				
				break;
			}

/*---------------------------------------------- ASIGNAR PINTXOS Y POTES MANUALMENTE ------------------------------------------------*/

			case "4": {
				
				break;
			}

/*---------------------------------------------------------- PINTXOPOTE -------------------------------------------------------------*/

			case "5": {
				
				break;
			}

/*------------------------------------------------------------ SALIR ----------------------------------------------------------------*/

			case "6": {
				
				break;
			}
		}			
	}
}