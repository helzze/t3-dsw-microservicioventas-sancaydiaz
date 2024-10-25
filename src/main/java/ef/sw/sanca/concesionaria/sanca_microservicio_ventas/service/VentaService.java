package ef.sw.sanca.concesionaria.sanca_microservicio_ventas.service;

import ef.sw.sanca.concesionaria.sanca_microservicio_ventas.model.Venta;
import ef.sw.sanca.concesionaria.sanca_microservicio_ventas.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }
}