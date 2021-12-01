package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.hospital.models.*;

import com.hospital.interfaces.OperationInterface;


public class OperationImpl implements OperationInterface{
	List<Room> listRoom = new ArrayList<Room>();
	List<Nurse> listNurse = new ArrayList<>();
	List<Doctor> listDoctor = new ArrayList<Doctor>();
	List<Nurse> nurseD1 = new ArrayList<Nurse>();
	List<Nurse> nurseD2 = new ArrayList<Nurse>();
	List<Nurse> nurseD3 = new ArrayList<Nurse>();
	List<Nurse> nurseD4 = new ArrayList<Nurse>();
	public List<Nurse> listNurse(){
		 
		 listNurse.add(new Nurse("Nurse1","Nurse1","065247237383","SAFI","A10",3000.00));
		 listNurse.add(new Nurse("Nurse2","Nurse2","065374643830","SAFI","A20",3000.00));
		 listNurse.add(new Nurse("Nurse3","Nurse3","076554445567","SAFI","A30",3000.00));
		 listNurse.add(new Nurse("Nurse4","Nurse4","061714145262","SAFI","A40",3000.00));
		 listNurse.add(new Nurse("Nurse5","Nurse5","062345678962","SAFI","A50",3000.00));
		 listNurse.add(new Nurse("Nurse6","Nurse6","060987654362","SAFI","A60",3000.00));
		 listNurse.add(new Nurse("Nurse7","Nurse7","062283930362","SAFI","A70",3000.00));
		 listNurse.add(new Nurse("Nurse6","Nurse6","060939300482","SAFI","A80",3000.00));
		 nurseD1.add(listNurse.get(0));
		 nurseD1.add(listNurse.get(1));
		 nurseD2.add(listNurse.get(2));
		 nurseD2.add(listNurse.get(3));
		 nurseD3.add(listNurse.get(4));
		 nurseD3.add(listNurse.get(5));
		 nurseD4.add(listNurse.get(6));
		 nurseD4.add(listNurse.get(7));
		// System.out.println(listNurse);
		return listNurse;
		
	}
	public List<Doctor> listDoctor(){
		listDoctor.add(new Doctor("Doctor1","Doctor1","0655443322","SAFI","B10",new TimeSlot(8,11),10000.00,nurseD1));
		listDoctor.add(new Doctor("Doctor2","Doctor2","0714132637","SAFI","B20",new TimeSlot(2,4),10000.00,nurseD2));
		listDoctor.add(new Doctor("Doctor3","Doctor3","0609343322","SAFI","B30",new TimeSlot(10,2),10000.00,nurseD3));
		listDoctor.add(new Doctor("Doctor4","Doctor4","0765980737","SAFI","B40",new TimeSlot(8,12),10000.00,nurseD4));
		return listDoctor;
	}
	public List<Room> listRoom(){
		listRoom.add(new Room(1,1));
		listRoom.add(new Room(2,1));
		listRoom.add(new Room(3,2));
		listRoom.add(new Room(4,2));
		listRoom.add(new Room(5,3));
		listRoom.add(new Room(6,3));
		listRoom.add(new Room(7,4));
		listRoom.add(new Room(8,4));
		listRoom.add(new Room(9,5));
		listRoom.add(new Room(10,5));
		return listRoom;
		
	}
	@Override
	public Optional<Operation> getOperationByRef(int ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOperation(List<Operation> operations) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affichage(List<Operation> operations) {
		// TODO Auto-generated method stub
		
	}

}
