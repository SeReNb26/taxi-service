package product.service.impl;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import product.dao.CarDao;
import product.lib.Inject;
import product.lib.Service;
import product.model.Car;
import product.model.Driver;
import product.service.CarService;

@Service
public class CarServiceImpl implements CarService {
    private static final Logger logger = LogManager.getLogger(CarServiceImpl.class);
    @Inject
    private CarDao carDao;

    @Override
    public void addDriverToCar(Driver driver, Car car) {
        car.getDrivers().add(driver);
        carDao.update(car);
    }

    @Override
    public void removeDriverFromCar(Driver driver, Car car) {
        car.getDrivers().remove(driver);
        carDao.update(car);
    }

    @Override
    public List<Car> getAllByDriver(Long driverId) {
        return carDao.getAllByDriver(driverId);
    }

    @Override
    public Car create(Car car) {
        logger.debug("The \"create\" method was called for the car");
        return carDao.create(car);
    }

    @Override
    public Car get(Long id) {
        logger.debug("The \"get\" method was called for the car by id: " + id);
        return carDao.get(id).get();
    }

    @Override
    public List<Car> getAll() {
        logger.debug("The \"getAll\" method was called for the car");
        return carDao.getAll();
    }

    @Override
    public Car update(Car car) {
        logger.debug("The \"update\" method was called for the car");
        return carDao.update(car);
    }

    @Override
    public boolean delete(Long id) {
        logger.debug("The \"delete\" method was called for the car by id: " + id);
        return carDao.delete(id);
    }
}
