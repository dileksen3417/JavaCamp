package core.concretes;

import core.abstracts.LoggerService;
import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
