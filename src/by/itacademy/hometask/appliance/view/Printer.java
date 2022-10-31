package by.itacademy.hometask.appliance.view;

import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.service.ServiceException;

import java.util.List;

public class Printer {

    public Printer() {
    }

        public void printAppliance(List<Appliance> appliance) throws ServiceException {

            try {
                for (Appliance appl : appliance) {

                    System.out.println(appl);

                }
            }
            catch (Exception e) {
                new ServiceException(e);
            }


        }
}
