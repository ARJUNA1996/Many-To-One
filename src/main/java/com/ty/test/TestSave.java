package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.Hotel;
import com.ty.manytoone.Room;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Hotel hotel1 = new Hotel();
		hotel1.setName("MINAKSHI");
		hotel1.setAddress("BTM layout");
		
		Hotel hotel2 = new Hotel();
		hotel2.setName("MOON KNIGHT");
		hotel2.setAddress("BTM layout");

		Room room1 = new Room();
		room1.setCapacity(12);
		room1.setType("Ac");

		room1.setHotel(hotel1);

		Room room2 = new Room();
		room2.setCapacity(1);
		room2.setType("NON-AC");

		room2.setHotel(hotel1);

		Room room3 = new Room();
		room3.setCapacity(4);
		room3.setType("NORMAL");
		room3.setHotel(hotel1);
		
		Room room4 = new Room();
		room4.setCapacity(2);
		room4.setType("STAR ROOM");
		room4.setHotel(hotel2);
		
		Room room5 = new Room();
		room5.setCapacity(3);
		room5.setType("Ac");
		room5.setHotel(hotel2);
		
		transaction.begin();
		manager.persist(hotel1);
		manager.persist(hotel2);
		manager.persist(room1);
		manager.persist(room2);
		manager.persist(room3);
		manager.persist(room4);
		manager.persist(room5);
		
		transaction.commit();
		
		

	}
}








































