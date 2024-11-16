package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;


    @PostMapping()
    public void postUser(@RequestBody User user){
        repository.save(user);

    }

     @GetMapping()
    public List<User> getUser(){
        return  repository.findAll();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    //@DeleteMapping("{id}")
   // public void deleteUser(@PathVariable("id")Integer id){
    //    repository.deletebById(id);
   // }


   @PutMapping()
    public void putUser(@RequestBody User user){
        repository.save(user);
}


}
