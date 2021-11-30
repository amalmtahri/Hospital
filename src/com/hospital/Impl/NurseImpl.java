package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hospital.interfaces.NurseInterface;
import com.hospital.models.Nurse;
import com.hospital.models.Patient;

public class NurseImpl implements NurseInterface{
	Scanner sc = new Scanner(System.in);
	@Override
	public Nurse saisie() {
		Nurse n = new Nurse();
		// TODO Auto-generated method stub
		System.out.println("Saisir le prenom de infirmière : ");
		n.setFirstname(sc.next());
		System.out.println("Saisir le nom de infirmière : ");
		n.setLastname(sc.next());
		System.out.println("Saisir l'adresse de infirmière : ");
		n.setAddress(sc.next());
		System.out.println("Saisir le phone de infirmière : ");
		n.setPhone(sc.next());
		System.out.println("Saisir le professionNumber de infirmière : ");
		n.setProfessionNumber(sc.next());
		System.out.println("saisir le salaire de infirmière: ");
		n.setSalary(Double.parseDouble(sc.next()));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Le Prenom de l'infirmière : " + n.getFirstname());
		System.out.println("Le Nom de l'infirmière : " + n.getLastname());
		System.out.println("L'adresse de l'infirmière : " + n.getAddress());
		System.out.println("Le phone de l'infirmière : " + n.getPhone());
		System.out.println("Le professionNumber de l'infirmière : " + n.getProfessionNumber());
		System.out.println("Le salaire de l'infirmière : " + n.getSalary() + "DH");
		System.out.println("------------------------------------------------------");
		return n;
	}

	@Override
	public void affichage(Nurse n) {
		// TODO Auto-generated method stub
		System.out.println(n);
	}

	@Override
	public List<Nurse> saisieList() {
		// TODO Auto-generated method stub
		String rep = null;
		List<Nurse> liste = new ArrayList<Nurse>();
		do {
			liste.add(saisie());
			affichageList(liste);
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
		}while(rep.equalsIgnoreCase("o"));
		
		return liste;
	}

	@Override
	public void affichageList(List<Nurse> nurses) {
		// TODO Auto-generated method stub
		for (Nurse n : nurses) {
			affichage(n);
		}
		
	}

}
