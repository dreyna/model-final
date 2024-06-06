
package pe.edu.upeu.ppp.dao;

import java.util.List;
import pe.edu.upeu.ppp.dto.UsuarioDTO;

/**
 *
 * @author ProfCisco
 */
public interface UsuarioDao {
    public List<UsuarioDTO> login(String username, String clave);
}
