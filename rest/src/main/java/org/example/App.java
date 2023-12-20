package org.example;

import comm.PersonRepository;
import comm.TreasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@AutoConfigurationPackage(basePackages="comm")
@SpringBootApplication
public class App 
{
//    @Autowired
    PersonRepository personRepository;
//    @Autowired
    TreasureRepository treasureRepository;
    public App(PersonRepository personRepository, TreasureRepository treasureRepository) {
        personRepository = this.personRepository;
        treasureRepository = this.treasureRepository;
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
