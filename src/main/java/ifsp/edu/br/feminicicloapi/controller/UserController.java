package ifsp.edu.br.feminicicloapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.model.Vitima;
import ifsp.edu.br.feminicicloapi.repository.VitimaRepository;
import ifsp.edu.br.feminicicloapi.security.jwt.JwtUtils;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    VitimaRepository vitimaRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody Vitima usuarioNovo){
        // Se encontrar no banco, não poderá criar um novo usuário
        boolean exists = vitimaRepository.findByEmail(usuarioNovo.getEmail()).stream().count() > 0;
        // Mas não existir, cra o novo usuário no banco
        if(!exists){
            //criptografa a senha do usuário para por no banco de dados
            usuarioNovo.setSenha(
                passwordEncoder.encode(usuarioNovo.getSenha())
            );
            vitimaRepository.save(usuarioNovo);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).build();    
    }

    @GetMapping("/user")
    public List<Vitima> getAllUsers(){
        return (List<Vitima>)vitimaRepository.findAll();
    }
    
    @GetMapping("/user/me")
    public Vitima getMyInformations(@RequestHeader("Authorization") String token){
        // String token = headers.firstValue("Authorization").get();
        System.out.println(token);
        token = token.substring(7, token.length());
        String username = jwtUtils.getUserNameFromJwtToken(token);
        return vitimaRepository.findByEmail(username).get(0);
    }
}
