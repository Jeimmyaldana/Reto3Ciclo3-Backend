/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mintic.sergio.reto3ciclo3.Interface;

import mintic.sergio.reto3ciclo3.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface ReservationInterface extends CrudRepository <Reservation, Integer> {
    
}
