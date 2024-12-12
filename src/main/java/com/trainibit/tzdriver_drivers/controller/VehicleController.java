package com.trainibit.tzdriver_drivers.controller;

import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.request.VehicleRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import com.trainibit.tzdriver_drivers.response.VehicleResponse;
import com.trainibit.tzdriver_drivers.service.DriverService;
import com.trainibit.tzdriver_drivers.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<VehicleResponse>> getVehicles(){
        return ResponseEntity.ok(vehicleService.findAll());
    }

    @PostMapping
    public ResponseEntity<VehicleResponse> postVehicle(@Valid @RequestBody VehicleRequest vehicleRequest) {
        return ResponseEntity.ok( vehicleService.postVehicle(vehicleRequest) );
    }

    @GetMapping("/{uuid}")
    public VehicleResponse getVehicleById(@PathVariable UUID uuid){
        return vehicleService.findById(uuid);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity< VehicleResponse > putDriver(@PathVariable UUID uuid, @RequestBody VehicleRequest vehicleRequest){
        return ResponseEntity.ok(vehicleService.putById(uuid, vehicleRequest));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<VehicleResponse> deleteDriverById(@PathVariable UUID uuid){
        return ResponseEntity.ok(vehicleService.deleteById(uuid));
    }
}
