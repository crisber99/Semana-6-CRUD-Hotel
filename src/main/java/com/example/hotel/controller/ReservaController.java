package com.example.hotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.model.Reserva;
import com.example.hotel.service.HotelService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Reserva> getAllReserva(){
        return hotelService.getAllReserva();
    }
        
    @GetMapping("/{id}")
    public Optional<Reserva> getReservaById(@PathVariable Long id) {
        return hotelService.getReservaById(id);
    }

    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return hotelService.createReserva(reserva);
    }

    @PutMapping("/{id}")
    public Reserva updateReserva(@PathVariable Long id, @RequestBody Reserva reserva) {
        return hotelService.updateReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteReserva(@PathVariable Long id)
    {
        hotelService.deleteReserva(id);
    }
    
}
