
package pe.edu.upeu.ppp.daoImpl;

import pe.edu.upeu.ppp.dao.UsuarioDao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.ppp.config.Conexion;
import pe.edu.upeu.ppp.dto.UsuarioDTO;
import pe.edu.upeu.ppp.entity.Usuario;
/**
 *
 * @author ProfCisco
 */
public class UsuarioaDaoImpl implements UsuarioDao{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx= null;
    @Override
    public List<UsuarioDTO> login(String username, String clave) {
        List<UsuarioDTO> lista = new ArrayList<>();
        String SQL = "select u.idusuario, u.username, u.sexo, r.nombre as rol from usuario as u " +
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
                UsuarioDTO user =new UsuarioDTO();
                user.setIdusuario(rs.getInt("idusuario"));
                user.setUsername(rs.getString("username"));
                user.setSexo(rs.getString("sexo"));
                user.setRol(rs.getString("rol"));
                lista.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        
        
        return lista;
    }

    @Override
    public int createUsuario(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int updateUsuario(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validarUsuario(String username) {
        boolean existe = false;
        String SQL = "select *from usuario where username=?";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                existe = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        
        
        return existe;
    }

    @Override
    public Usuario readUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
