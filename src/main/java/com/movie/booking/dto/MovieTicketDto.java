package com.movie.booking.dto;

import com.movie.booking.entity.Ticket;

public class MovieTicketDto {
    private String status;
    private double totalFare;
    private String prnNo;
    private Ticket ticket;

    public MovieTicketDto() {

    }

    public MovieTicketDto(String status, double totalFare, String prnNo, Ticket ticket) {
        this.status = status;
        this.totalFare = totalFare;
        this.prnNo = prnNo;
        this.ticket = ticket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public String getPrnNo() {
        return prnNo;
    }

    public void setPrnNo(String prnNo) {
        this.prnNo = prnNo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "MovieTicketDto{" +
                "status='" + status + '\'' +
                ", totalFare=" + totalFare +
                ", prnNo='" + prnNo + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
