package se.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "bookings")
@Entity
public class Booking {

    // ID for booking
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


}
