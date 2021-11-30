package com.hospital.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.hospital.models.Operation;
import com.hospital.models.Patient;

public interface PatientInterface {
	public Patient saisie();
	public void affichage(Patient p);
	public List<Patient> saisiListe();
	public void affichageListe(List<Patient> patients);
	
	
}
