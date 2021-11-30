package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital.interfaces.RoomInterface;
import com.hospital.models.Room;

public class RoomImpl implements RoomInterface{
	Scanner sc = new Scanner(System.in);
	@Override
	public Room saisie() {
		Room r = new Room();
		// TODO Auto-generated method stub
		System.out.println("Enter le nombre de room : ");
		r.setNumber(sc.nextInt());
		System.out.println("Enter le stage de room : ");
		r.setStage(sc.nextInt());
		System.out.println("------------------------------------------------------");
		System.out.println("Le nombre de Room :" + r.getNumber());
		System.out.println("Le stage de Room :" + r.getStage());
		System.out.println("------------------------------------------------------");
		return r;
	}

	/*@Override
	public void affichage(Room r) {
		// TODO Auto-generated method stub
		System.out.println(r);
		
	}*/

	/*@Override
	public List<Room> saisieList() {
		// TODO Auto-generated method stub
		String rep = null;
		List<Room> liste = new ArrayList<Room>();
		do {
			liste.add(saisie());
			//affichageListe(liste);
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
			
		}while(rep.equalsIgnoreCase("o"));
		System.out.println("ok");
		return liste;
	}*/

	/*@Override
	public void affichageListe(List<Room> rooms) {
		// TODO Auto-generated method stub
		for (Room r : rooms) {
			affichage(r);
		}
	}*/
}
