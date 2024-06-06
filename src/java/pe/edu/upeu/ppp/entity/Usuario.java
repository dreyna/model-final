
package pe.edu.upeu.ppp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author alum.l8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int idusuario;
    private String username;
    private String clave;
    private int estado;
    private String sexo;
}
