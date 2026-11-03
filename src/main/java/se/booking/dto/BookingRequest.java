package se.booking.dto;

import lombok.Getter;
import lombok.Setter;
import se.booking.util.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class BookingRequest {
    private String email;
    private LocalDateTime date;
    private int persons;
    private Status status;
}
