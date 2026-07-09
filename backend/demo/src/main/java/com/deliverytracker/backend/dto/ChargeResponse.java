package com.deliverytracker.backend.dto;

public class ChargeResponse {

    private double volumetricWeight;
    private double billableWeight;

    public ChargeResponse(double volumetricWeight, double billableWeight) {
        this.volumetricWeight = volumetricWeight;
        this.billableWeight = billableWeight;
    }

    public double getVolumetricWeight() {
        return volumetricWeight;
    }

    public double getBillableWeight() {
        return billableWeight;
    }
}