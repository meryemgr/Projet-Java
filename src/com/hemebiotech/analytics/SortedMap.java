package com.hemebiotech.analytics;

import java.util.TreeMap;

public class SortedMap {

	public TreeMap<String, Integer> finalList() {
		ReadSymptomDataFromFile ReadFile = new ReadSymptomDataFromFile(
				"C:/Users/Moi/Desktop/OpenClasserooms/Projet 4/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master/Project02Eclipse/symptoms.txt");
		ReadFile.GetSymptoms();
		/*
		 * Ici, on compte les doublons gr�ce � la Map. en param�tres, Cl� (ligne) et
		 * valeur (nb d'occurrences).
		 */
		TreeMap<String, Integer> compteurs = new TreeMap<>();

		for (String line : ReadFile.GetSymptoms()) {
			if (compteurs.containsKey(line)) {
				// si la ligne contient d�j� la ligne, on incr�mente le compteur qui est associ�
				compteurs.put(line, compteurs.get(line) + 1);
			} else {
				// sinon on ajoute l'association en initialisant le compteur � 1
				compteurs.put(line, 1);
			}
		}

		return compteurs;
	}

}
