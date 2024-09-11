package dio.me.claro_java_dev_2024.service.impl;

import dio.me.claro_java_dev_2024.domain.model.Usuario;
import dio.me.claro_java_dev_2024.repository.UsuarioRepository;
import dio.me.claro_java_dev_2024.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuario) {
        if (usuarioRepository.existsAccountByCpf(usuario.getCpf())) {
            throw new IllegalArgumentException("This user already exists.");
        }
        return usuarioRepository.save(usuario);
    }
}
