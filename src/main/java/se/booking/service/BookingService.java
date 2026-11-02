package se.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.booking.dto.BookingRequest;
import se.booking.model.Booking;
import se.booking.repository.BookingRepository;

@Service
@AllArgsConstructor
public class BookingService {

    private BookingRepository bookingRepository;

    public Booking createBooking(BookingRequest request) {
        Booking booking = new Booking();
        booking.setEmail(request.getEmail());
        booking.setDate(request.getDate());
        booking.setPersons(request.getPersons());

        bookingRepository.save(booking);
    }
}
