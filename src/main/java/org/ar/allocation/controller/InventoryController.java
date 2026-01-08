package org.ar.allocation.controller;

import org.ar.allocation.response.InventoryResponse;
import org.ar.allocation.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    public List<InventoryResponse> getAllSeats() {
        return inventoryService.getAllBookings();
    }
}
