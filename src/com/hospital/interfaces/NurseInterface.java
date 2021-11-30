package com.hospital.interfaces;

import java.util.List;

import com.hospital.models.Nurse;

public interface NurseInterface {
	public Nurse saisie();
	public void affichage(Nurse n);
	public List<Nurse> saisieList();
	public void affichageList(List<Nurse> nurses);
}
