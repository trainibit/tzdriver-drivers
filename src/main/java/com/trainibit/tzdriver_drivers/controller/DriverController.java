package com.trainibit.tzdriver_drivers.controller;

import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import com.trainibit.tzdriver_drivers.service.DriverService;
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

@RestController
@RequestMapping("/drivers")
@Validated
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public ResponseEntity<List<DriverResponse>> getStates(){
        return ResponseEntity.ok(driverService.findAll());
    }

    @PostMapping
    public ResponseEntity<DriverResponse> postState(@Valid @RequestBody DriverRequest driverRequest) {
        System.out.println(driverRequest.toString());
        return ResponseEntity.ok( driverService.postState(driverRequest) );
    }

    @GetMapping("/{uuid}")
    public DriverResponse getStateById(@PathVariable UUID uuid){
        return driverService.findById(uuid);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity< DriverResponse > putState(@PathVariable UUID uuid, @RequestBody DriverRequest driverRequest){
        return ResponseEntity.ok(driverService.putById(uuid, driverRequest));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<DriverResponse> deleteStateById(@PathVariable UUID uuid){
        return ResponseEntity.ok(driverService.deleteById(uuid));
    }

}
