package ifsp.edu.br.feminicicloapi.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ifsp.edu.br.feminicicloapi.model.Vitima;
import ifsp.edu.br.feminicicloapi.repository.VitimaRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    VitimaRepository vitimaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Encontra um usuário no banco de dados
        Vitima vitima = vitimaRepository.findByEmail(username).stream().findFirst().get();
        // Depois retorna um objeto UserDetailsImpl com base no usuário encontrado
        return new UserDetailsImpl(vitima);        
    } 
}
