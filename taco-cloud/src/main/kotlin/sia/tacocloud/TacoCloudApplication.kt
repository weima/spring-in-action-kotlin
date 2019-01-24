package sia.tacocloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


//SpringBootApplication
//combines 3 annotations
//1. @SpringBootConfiguration
//2. @EnableAutoConfiguration
//3. @ComponentScan
@SpringBootApplication
class TacoCloudApplication

fun main(args: Array<String>) {
    runApplication<TacoCloudApplication>(*args)
}

