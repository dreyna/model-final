
package pe.edu.upeu.ppp.daoImpl;

import pe.edu.upeu.ppp.dao.UsuarioDao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.ppp.config.Conexion;
/**
 *
 * @author ProfCisco
 */
public class UsuarioaDaoImpl implements UsuarioDao{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public List<Map<String, Object>> login(String username, String clave) {
        List<Map<String, Object>> lista = new ArrayList<>();
        String SQL = "select u.username, u.sexo, r.nombre from usuario as u " +
                     "inner join usuario_rol as ur on u.idusuario=ur.idusuario " +
                     "inner join rol as r on ur.idrol = r.idrol " +
                     "where u.username=? and u.clave=?";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while(rs.next()){
                Map<String, Object> map =new HashMap<>();
                map.put("user", rs.getString("username"));
                map.put("sexo", rs.getString("sexo"));
                map.put("rol", rs.getString("nombre"));
                lista.add(map);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        
        
        return lista;
    }
    
}
