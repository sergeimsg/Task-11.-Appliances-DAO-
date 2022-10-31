package by.itacademy.hometask.appliance.dao;

public class DAOException extends Exception{

private static final long serialVersionUID = -7821200229258601275L;

    public DAOException() {

        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(Exception e) {
        super(e);
    }
    public DAOException(String message, Exception e) {

        super(message,e);
    }
}
