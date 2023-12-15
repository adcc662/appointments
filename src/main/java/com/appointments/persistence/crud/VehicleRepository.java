package com.appointments.persistence.crud;

import com.appointments.persistence.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    Optional<Vehicle> findById(Integer id);

    Optional<List<Vehicle>> findByCustomerId(Integer customerId);
}
