package pe.edu.i202220496.ef_poma_nicolas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.i202220496.ef_poma_nicolas.dto.CarDto;
import pe.edu.i202220496.ef_poma_nicolas.service.ManageService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class ManageController {

    @Autowired
    private ManageService manageService;

    @GetMapping("/start")
    public String start(Model model) {

        try {
            List<CarDto> cars = manageService.getAllCars();
            model.addAttribute("cars", cars);
            model.addAttribute("error", null);

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Ocurrió un error al obtener los datos");
        }

        return "manage";
    }
}


