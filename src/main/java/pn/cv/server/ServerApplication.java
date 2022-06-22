package pn.cv.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import pn.cv.server.enumeration.Status;
import pn.cv.server.model.Server;
import pn.cv.server.repository.ServerRepository;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})

public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);

/*
}
 CommandLineRunner run(ServerRepository serverRepository) {
     return args -> {
         serverRepository.save(new Server(33, "192.168.1.160", "Ubuntu linux", "16GB", "Personal_PC",
                 "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
     };
 }
 */
    }
    }