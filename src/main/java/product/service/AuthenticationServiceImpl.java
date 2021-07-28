package product.service;

import java.util.Optional;
import product.exception.AuthenticationException;
import product.lib.Inject;
import product.lib.Injector;
import product.lib.Service;
import product.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            throw new AuthenticationException("Login or password was incorrect!");
        }
        return driver.get();
    }
}
