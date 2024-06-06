
package pe.edu.upeu.ppp.dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ProfCisco
 */
public interface UsuarioDao {
    public List<Map<String, Object>> login(String username, String clave);
}
