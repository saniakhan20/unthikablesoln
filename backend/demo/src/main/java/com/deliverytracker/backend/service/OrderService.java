package com.deliverytracker.backend.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double calculateVolumetricWeight(double length,
                                            double breadth,
                                            double height) {

        return (length * breadth * height) / 5000.0;
    }

    public double calculateBillableWeight(double actualWeight,
                                          double volumetricWeight) {

        return Math.max(actualWeight, volumetricWeight);
    }
}