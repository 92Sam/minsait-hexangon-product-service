package com.minsait.demohexagon.infrastructure.adapters.inbound.apirest;

import com.minsait.demohexagon.application.services.PriceService;
import com.minsait.demohexagon.domain.entity.Price;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.PriceReqDTO;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.dto.PriceResDTO;
import com.minsait.demohexagon.infrastructure.adapters.inbound.apirest.mappers.PriceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/prices")
@RequiredArgsConstructor
public class PriceController {
    final private PriceService priceService;

    @GetMapping
    public List<PriceResDTO> getProduct() throws Throwable {
        return priceService.getAllPrices().stream().map(PriceMapper::toPriceResDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PriceResDTO getProduct(@PathVariable("id") Long id) throws Throwable {
        return PriceMapper.toPriceResDTO(priceService.getPriceById(id));
    }

    @PostMapping
    public PriceResDTO create(@RequestBody(required = true) PriceReqDTO request) throws Throwable {
        return PriceMapper.toPriceResDTO(priceService.savePrice(PriceMapper.toPrice(request)));
    }
}
