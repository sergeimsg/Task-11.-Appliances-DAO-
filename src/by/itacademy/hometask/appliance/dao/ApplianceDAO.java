package by.itacademy.hometask.appliance.dao;

import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> find(Criteria criteria) throws DAOException;




}
