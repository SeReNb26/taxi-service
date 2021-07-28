package product.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import product.dao.DriverDao;
import product.lib.Inject;
import product.lib.Service;
import product.model.Driver;

@Service
public class DriverServiceImpl implements DriverService {
    private static final Logger logger = LogManager.getLogger(DriverServiceImpl.class);
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver create(Driver driver) {
        logger.debug("The \"create\" method was called for the driver");
        return driverDao.create(driver);
    }

    @Override
    public Driver get(Long id) {
        logger.debug("The \"get\" method was called for the driver by id: " + id);
        return driverDao.get(id).get();
    }

    @Override
    public List<Driver> getAll() {
        logger.debug("The \"getAll\" method was called for the driver");
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        logger.debug("The \"update\" method was called for the driver");
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        logger.debug("The \"delete\" method was called for the driver by id: " + id);
        return driverDao.delete(id);
    }

    @Override
    public Optional<Driver> findByLogin(String login) {
        logger.debug("The \"findByLogin\" method was called for the driver");
        return driverDao.findByLogin(login);
    }
}
