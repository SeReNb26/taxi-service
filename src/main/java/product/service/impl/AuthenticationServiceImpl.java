package product.service.impl;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import product.exception.AuthenticationException;
import product.lib.Inject;
import product.lib.Service;
import product.model.Driver;
import product.service.AuthenticationService;
import product.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.debug("Method login was called...");
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            logger.error("Can't login!");
            throw new AuthenticationException("Login or password was incorrect!");
        }
        logger.info("Login is successful!");
        return driver.get();
    }
}
