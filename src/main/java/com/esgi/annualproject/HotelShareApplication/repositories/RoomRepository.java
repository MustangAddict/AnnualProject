package com.esgi.annualproject.HotelShareApplication.repositories;

import com.esgi.annualproject.HotelShareApplication.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
