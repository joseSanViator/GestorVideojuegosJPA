package entidades;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProbandoJPPQL {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("gestorVideojuegos");
		EntityManager em=emFactory.createEntityManager();
	/*	
		String jpql="SELECT v FROM Videojuego v WHERE v.anyoLanzamiento<2022";
		Query query=em.createQuery(jpql);
		List<Videojuego> juegos=query.getResultList();
		for(Videojuego v:juegos) {
			System.out.println(v);
			System.out.println("----------------------");
		}*/
		/*String jpql="SELECT v FROM Videojuego v WHERE v.nombre LIKE 'e%'";
		Query query=em.createQuery(jpql);
		List<Videojuego> juegos=query.getResultList();
		for(Videojuego v:juegos) {
			System.out.println(v);
			System.out.println("----------------------");
		}*/
		/*
		String jpql="SELECT v FROM Videojuego v WHERE v.desarrollador='Electronic Arts'";
		Query query=em.createQuery(jpql);
		List<Videojuego> juegos=query.getResultList();
		for(Videojuego v:juegos) {
			System.out.println(v);
			System.out.println("----------------------");
		}*/
		/*String jpql="SELECT v.nombre FROM Videojuego v";
		Query query=em.createQuery(jpql);
		List<String> nombres=query.getResultList();
		for(String n:nombres) {
			System.out.println(n);
			System.out.println("----------------------");
		}*/
		/*String jpql="SELECT v.nombre,v.anyoLanzamiento,v.desarrollador FROM Videojuego v";
		Query query=em.createQuery(jpql);
		List<Object[]> juegos=query.getResultList();
		for(Object[] v:juegos) {
			System.out.println("Titulo: "+v[0]);
			System.out.println("Año: "+v[1]);
			System.out.println("Desarrollador: "+v[2]);
			System.out.println("----------------------");
		}
		*/
		////UPDATE
		/*String jpql="UPDATE Videojuego v SET v.anyoLanzamiento=v.anyoLanzamiento+1000";
		Query query=em.createQuery(jpql);
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		int modificados=query.executeUpdate();
		tran.commit();
		System.out.println(modificados+" juegos han sido actualizados");*/
		
		//DELETE
		String jpql="DELETE FROM Videojuego v where v.desarrollador='Electronic Arts' or v.desarrollador='EA Sports'";
		Query query=em.createQuery(jpql);
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		int eliminados=query.executeUpdate();
		tran.commit();
		System.out.println(eliminados+" juegos han sido eliminados");
	}
	
	
}
