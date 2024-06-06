
package pe.edu.upeu.ppp.dao;

import java.util.List;
import pe.edu.upeu.ppp.dto.UsuarioDTO;
import pe.edu.upeu.ppp.entity.Usuario;

/**
 *
 * @author ProfCisco
 */
public interface UsuarioDao {
    public int createUsuario(Usuario user);
    public int updateUsuario(Usuario user);
    public int deleteUsuario(int id);
    public boolean validarUsuario(String username);
    public Usuario readUsuario(int id);
    public List<Usuario> readAll();
    public List<UsuarioDTO> login(String username, String clave);
}
