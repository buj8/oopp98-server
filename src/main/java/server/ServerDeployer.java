package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Deployer class, run to start the server
 */
@SpringBootApplication
public class ServerDeployer {

    public static void main(final String[] args) {
        SpringApplication.run(ServerDeployer.class, args);
    }

}


