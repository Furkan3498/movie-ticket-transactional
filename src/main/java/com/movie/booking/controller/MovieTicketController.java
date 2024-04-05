package com.movie.booking.controller;


import com.movie.booking.dto.MovieTicketDto;
import com.movie.booking.dto.MovieTicketRequest;
import com.movie.booking.service.MovieTicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MovieTicketController {

    private final MovieTicketService movieTicketService;

    public MovieTicketController(MovieTicketService movieTicketService) {
        this.movieTicketService = movieTicketService;
    }

    @PostMapping("/bookMovieTicket")
    public ResponseEntity<MovieTicketDto> createBooktTicket(@RequestBody MovieTicketRequest movieTicketRequest){
        return ResponseEntity.ok(movieTicketService.createbookticket(movieTicketRequest));
    }
    @GetMapping("/getAllTickets")
    public ResponseEntity<List<MovieTicketDto>> getAllTickets(){

        return ResponseEntity.ok(movieTicketService.getAllTickets());
    }
}
