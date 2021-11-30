package com.hospital.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Patient;

public class PatientImpl implements PatientInterface {
	Scanner sc = new Scanner(System.in);
	int cmp = 100;
	@Override
	public Patient saisie() {
		Patient p = new Patient();
		// TODO Auto-generated method stub
		System.out.println("saisir votre prenom : ");
		p.setFirstname(sc.next().toString());
		System.out.println("saisir votre nom : ");
		String nom = sc.next();
		p.setLastname(nom);
		System.out.println("saisir votre adresse : ");
		p.setAddress(sc.next().toString());
		System.out.println("saisir votre phone : ");
		p.setPhone(sc.next().toString());
		System.out.println("saisir la date de l'entrer ce format dd/MM/yyyy: ");
		String sDate1= sc.next();
		try {
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			p.setHospitalEntryDate(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setAffiliationNumber(nom + cmp);
		cmp++;
		System.out.println("Choisir votre type d'assurance :");
		System.out.println("------------------------------------------------------------");
		System.out.println("1 =====> CNSS");
		System.out.println("2 =====> RAMED");
		System.out.println("3 =====> CNOPS");
		System.out.println("4 =====> NONE");
		System.out.println("------------------------------------------------------------");

		int choix = sc.nextInt();
		InsuranceType insuranceTypev = insuranceType(choix);
        p.setInsuranceType(insuranceTypev);
		
		return p;
	}
	public InsuranceType insuranceType(int chose) {

        switch (chose){
            case 1 : return InsuranceType.CNSS;
            case 2: return  InsuranceType.RAMED;
            case 3: return InsuranceType.CNOPS;
            case 4:return InsuranceType.NONE;
            default:
                System.out.println("This chose not in list");
                return null;
        }
    }
	@Override
	public void affichage(Patient p) {
		// TODO Auto-generated method stub
		System.out.println(p);
		
	}

	@Override
	public List<Patient> saisiListe() {
		String rep = null;
		List<Patient> liste = new ArrayList<Patient>();
		do {
			liste.add(saisie());
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
			affichageListe(liste);
		}while(rep.equalsIgnoreCase("o"));
		
		return liste;
	}

	@Override
	public void affichageListe(List<Patient> patients) {
		for (Patient p : patients) {
			affichage(p);
		}
		
	}

	
	

}
