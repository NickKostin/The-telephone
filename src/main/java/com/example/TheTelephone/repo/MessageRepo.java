package com.example.TheTelephone.repo;

import com.example.BrokenPhone.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
