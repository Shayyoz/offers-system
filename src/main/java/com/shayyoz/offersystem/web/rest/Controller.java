package com.shayyoz.offersystem.web.rest;

import com.shayyoz.offersystem.model.domain.FlowType;
import com.shayyoz.offersystem.model.dto.StartRequest;
import com.shayyoz.offersystem.model.dto.StartResponse;
import com.shayyoz.offersystem.service.StartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {
    private final StartService startService;


    @PostMapping(value = "/Start/{flowType}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StartResponse> onStart(@PathVariable String flowType, @RequestBody StartRequest request){
        return  ResponseEntity.ok(startService.start(FlowType.fromValue(flowType),request));
    }

//    @PostMapping(value = "/{creditOfferId}/Calc", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<CalcResponse> onCalc(@PathVariable String creditOfferId){
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(calcService.)
////        return  ResponseEntity.ok(observerService.getExample());
//    }
//
//    @PostMapping(value = "/{creditOfferId}/Approve", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> onApprove(@PathVariable String creditOfferId){
//        return  ResponseEntity.ok(observerService.getExample());
//    }
//
//    @PostMapping(value = "/{creditOfferId}/Submit", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> onSubmit(@PathVariable String creditOfferId){
//        return  ResponseEntity.ok(observerService.getExample());
//    }
}
