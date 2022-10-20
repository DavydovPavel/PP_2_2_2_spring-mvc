package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("car", carService.index(count));
        return "cars";
    }
}
