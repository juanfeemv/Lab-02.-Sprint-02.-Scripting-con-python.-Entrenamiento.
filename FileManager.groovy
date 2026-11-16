import java.util.logging.Logger as JavaLogger
import java.util.logging.Level

class Logger {
    private JavaLogger logger

    Logger() {
        this.logger = JavaLogger.getLogger(Logger.class.name)
        this.logger.setLevel(Level.INFO)
    }

    def log(String message) {
        logger.info(message)
    }
}
