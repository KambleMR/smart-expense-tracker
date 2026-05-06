package com.mukesh.Expence.Tracker.App;

import java.awt.Desktop;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerApplication {
   public static void main(String[] args) {
       SpringApplication.run(ExpenseTrackerApplication.class, args);
       
       openHomePage();
       
   }
  

private static void openHomePage() {
    try {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI("http://localhost:8080"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

