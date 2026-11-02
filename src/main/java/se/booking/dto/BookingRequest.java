package se.booking.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class BookingRequest {
    private String email;
    private LocalDateTime date;

}
