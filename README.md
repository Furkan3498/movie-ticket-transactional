POSTMAN

POST Example
http://localhost:8080/bookMovieTicket


{
    "ticket":{
        "name": "Furkan",
        "email":"furkanceylan@gmail.com",
        "movieName":"Cars",
        "destination":"İstanbul",
        "movieDate": "05-04-2024",
        "movieTime": "13:00PM",
        "ticketPrize" :  550.0

    },
    "payment":{
        "accountNo":"acc3",
        "cardType": "DEBIT"
    }
}
