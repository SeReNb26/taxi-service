package product.controller.driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import product.lib.Injector;
import product.service.CarService;

@WebServlet(urlPatterns = "/drivers/cars")
public class GetMyCurrentCarsController extends HttpServlet {
    private static final String DRIVER_ID = "driver_id";
    private static final Injector injector = Injector.getInstance("product");
    private CarService carService
            = (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        Long driverId = (Long) session.getAttribute(DRIVER_ID);
        req.setAttribute("cars", carService.getAllByDriver(driverId));
        req.getRequestDispatcher("/WEB-INF/views/cars.jsp").forward(req, resp);
    }
}
