package com.hospital.app;

import java.util.Scanner;

import com.hospital.Impl.OperationImpl;
import com.hospital.Impl.PatientImpl;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("---------------------Welcome to Hospital Mohammed 5----------------");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1-Ajouter un nouveau patient");
		System.out.println("2-Afficher la liste des docteurs");
		System.out.println("3-Afficher la liste des Inférmières");
		System.out.println("4-Afficher la liste des Chambres");
		System.out.println("5-Afficher la liste des Opérations");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Entrer votre choix :");
		int res = sc.nextInt();
		reponse(res);
	}
	
	public static void reponse(int chose) {
    	OperationImpl op = new OperationImpl();
        switch (chose){
            case 1 : 
            	PatientImpl patientImpl = new PatientImpl();
            	patientImpl.saisiListe();
            	main(null);
            	break;
            case 2: 
            	System.out.println(op.listDoctor());
            	main(null);
            	break;
            case 3: 
            	System.out.println(op.listNurse());
            	break;
            case 4:
            	System.out.println(op.listRoom());
            	break;
            default:
                System.out.println("This chose not in list");
                break;
        }
    }
	
}
