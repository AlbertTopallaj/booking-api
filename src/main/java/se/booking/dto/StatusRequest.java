package se.booking.dto;

import lombok.Getter;
import lombok.Setter;
import se.booking.util.Status;

@Getter
@Setter
public class StatusRequest {
    private Status status;
}
