package by.itacademy.hometask.appliance.dao.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceReader {

    private String sourcePath;

    public ApplianceReader() {
    }

    public ApplianceReader(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public List<String> take() throws FileNotFoundException, IOException {

        List<String> dataFromFile = new ArrayList<>();
        FileReader fileReader;
        fileReader = new FileReader(sourcePath);
        Scanner sc= new Scanner(fileReader);
        while (sc.hasNextLine()) {
            String interData = sc.nextLine();
            dataFromFile.add(interData);
        }
        sc.close();
        fileReader.close();
        return dataFromFile;
    }

    public List<String> take(String groupSearchName) throws FileNotFoundException, IOException{
        List<String> dataFromFile = new ArrayList<>();
        FileReader fileReader;
        fileReader = new FileReader(sourcePath);
        Scanner sc = new Scanner(fileReader);

        while (sc.hasNextLine()) {
            String interData = sc.nextLine();

            if (interData.contains(groupSearchName)) {
//                System.out.println("12345678");
//                System.out.println("interData "+interData);
                dataFromFile.add(interData);
            }
        }
        sc.close();
        fileReader.close();
        return dataFromFile;
    }

}
