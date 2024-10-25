package ef.sw.sanca.concesionaria.sanca_microservicio_ventas.controller;

import ef.sw.sanca.concesionaria.sanca_microservicio_ventas.model.Venta;
import ef.sw.sanca.concesionaria.sanca_microservicio_ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping
    public Venta registrarVenta(@RequestBody Venta venta) {
        return ventaService.registrarVenta(venta);
    }

    @GetMapping
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }
}