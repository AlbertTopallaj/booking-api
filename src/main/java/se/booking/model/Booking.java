package se.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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

    private int persons;



}
