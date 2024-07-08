package com.beneditocunha.emailserver.repositories;

import com.beneditocunha.emailserver.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
