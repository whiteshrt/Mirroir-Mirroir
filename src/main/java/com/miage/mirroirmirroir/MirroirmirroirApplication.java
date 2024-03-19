package com.miage.mirroirmirroir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class MirroirmirroirApplication {

	public static final String RESET = "\u001B[0m";
	public static final String BOLD = "\u001B[1m";
	public static final String BLUE = "\u001B[34m";
	public static final String GREEN = "\u001B[32m";

	public static final String PURPLE = "\u001B[35m";


	public static void main(String[] args) {
		String csvFile = "/Users/max/Downloads/mirroirmirroir/src/main/resources/Dataset.csv";

		SpringApplication.run(MirroirmirroirApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println(BOLD + BLUE + "----------------------------------------------------------------------------------------" + RESET);

		System.out.println(BOLD + BLUE + "Comment t'appelles-tu ?" + RESET);

		String nomUtilisateur = scanner.nextLine();

		while (nomUtilisateur.isEmpty()) {
			System.out.println(BOLD + BLUE + "Comment t'appelles-tu ?" + RESET);
			nomUtilisateur = scanner.nextLine();
		}

		System.out.println(PURPLE + "Bonjour, " + nomUtilisateur + " !" + RESET);

		System.out.println(BOLD + BLUE + "Dans quelle ville es-tu né ?" + RESET);
		String villeNaissance = scanner.nextLine();
		while (villeNaissance.isEmpty()) {
			System.out.println(BOLD + BLUE + "Dans quelle ville es-tu né ?" + RESET);
			villeNaissance = scanner.nextLine();
		}
		System.out.println(PURPLE + "Ah, " + villeNaissance + ", quelle belle ville !" + RESET);


		scanner.close();
	}
}
