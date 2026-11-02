package se.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.booking.dto.BookingRequest;
import se.booking.model.Booking;

@Service
@AllArgsConstructor
public class BookingService {

    public Booking createBooking(BookingRequest request) {
        Booking booking = new Booking();
    }
}
