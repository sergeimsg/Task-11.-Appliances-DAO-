package by.itacademy.hometask.appliance.main;

import by.itacademy.hometask.appliance.dao.DAOException;
import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.entity.Laptop;
import by.itacademy.hometask.appliance.entity.Oven;
import by.itacademy.hometask.appliance.entity.Refrigerator;
import by.itacademy.hometask.appliance.entity.criteria.Criteria;
import by.itacademy.hometask.appliance.entity.criteria.SearchCriteria;
import by.itacademy.hometask.appliance.service.ApplianceService;
import by.itacademy.hometask.appliance.service.ServiceException;
import by.itacademy.hometask.appliance.service.ServiceFactory;
import by.itacademy.hometask.appliance.view.Printer;

import java.util.List;

public class Main {
    public static void main(String[] args) throws DAOException, ServiceException {

        List<Appliance> appliances;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ApplianceService applianceService = serviceFactory.getApplianceService();

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName()); // "Oven" class name/ внутренний
        //статичиский класс

        criteriaOven.add(SearchCriteria.Oven.CAPACITY.name(), 33); //c oven не получается
        criteriaOven.add(SearchCriteria.Oven.WEIGHT.name(), 12);
        appliances = applianceService.find(criteriaOven);


        Printer printer = new Printer();
        System.out.println("PRINTER");
        printer.printAppliance(appliances);
//        FileApplianceDAOImpl fileApplianceDAO = new FileApplianceDAOImpl();
//        fileApplianceDAO.find(criteriaOven);
        //appliances = s

        Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
        criteriaRefrigerator.add(SearchCriteria.Refrigirator.POWER_CONSUMPTION.toString(), 100); // можно to string
        criteriaRefrigerator.add(SearchCriteria.Refrigirator.FREEZER_CAPACITY.name(), 10);
        // так как у нас не переопределен toString
       // criteriaRefrigerator.add(SearchCriteria.Refrigirator.HEIGHT.name(), 200); // но лучше name, если вдруг
        // toString переопределен

        appliances = applianceService.find(criteriaRefrigerator);
        printer.printAppliance(appliances);

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
        criteriaLaptop.add(SearchCriteria.Laptop.CPU.name(),2.2);
        criteriaLaptop.add(SearchCriteria.Laptop.OS.name(), "Linux");
        criteriaLaptop.add(SearchCriteria.Laptop.MEMORY_ROM.name(), 8000);
        appliances = applianceService.find(criteriaLaptop);
        printer.printAppliance(appliances);


    }
}