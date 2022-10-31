package by.itacademy.hometask.appliance.service;

import by.itacademy.hometask.appliance.entity.Appliance;
import by.itacademy.hometask.appliance.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {


    List<Appliance> find(Criteria criteria) throws ServiceException;

}
