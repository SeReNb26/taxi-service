package product.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import product.dao.ManufacturerDao;
import product.lib.Inject;
import product.lib.Service;
import product.model.Manufacturer;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    private static final Logger logger = LogManager.getLogger(ManufacturerServiceImpl.class);
    @Inject
    private ManufacturerDao manufacturerDao;

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        logger.debug("The \"create\" method was called for the manufacturer");
        return manufacturerDao.create(manufacturer);
    }

    @Override
    public Manufacturer get(Long id) {
        logger.debug("The \"get\" method was called for the manufacturer by id: " + id);
        return manufacturerDao.get(id).get();
    }

    @Override
    public List<Manufacturer> getAll() {
        logger.debug("The \"getAll\" method was called for the manufacturer");
        return manufacturerDao.getAll();
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        logger.debug("The \"update\" method was called for the manufacturer");
        return manufacturerDao.update(manufacturer);
    }

    @Override
    public boolean delete(Long id) {
        logger.debug("The \"delete\" method was called for the manufacturer by id: " + id);
        return manufacturerDao.delete(id);
    }
}
