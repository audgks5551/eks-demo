package io.mhan.springk8sdemo.base;

import io.mhan.springk8sdemo.users.entity.User;
import io.mhan.springk8sdemo.users.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData {

    @Bean
    public ApplicationRunner testData(UserRepository userRepository) {
        return args -> {
            User user1 = User.builder()
                    .username("user1")
                    .password("pass")
                    .build();
            userRepository.save(user1);
        };
    }
}
