package dio.web.api.repository;


import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");
        
        if (usuario.getId()==null)
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        else
            System.out.println("Update - Recebendo o usuario na camada de repositorio");


        System.out.println(usuario);
    }

    public void deletebById(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuario",id));
        System.out.println(id);
    }

    public List<Usuario>findAll(){
        System.out.println("LIST - listando os usuario do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("felipe", "123456"));
        usuarios.add(new Usuario("danielle", "123456"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("Find/id - Recebendo o id: %d para localizar um usuario",id ));
        return new Usuario("felipe","123456");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("felipe","123456");
    }

}
