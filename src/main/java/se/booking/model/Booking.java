package se.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.UUID;

@Entity
public class Booking {

    // ID for booking
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


}
