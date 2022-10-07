package com.wsousa.notification.repository;

import com.wsousa.notification.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
