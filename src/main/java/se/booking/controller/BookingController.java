package se.booking.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import se.booking.dto.BookingRequest;
import se.booking.model.Booking;
import se.booking.service.BookingService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bookings")
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;

    @PostMapping("/create-booking")
    public Booking createBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.createBooking(bookingRequest);
    }

    @PatchMapping("/update/{bookingId}")
    public Booking updateBooking(@RequestBody BookingRequest bookingRequest, @PathVariable UUID bookingId) {
        return bookingService.updateBooking(bookingId, bookingRequest);
    }

    @DeleteMapping("/delete/{bookingId}")
    public void deleteBooking(@PathVariable UUID bookingId){
        bookingService.deleteBooking(bookingId);
    }

    @GetMapping("/get")
    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }

}
