package com.JANA60.calcolatrice.controller.main;
import java.util.Scanner;

import com.JANA60.calcolatrice.unit.helper.*;

public class Main 
{
	static Scanner keyboard = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
	
		String repeat, cmd, res="", dummy;
		int int1 =0 , int2=0, resInt=0;
		double d1=0.0, d2=0.0, resD=0.0;
		
		
		
		
		
		
		do
		{
			
			System.out.println("Benvenuto nella calcolatrice Java");
			
			
			
			do
			{
				System.out.println("Vuoi effettuare un'operazione tra interi o decimali?"); //chiedo se si vuole fare un'operazione int o double
				dummy = keyboard.nextLine();
				if (!dummy.equalsIgnoreCase("interi") && !dummy.equalsIgnoreCase("decimali"))
					System.out.println("Risposta non valida, inserire interi o decimali, grazie.");
			}while(!dummy.equalsIgnoreCase("interi") && !dummy.equalsIgnoreCase("decimali"));
			
			if (dummy.equalsIgnoreCase("interi")) //se voglio fare un'operazione int, inserisco degli int
			{
				System.out.println("Inserisci il primo intero");
				int1 = Integer.parseInt(keyboard.nextLine());
				System.out.println("Inserisci il secondo intero");
				int2 = Integer.parseInt(keyboard.nextLine());
			}
			else //altrimenti dei double
			{
				System.out.println("Inserisci il primo numero");
				d1 = Double.parseDouble(keyboard.nextLine());
				System.out.println("Inserisci il secondo numero");
				d2 = Double.parseDouble(keyboard.nextLine());
			}
			
			if (dummy.equalsIgnoreCase("interi")) //switch di operazioni con interi
			{
				System.out.println("Che operazione vuoi eseguire?");
				cmd = keyboard.nextLine();
				
				switch(cmd.toLowerCase())
				{
					case "somma":
						resInt= CalcoliHelper.sum(int1, int2);
					break;
					case "sottrazione":
						resInt= CalcoliHelper.diff(int1, int2);
					break;
					case "moltiplicazione":
						resInt= CalcoliHelper.molt(int1, int2);
					break;
					case "minimo":
						resInt= CalcoliHelper.min(int1, int2);
					break;
					case "massimo":
						resInt= CalcoliHelper.max(int1, int2);
					break;
					case "assoluto":
						{
							System.out.println("Vuoi il valore assoluto del primo o del secondo numero?");
							int dummyInt = Integer.parseInt(keyboard.nextLine());
							if (dummyInt == 1)
								resInt= CalcoliHelper.abs(int1);
							else
								resInt= CalcoliHelper.abs(int2);

						}
					break;
					case "potenza":
						{
							System.out.println("Quale numero vuoi sia la base?");
							int dummyInt = Integer.parseInt(keyboard.nextLine());
							if (dummyInt == 1)
								resD=CalcoliHelper.esp(int1, int2);
							else
								resD=CalcoliHelper.esp(int2, int1);		
						}
					break;
					default:
						resInt=0;
					
				}
				if (cmd.equalsIgnoreCase("potenza"))
					System.out.println("Il risultato dell'operazione è: " +resD);
				else
					System.out.println("Il risultato dell'operazione è: " +resInt);

			
			}
			
			else //switch di operazioni con i decimali
			{
				System.out.println("Che operazione vuoi eseguire?");
				cmd = keyboard.nextLine();
				
				switch(cmd.toLowerCase())
				{
					case "somma":
						resD= CalcoliHelper.sum(d1, d2);
					break;
					case "sottrazione":
						resD= CalcoliHelper.diff(d1, d2);
					break;
					case "moltiplicazione":
						resD= CalcoliHelper.molt(d1, d2);
					break;
					case "minimo":
						resD= CalcoliHelper.min(d1, d2);
					break;
					case "massimo":
						resD= CalcoliHelper.max(d1, d2);
					break;
					case "assoluto":
						{
							System.out.println("Vuoi il valore assoluto del primo o del secondo numero?");
							int dummyInt = Integer.parseInt(keyboard.nextLine());
							if (dummyInt == 1)
								resD= CalcoliHelper.abs(d1);
							else
								resD= CalcoliHelper.abs(d2);

						}
					break;
					case "potenza":
						{
							res="Questa operazione non è eseguibile con numeri decimali";	
						}
					break;
					default:
						resD=0;
					
				}
				if (cmd.equalsIgnoreCase("potenza"))
					System.out.println(res);
				else
					System.out.println("Il risultato dell'operazione è: " +resD);
			}
			
			
			
			
			do
			{
				System.out.println("Vuoi riprovare la calcolatrice?");
				
				repeat=keyboard.nextLine();
				
				if(!repeat.equalsIgnoreCase("si") && !repeat.equalsIgnoreCase("no"))
					System.out.println("Wrong input. Please insert yes or no.");
				
			}while(!repeat.equalsIgnoreCase("si") && !repeat.equalsIgnoreCase("no"));
			
		
		}while(repeat.equalsIgnoreCase("si"));
		
		System.out.println("Grazie, arrivederci!");
		
		keyboard.close();
	}

}
