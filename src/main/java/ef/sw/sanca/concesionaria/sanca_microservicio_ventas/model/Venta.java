package ef.sw.sanca.concesionaria.sanca_microservicio_ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venta {
    @Id
    private String id;
    private String clienteId;
    private String vehiculoId;
    private double monto;
    private String fecha;
}