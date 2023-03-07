package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSymptomData {

	public void WriteFileData() throws Exception {

		try {
			SortedMap compteurstri = new SortedMap();
			FileWriter writer = new FileWriter("C://Users//Moi//eclipse-workspace//Projet Java/result.out");
			writer.write(" " + compteurstri.finalList());
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
