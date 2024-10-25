package ef.sw.sanca.concesionaria.sanca_microservicio_ventas.repository;

import ef.sw.sanca.concesionaria.sanca_microservicio_ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, String> {
}
