package com.sena.helpdesk.repository;

import com.sena.helpdesk.model.EstadoTicket;
import com.sena.helpdesk.model.Ticket;
import com.sena.helpdesk.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // Tickets creados por un usuario 
    List<Ticket> findByCreadoPor(Usuario creadoPor);

    // Tickets vencidos
    List<Ticket> findByEstadoNotAndSlaVenceEnBefore(EstadoTicket estado, LocalDateTime ahora);
}
