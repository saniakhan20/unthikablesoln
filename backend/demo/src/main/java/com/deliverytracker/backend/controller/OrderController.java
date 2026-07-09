package com.deliverytracker.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytracker.backend.dto.ChargeRequest;
import com.deliverytracker.backend.dto.ChargeResponse;
import com.deliverytracker.backend.service.OrderService;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/calculate")
    public ChargeResponse calculateCharge(@RequestBody ChargeRequest request) {

        double volumetricWeight = orderService.calculateVolumetricWeight(
                request.getLength(),
                request.getBreadth(),
                request.getHeight());

        double billableWeight = orderService.calculateBillableWeight(
                request.getActualWeight(),
                volumetricWeight);

        return new ChargeResponse(volumetricWeight, billableWeight);
    }
}