package Main;

import entidades.Videojuego;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProbandoJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("gestorVideojuegos");
		EntityManager em=emFactory.createEntityManager();
		
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		Videojuego j0=new Videojuego("Jedi Survivor","Electronic Arts", 2023);
		Videojuego j1=new Videojuego("The legend of Zelda Tears of the kingdom","Nintendo", 2023);
		Videojuego j2=new Videojuego("Elden Ring","From Software", 2022);
		Videojuego j3=new Videojuego("Doom Eternal","Id Software", 2019);
		Videojuego j4=new Videojuego("Jedi Fallen Order","Electronic Arts", 2018);
		Videojuego j5=new Videojuego("FIFA 23","Electronic Arts", 2022);
		Videojuego j6=new Videojuego("Spiderman Miles Morales","Sony", 2022);
		Videojuego j7=new Videojuego("Forza Horizon 5","Playground Games", 2022);
		Videojuego j8=new Videojuego("Battlefront 2","Electronic Arts",2020);
		Videojuego[] juegos= {j0,j1,j2,j3,j4,j5,j6,j7,j8};
		for(Videojuego j:juegos) {
			em.persist(j);
		}
		tran.commit();
		
		//Buscar un objeto en la base de datos por id
		/*Videojuego juego=em.find(Videojuego.class, 52);
		System.out.println(juego);*/
	/*	Videojuego juego2=em.find(Videojuego.class, 53);
		System.out.println(juego2);
		if(juego2!=null) {
			/*EntityTransaction tran=em.getTransaction();
			tran.begin();
			juego2.setDesarrollador("Bethesda");
			juego2.setAnyoLanzamiento(2018);
			tran.commit();*/
		
		//Actualizamos los datos del juego FIFA
		//1-SAco el objeto de la base de datos
	/*	Videojuego fifa=em.find(Videojuego.class, 55);
		//1a-Compruebo si el juego se ha obtenido de la base de datos
			if(fifa!=null) {
			//2-creo una transacción
			EntityTransaction tran=em.getTransaction();
			//3-Inif(fifa!=nullcio la transacción
			tran.begin();
			//4-Realizo todos los cambios sobre el objeto u objetos
			fifa.setNombre("EA Sports FC");
			fifa.setAnyoLanzamiento(2023);
			fifa.setDesarrollador("EA Sports");
			//5-Hago commmit de los cambios.
			tran.commit();
		}		*/
			/*//Borrado de objetos de la base de datos
			Videojuego juegoBorrar=em.find(Videojuego.class, 1);
			//Como el borrado modifica la base de datos, tengo que crear una transacción
			EntityTransaction tran=em.getTransaction();
			//Iniciamos la transacción
			tran.begin();
			//A continuación, con la transacción iniciada, borramos el objeto del EntityManager
			em.remove(juegoBorrar);
			tran.commit();*/
	}
}
