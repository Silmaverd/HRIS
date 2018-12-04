package pl.umcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AbsencesApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(AbsencesApplication.class, args);
    }
}
