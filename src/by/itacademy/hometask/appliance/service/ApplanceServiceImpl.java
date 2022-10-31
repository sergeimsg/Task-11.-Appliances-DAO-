package by.itacademy.hometask.appliance.service;

import by.itacademy.hometask.appliance.dao.ApplianceDAO;
import by.itacademy.hometask.appliance.dao.DAOException;
import by.itacademy.hometask.appliance.dao.DAOFactory;
import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.entity.criteria.Criteria;

import java.util.List;

public class ApplanceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {

        DAOFactory daoFactory =DAOFactory.getInstance();
        ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();

        List<Appliance> appliances;

        try {
                appliances = applianceDAO.find(criteria);
        }

        catch (DAOException  | NumberFormatException e) {
                throw new ServiceException(e);
        }

        return appliances;
    }
}
