package com.javapractice.utility;

import org.apache.log4j.Logger;

public class RentalCompanyLogger {

    private final static Logger logger = Logger.getLogger(RentalCompanyLogger.class);

    private RentalCompanyLogger() {}

    private static class DbHolder {
        private static final RentalCompanyLogger INSTANCE = new RentalCompanyLogger();
    }

    public static RentalCompanyLogger getInstance()
    {
        return RentalCompanyLogger.DbHolder.INSTANCE;
    }

    public void info(Object obj) {
        logger.info(obj);
    }

    public void warn(Object obj) {
        logger.warn(obj);

    }

    public void error(Object obj) {
        logger.info(obj);
    }

    public void fatal(Object obj) {
        logger.fatal(obj);
    }
}