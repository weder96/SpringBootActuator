package com.wsousa.notification.repository;

import com.wsousa.notification.domain.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

}
