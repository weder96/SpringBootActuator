package com.wsousa.notification.config;

import com.wsousa.notification.domain.Usuario;
import com.wsousa.notification.service.SegurancaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.OffsetDateTime;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware", dateTimeProviderRef = "auditingDateTimeProvider")
public class JpaAuditoriaConfig {
	
	private final SegurancaService segurancaService;

	public JpaAuditoriaConfig(SegurancaService segurancaService) {
		this.segurancaService = segurancaService;
	}

	@Bean
	public DateTimeProvider auditingDateTimeProvider() {
		return () -> Optional.of(OffsetDateTime.now());
	}
	
	@Bean
	public AuditorAware<Usuario> auditorAware() {
		return segurancaService::getUsuario;
	}
	
}