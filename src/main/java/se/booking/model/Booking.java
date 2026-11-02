package se.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Table(name = "bookings")
@Entity
@Getter
public class Booking {

    // ID for booking
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


}
