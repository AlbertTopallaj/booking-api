package se.booking.model;

import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Email for booking
    private String email;

    // Date for booking
    private LocalDateTime date;

    // The amount of persons that are in a booking
    private int persons;

    // The booking status
    // Can be PENDING, COMPLETED OR CANCELLED
    private Status bookingStatus;
}
