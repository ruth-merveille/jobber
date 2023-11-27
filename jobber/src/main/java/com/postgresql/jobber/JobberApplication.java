package com.postgresql.jobber;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgresql.jobber.model.Commentaires;
import com.postgresql.jobber.model.Etudiants;
import com.postgresql.jobber.model.Publications;
import com.postgresql.jobber.service.EtudiantsService;
import com.postgresql.jobber.service.PublicationsService;
import com.postgresql.jobber.service.CommentairesService;


@SpringBootApplication
public class JobberApplication implements CommandLineRunner{

	@Autowired
	private EtudiantsService etudiantsService;
	@Autowired
	private PublicationsService publicationsService;

	public static void main(String[] args) {
		SpringApplication.run(JobberApplication.class, args);
}

//résultat de l'implémentation de l'interface CommandLineRunner
@Override
public void run(String... args) throws Exception{

		//la méthode getEtudiantsById renvoie un objet de type Optional. Cet objet permet d’encapsuler le résultat de la requête à la base de données. Dans le cas où la BDD contient un etudiant avec l’ID demandé, alors un objet Product sera instancié et encapsulé dans l’objet Optional. Dans le cas inverse, l’objet Optional est tout de même instancié, mais il contient un objet null.
		Optional<Etudiants> optEtudiants = etudiantsService.getEtudiantsById(1);

		Etudiants etudiantsId1 = optEtudiants.get();
		//on parcour la liste et affiche
		System.out.println(etudiantsId1.getNom_Etudiants());

	//la méthode getEtudiantsById renvoie un objet de type Optional. Cet objet permet d’encapsuler le résultat de la requête à la base de données. Dans le cas où la BDD contient un etudiant avec l’ID demandé, alors un objet Product sera instancié et encapsulé dans l’objet Optional. Dans le cas inverse, l’objet Optional est tout de même instancié, mais il contient un objet null.
	Optional<Publications> optPublications = publicationsService.getPublicationsById(1);

	Publications publicationsId1 = optPublications.get();
	//on parcour la liste et affiche
	System.out.println(publicationsId1.getContenu_publication());

		//affichage des commentaires
		//publicationsId1.getContenu_commentaire().forEach(
			//commentaire -> System.out.println(commentaire.getContenu_commentaire()));

}

}