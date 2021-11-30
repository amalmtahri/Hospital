package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital.interfaces.HospitalInterface;
import com.hospital.models.Room;
import com.hospital.models.Doctor;

public class HospitalImpl implements HospitalInterface{
	Scanner sc = new Scanner(System.in);
	@Override
	public void nvHospital() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("*************************Saisir les données d'un hospital*************************");
		System.out.println("Saisir les chambres de l'hopitale :");
		RoomImpl r = new RoomImpl();
		String rep = null;
		List<Room> liste = new ArrayList<Room>();
		do {
			liste.add(r.saisie());
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
			
		}while(rep.equalsIgnoreCase("o"));
		System.out.println(liste);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Saisir les Docteurs de l'hopitale :");
		DoctorImpl d = new DoctorImpl();
		List<Doctor> listeDoctors = new ArrayList<Doctor>();
		do {
			listeDoctors.add(d.saisie());
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
			
		}while(rep.equalsIgnoreCase("o"));
		System.out.println(listeDoctors);
		
		
		
	}
	
	
}
