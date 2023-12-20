package be.ehb.petshopboys.config;

import be.ehb.petshopboys.model.User;
import be.ehb.petshopboys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    private void loadUserData() {
        User user1 = new User();
        user1.setEmail("admin@petshopboys.be");
        user1.setPassword("123456789");
        userRepository.save(user1);

        User user2 = new User();
        user2.setEmail("jan.vermeerbergen@student.ehb.be");
        user2.setPassword("123456789");
        userRepository.save(user2);
    }

}
