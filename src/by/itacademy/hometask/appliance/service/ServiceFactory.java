package by.itacademy.hometask.appliance.service;

public class ServiceFactory {

    private static final ServiceFactory instance =new ServiceFactory();

    private final ApplianceService applianceService = new ApplanceServiceImpl();

    private ServiceFactory() {
    }

    public ApplianceService getApplianceService() {
            return applianceService;
    }

        public static ServiceFactory getInstance() {
            return instance;
        }
}
