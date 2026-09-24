package br.com.microservices.orchestrated.paymentservice.core.repository;

import br.com.microservices.orchestrated.paymentservice.core.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionalId);

    Optional<Payment> findByOrderIdAndTransactionId(String orderId, String transactionalId);
}
