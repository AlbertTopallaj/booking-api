package se.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.booking.dto.BookingRequest;
import se.booking.model.Booking;
import se.booking.repository.BookingRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

        return booking;
    }

    public Booking updateBooking(UUID bookingId, BookingRequest request) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow();

        booking.setDate(request.getDate());
        booking.setPersons(request.getPersons());

        bookingRepository.save(booking);

        return booking;
    }

    public void deleteBooking(UUID bookingId){
        bookingRepository.deleteById(bookingId);
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(UUID bookingId){
        return bookingRepository.findById(bookingId);
    }
}
