package com.sda.saleboard.controller;

import com.sda.saleboard.model.dto.chart.TotalByDateDto;
import com.sda.saleboard.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/chart")
public class ChartController {

    private ChartService chartService;

    @Autowired
    public ChartController(ChartService chartService) {
        this.chartService = chartService;
    }

    @GetMapping("/totalByDay")
    public ResponseEntity<List<TotalByDateDto>> getTotalByDate() {
        return ResponseEntity.ok(chartService.getTotalByDate());
    }
}
