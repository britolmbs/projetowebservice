package com.britolmbs.projetowebservice.config;

import com.britolmbs.projetowebservice.entities.Order;
import com.britolmbs.projetowebservice.entities.User;
import com.britolmbs.projetowebservice.entities.enums.OrderStatus;
import com.britolmbs.projetowebservice.repositories.OrderRepository;
import com.britolmbs.projetowebservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
      User u1 = new User(null,"Lucas Brito", "lucas@gmail.com", "973052650", "123456");
      User u2 = new User(null, "Nathalia Valle", "nathalia@gmail.com", "9999999", "1234567");

        Order o1 = new Order(null, Instant.parse("2023-01-03T14:36:00Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2023-02-27T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);

      userRepository.saveAll(Arrays.asList(u1,u2));
      orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
