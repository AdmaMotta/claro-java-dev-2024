package dio.me.claro_java_dev_2024.domain.repository;

import dio.me.claro_java_dev_2024.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceUsuario extends JpaRepository<Usuario, Long> {}
