package by.itacademy.hometask.appliance.dao.impl;

import by.itacademy.hometask.appliance.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ApplianceMaker {

    private final List<String> dataAfterMatching;

    public ApplianceMaker(List<String> dataAfterMatching) {
        this.dataAfterMatching = dataAfterMatching;
    }

    public List<Appliance> make() {

        Appliance appliance = null;
        List<Appliance> applianceResult = new ArrayList<>();

        for (String fromDataAfterMatching : dataAfterMatching) {

            String[] array = fromDataAfterMatching.split("[\\s,:=]+");
//            System.out.println("Массив из выбранной группы  ");
//            for (int i = 0; i < array.length; i++) {
//				System.out.print("\t"+array[i]);
//			}
//            System.out.println();
			//System.out.println("///////////");

            switch (array[0]) {

                case "Oven":
                    appliance = new Oven(array[0], Double.parseDouble(array[2]), Double.parseDouble(array[4]),
                            Double.parseDouble(array[6]), Double.parseDouble(array[8]),
                                    Double.parseDouble(array[10]), Double.parseDouble(array[12]));

                            applianceResult.add(appliance);
                    break;
                case "Laptop":
                    appliance = new Laptop(array[0],Double.parseDouble(array[2]), array[4],
                            Double.parseDouble(array[6]), Double.parseDouble(array[8]),
                            Double.parseDouble(array[10]), Double.parseDouble(array[12]));

                    applianceResult.add(appliance);

                    break;

                case "Refrigerator":
                    appliance = new Refrigerator(array[0],Integer.parseInt(array[2]),Integer.parseInt(array[4]),
                            Integer.parseInt(array[6]),Double.parseDouble(array[8]), Integer.parseInt(array[10]),
                            Integer.parseInt(array[10]));



                    applianceResult.add(appliance);

                    break;

                case "VacuumCleaner":
                    appliance = new VacuumCleaner(array[0], Double.parseDouble(array[2]), array[4],
                            array[6], array[8], Integer.parseInt(array[10]), Integer.parseInt(array[12]));
                    applianceResult.add(appliance);

                    break;

                case "TabletPC":
                    appliance = new TabletPC(array[0],Double.parseDouble(array[2]),Double.parseDouble(array[4]),
                            Double.parseDouble(array[6]), Double.parseDouble(array[8]), array[10]);

                    applianceResult.add(appliance);

                    break;

                case "Speakers":
                    appliance = new Speakers(array[0],Double.parseDouble(array[2]),Integer.parseInt(array[4]),
                            Double.parseDouble(array[6]), Integer.parseInt(array[8]));

                    applianceResult.add(appliance);

                    break;

            }

        }
       // System.out.println("applianceResult"+applianceResult);
        return applianceResult;

    }


}
