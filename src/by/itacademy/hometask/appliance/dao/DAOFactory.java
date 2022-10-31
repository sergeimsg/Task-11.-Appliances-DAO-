package by.itacademy.hometask.appliance.dao;

import by.itacademy.hometask.appliance.dao.impl.FileApplianceDAOImpl;

public class DAOFactory {              // создаем один набор данных

    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO  =new FileApplianceDAOImpl();

    private DAOFactory() {
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

   public static DAOFactory getInstance()
   {
       return instance;
   }

}
