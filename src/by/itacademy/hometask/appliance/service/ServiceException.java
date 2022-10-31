package by.itacademy.hometask.appliance.service;

import java.io.Serializable;

public class ServiceException extends Exception implements Serializable {

        private static final long SeralVersionUID = 6L;

        public ServiceException(Exception e) {
            super(e);
        }
}
