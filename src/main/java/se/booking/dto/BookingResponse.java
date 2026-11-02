package se.booking.dto;

import lombok.Getter;
import lombok.Setter;
import se.booking.util.Status;

import java.time.LocalDateTime;

@Getter
@Setter
public class BookingResponse {
    private String UUID;

    private String email;

    private LocalDateTime date;

    private int persons;

    private Status bookingStatus;

}
