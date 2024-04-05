package com.movie.booking.dto;

import com.movie.booking.entity.Payment;
import com.movie.booking.entity.Ticket;

public class MovieTicketRequest {
    private Ticket ticket;
    private Payment payment;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "MovieTicketRequest{" +
                "ticket=" + ticket +
                ", payment=" + payment +
                '}';
    }
}
