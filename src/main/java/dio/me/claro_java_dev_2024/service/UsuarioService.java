package dio.me.claro_java_dev_2024.service;

import dio.me.claro_java_dev_2024.domain.model.Usuario;

public interface UsuarioService {

    Usuario findById (Long id);

    Usuario create (Usuario usuario);


}
