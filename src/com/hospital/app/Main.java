package com.hospital.app;

import com.hospital.Impl.DoctorImpl;
import com.hospital.Impl.HospitalImpl;
import com.hospital.Impl.NurseImpl;
import com.hospital.Impl.PatientImpl;
import com.hospital.Impl.RoomImpl;
import com.hospital.Impl.TimeSlotImpl;
import com.hospital.models.Patient;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("******************Welcome******************");
		System.out.println("Menu : ");
		System.out.println("1-Ajouter un nouveau patient");
		System.out.println("2-Afficher la liste des docteurs");
		System.out.println("3-Afficher la liste des Patient");
		System.out.println("4-Afficher la liste des Opérations");
		//PatientImpl patientImpl = new PatientImpl();
		//patientImpl.saisiListe();
		//DoctorImpl doctorimpl = new DoctorImpl();
		//doctorimpl.saisiListe();
		HospitalImpl hospitalimpl = new HospitalImpl();
		hospitalimpl.nvHospital();
		//RoomImpl roomimpl = new RoomImpl();
		//roomimpl.saisieList();
		//TimeSlotImpl timeslotimpl = new TimeSlotImpl();
		//timeslotimpl.listeTimeSlote();
		//NurseImpl nurseimpl = new NurseImpl();
		//nurseimpl.saisieList();
		
	}
}
