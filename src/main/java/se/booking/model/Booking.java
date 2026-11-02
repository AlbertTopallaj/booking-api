package se.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import se.booking.util.Status;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "bookings")
@Entity
@Getter
@Setter
public class Booking {

    // ID for booking
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String email;

    private LocalDateTime date;

    private int persons;

    private Status bookingStatus;

}
