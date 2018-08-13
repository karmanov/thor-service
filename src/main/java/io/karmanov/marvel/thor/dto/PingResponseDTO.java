package io.karmanov.marvel.thor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PingResponseDTO {

    private String message;
    private DateTime timestamp;


    public static void main(String[] args) {
        Boolean b = null;
        if(b) {
            System.out.println("b");
        } else {
            System.out.println("not b");
        }

    }

}

