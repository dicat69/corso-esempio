package com.main;

import com.bean.*;

public class MainApplication {

	public static void main(String[] args) {
//		int arrayInt [] = new int [3];
//
////		//una delle modalità utili a inizializzare un array
////		arrayInt[0]=89;
////		arrayInt[1]=49;
////		arrayInt[2]=49;
////		
////		
////		
////		for(int i=0; i< arrayInt.length; i++) {
////			
////			if(i==0)
////			{
////				System.out.println("Il contenuto della prima cella è "+arrayInt[i]);
////			}
////			else
////			{
////				if(i==1)
////				{
////					System.out.println("Il contenuto della seconda cella è "+arrayInt[i]);
////				}
////				else
////				{
////					System.out.println("Il contenuto della terza cella è "+arrayInt[i]);
////				}}}
////	
		
		
		//array reference ad oggetti
		
		Corso corsi []= new Corso[3];
		corsi[0]= new Corso("1018x", "Java SE", "Roma");
		corsi[1]= new Corso("1018x", "Java SE", "Roma");
		corsi[2]= new Corso("1018x", "Java SE", "Roma");
	
		for( Corso corso : corsi)
		{
		System.out.println(corso.toString());
		}
		
		
		Object arrayCA []= new Object [2];
		arrayCA[0]= new Corso ("69", "Java SE", "Roma");
		arrayCA[1]= new Academy ("1018x", "Java SE", "Roma","Sus");
		
		for(Object i : arrayCA) {
			System.out.println(i.toString());
		}
		
}
}

