package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Deployer class, run to start the server
 */
@SpringBootApplication
public class ServerDeployer {

    public static void main(final String[] args) {
        SpringApplication.run(ServerDeployer.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "Welcome to the group 98 server";
    }
}
