package com.miage.mirroirmirroir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScanCsv {
    private final String csvFilePath;

    public ScanCsv(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public String[] findRowByString(String searchString) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");
                for (String element : elements) {
                    if (element.equals(searchString)) {
                        return elements; // Retourne les informations de la ligne trouvée
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Retourne null si la chaîne n'est pas trouvée
    }
}
