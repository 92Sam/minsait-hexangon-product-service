package com.minsait.demohexagon.domain.exception;

public class PriceNotFoundException extends RecordNotFoundException {
    public PriceNotFoundException(Long id) {
        super("Price not found: " + id);
    }
}
