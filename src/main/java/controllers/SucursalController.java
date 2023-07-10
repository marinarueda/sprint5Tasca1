package controllers;

import model.domain.Sucursal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import model.dto.SucursalDTO;
import model.services.SucursalService;

import java.util.List;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {
    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping("/add")
    public String showAddSucursalForm(Model model) {
        model.addAttribute("sucursal", new SucursalDTO(1, "Sucursal norte", "España", "EU"));
        return "add-sucursal-form";
    }

    @PostMapping("/add")
    public String addSucursal(@ModelAttribute("sucursal") SucursalDTO sucursalDTO) {
        // Implementa la lògica per afegir una nova sucursal
        return "redirect:/sucursal/getAll";
    }
    @GetMapping("/update/{id}")
    public String showUpdateSucursalForm(@PathVariable("id") Integer id, Model model) {
        SucursalDTO sucursalDTO = sucursalService.getOne(id);
        model.addAttribute("sucursal", sucursalDTO);
        return "update-sucursal-form";
    }



    @PostMapping("/update/{id}")
    public String updateSucursal(@PathVariable("id") Integer id, @ModelAttribute("sucursal") SucursalDTO sucursalDTO) {
        sucursalDTO.setPk_SucursalID(id);
        sucursalService.updateSucursal(sucursalDTO);
        return "redirect:/sucursal/getAll";
    }

    @GetMapping("/delete/{id}")
    public String deleteSucursal(@PathVariable("id") Integer id) {
        sucursalService.deleteSucursal(id);
        return "redirect:/sucursal/getAll";
    }

    @GetMapping("/getOne/{id}")
    public String getOneSucursal(@PathVariable("id") Integer id, Model model) {
        SucursalDTO sucursalDTO = sucursalService.getOne(id);
        model.addAttribute("sucursal", sucursalDTO);
        return "sucursal-details";
    }

    @GetMapping("/getAll")
    public String getAllSucursals(Model model) {
        List<Sucursal> sucursals = sucursalService.getAllSucursals();
        model.addAttribute("sucursals", sucursals);
        return "getAll";
    }
    // Implementa els altres mètodes per a actualitzar, eliminar i consultar informació
}
