
package pe.edu.upeu.ppp.dto;

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
public class UsuarioDTO {
    private int idusuario;
    private String username;
    private String sexo;
    private String rol;
}
