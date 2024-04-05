package com.movie.booking.service;

import com.movie.booking.dto.MovieTicketDto;
import com.movie.booking.dto.MovieTicketRequest;
import com.movie.booking.entity.Payment;
import com.movie.booking.entity.Ticket;
import com.movie.booking.repository.PaymentRepository;
import com.movie.booking.repository.TicketRepository;
import com.movie.booking.utility.ValidatePayment;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MovieTicketService {

    private final PaymentRepository paymentRepository;
    private final TicketRepository ticketRepository;


    public MovieTicketService(PaymentRepository paymentRepository, TicketRepository ticketRepository) {
        this.paymentRepository = paymentRepository;
        this.ticketRepository = ticketRepository;
    }

    @Transactional
    public MovieTicketDto createbookticket(MovieTicketRequest movieTicketRequest) {

        Ticket ticket = movieTicketRequest.getTicket();
        ticket =ticketRepository.save(ticket);

        Payment payment = movieTicketRequest.getPayment();
        payment= paymentRepository.save(payment);
        ValidatePayment.validationCreditLimit(payment.getAccountNo(),ticket.getTicketPrize());

        payment.setTicketId(ticket.getId());
        payment.setAmount(ticket.getTicketPrize());
        paymentRepository.save(payment);

       return new MovieTicketDto("SUCCESS",ticket.getTicketPrize(),UUID.randomUUID().toString().split("-")[0],ticket);

    }


    public List<MovieTicketDto> getAllTickets() {

        List<Ticket> ticketList = ticketRepository.findAll();
        List<MovieTicketDto> movieTicketDtos = new ArrayList<>();

        for (Ticket ticket :ticketList){
            MovieTicketDto movieTicketDto = new MovieTicketDto();
            movieTicketDto.setStatus("SUCCESS");
            movieTicketDto.setTotalFare(ticket.getTicketPrize());
            movieTicketDto.setPrnNo(UUID.randomUUID().toString().split("-")[0]);
            movieTicketDto.setTicket(ticket);
             movieTicketDtos.add(movieTicketDto);
        }
            return movieTicketDtos;
    }
}
