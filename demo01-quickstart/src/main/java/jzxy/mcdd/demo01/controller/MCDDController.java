package jzxy.mcdd.demo01.controller;

import jzxy.mcdd.demo01.entity.MCDDSeries;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


/**
 * MCDDController
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/9/6 20:27
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/mcdds")
public class MCDDController {

    private final MCDDSeries mcddSeries;

    @GetMapping
    public MCDDSeries list() {
        return Optional.ofNullable(mcddSeries).orElse(new MCDDSeries());
    }

}
