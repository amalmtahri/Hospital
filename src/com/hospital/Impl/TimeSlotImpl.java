package com.hospital.Impl;

import java.util.ArrayList;
import java.util.List;

import com.hospital.interfaces.TimeSlotInterface;
import com.hospital.models.TimeSlot;

public class TimeSlotImpl implements TimeSlotInterface{

	@Override
	public List<TimeSlot> listeTimeSlote() {
		// TODO Auto-generated method stub
		List<TimeSlot> liste = new ArrayList<TimeSlot>();
		TimeSlot t1 = new TimeSlot(8, 10);
		liste.add(t1);
		TimeSlot t2 = new TimeSlot(10, 12);
		liste.add(t2);
		TimeSlot t3 = new TimeSlot(2, 4);
		liste.add(t3);
		TimeSlot t4 = new TimeSlot(4, 6);
		liste.add(t4);
		TimeSlot t5 = new TimeSlot(6, 8);
		liste.add(t5);
		System.out.println(liste);

		return liste;
	}

}
