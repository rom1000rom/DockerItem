package com.rom1000rom;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Класс представляет собой java-конфигурацию Spring Context а также точку входа
 * в Spring Boot приложение
 * @author Артемьев Р.А.
 * @version 13.11.2020
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
