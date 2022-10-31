package by.itacademy.hometask.appliance.dao.impl;

import by.itacademy.hometask.appliance.dao.ApplianceDAO;
import by.itacademy.hometask.appliance.dao.DAOException;
import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public class FileApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        List<Appliance> applianceChosen = null;
        final String filePath = "\\src\\by\\itacademy\\hometask\\appliance\\resource\\appliances_db.txt";
        // рабочая директория
        // D:\Java\IT Academy\ApplianceDAO_Melnik\HomeTask\src\by\itacademy\hometask\appliance\resource\
        String filePathToRead = System.getProperty("user.dir")+ filePath;
        //System.out.println("///"+filePathToRead); // проверка директории файла для чтения
        ApplianceReader applianceReader = new ApplianceReader(filePathToRead);
        List<String> dataFromSource = null;

        if (criteria.getGroupSearchName() != null) {
           // System.out.println("criteria.getGroupSearchName()  "+criteria.getGroupSearchName());
            try {

                dataFromSource = applianceReader.take(criteria.getGroupSearchName());
            } catch (IOException exception) {
                throw new DAOException(exception);
            }
        } else {
            try {
                dataFromSource = applianceReader.take();
            } catch (IOException ex) {
                throw new DAOException(ex);
            }

        }
            ApplianceDataMatcher matcher = new ApplianceDataMatcher(dataFromSource,criteria);
            List<String> dataAfterMatching = matcher.match();
         //  System.out.println("dataAfterMatching"+dataAfterMatching);
            ApplianceMaker applianceMaker = new ApplianceMaker(dataAfterMatching);
              applianceChosen =applianceMaker.make();
       // System.out.println("---------");
//        for (Appliance el: applianceChosen) {
//
//            System.out.println("applianceChosen  " + el);
//
//        }

        return applianceChosen;

    }
}