package com.trainibit.tzdriver_drivers.controller;

import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import com.trainibit.tzdriver_drivers.service.StateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/drivers")
@Validated
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public ResponseEntity< List<StateResponse> > getStates(){
        return ResponseEntity.ok(stateService.findAll());
    }

    // Crear o subir usuario
    @PostMapping
    public ResponseEntity<StateResponse> postState(@Valid @RequestBody StateRequest usuarioRequest) {

        return ResponseEntity.ok( stateService.postState(usuarioRequest) );
    }

    @GetMapping("/{uuid}")
    public StateResponse getStateById(@PathVariable UUID uuid){
        return stateService.findById(uuid);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<StateResponse> deleteStateById(@PathVariable UUID uuid){
        return ResponseEntity.ok(stateService.deleteById(uuid));
    }

    // Update o actualiza
    @PutMapping("/{uuid}")
    public ResponseEntity< StateResponse > putState(@PathVariable UUID uuid, @RequestBody StateRequest usuarioRequest){
        return ResponseEntity.ok(stateService.putById(uuid, usuarioRequest));
    }

}
