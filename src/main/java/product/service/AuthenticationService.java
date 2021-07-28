package product.service;

import product.exception.AuthenticationException;
import product.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
