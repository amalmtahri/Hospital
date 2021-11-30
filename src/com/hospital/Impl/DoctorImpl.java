package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital.interfaces.DoctorInterface;
import com.hospital.models.Doctor;

public class DoctorImpl implements DoctorInterface{
	Scanner sc = new Scanner(System.in);

	@Override
	public Doctor saisie() {
		Doctor d = new Doctor();
		// TODO Auto-generated method stub
		System.out.println("saisir le prenom de doctor: ");
		d.setFirstname(sc.next());
		System.out.println("saisir le nom de doctor: ");
		String nom = sc.next();
		d.setLastname(nom);
		System.out.println("saisir l'adresse de doctor: ");
		d.setAddress(sc.next());
		System.out.println("saisir le numero phone de doctor: ");
		d.setPhone(sc.next());
		System.out.println("saisir le numero professionnelle de doctor: ");
		d.setProfessionNumber(sc.next());
		System.out.println("saisir le salaire de doctor: ");
		d.setSalary(Double.parseDouble(sc.next()));
		return d;
	}

	@Override
	public void affichage(Doctor d) {
		// TODO Auto-generated method stub
		System.out.println(d);
		
	}

	@Override
	public List<Doctor> saisiListe() {
		// TODO Auto-generated method stub
		String rep = null;
		List<Doctor> liste = new ArrayList<Doctor>();
		do {
			liste.add(saisie());
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
			affichageListe(liste);
		}while(rep.equalsIgnoreCase("o"));
		
		return liste;
	}

	@Override
	public void affichageListe(List<Doctor> Doctors) {
		// TODO Auto-generated method stub
		for (Doctor d : Doctors) {
			affichage(d);
		}
		
	}

}
