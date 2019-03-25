package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Deployer class, run to start the server
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)
public class ServerDeployer {

    public static void main(final String[] args) {
        SpringApplication.run(ServerDeployer.class, args);
    }

    @RequestMapping("/")
    String indexText() {
        return "Welcome to the group 98 server";
    }

    @RequestMapping("/login")
    String loginText() {
        return "Welcome to the group 98 server";
    }
}
