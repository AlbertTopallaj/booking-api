package se.booking.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.booking.dto.BookingRequest;
import se.booking.model.Booking;
import se.booking.service.BookingService;

@RestController
@RequestMapping("/bookings")
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;

    @PostMapping("/create-booking")
    public Booking createBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.createBooking(bookingRequest);
    }

}
