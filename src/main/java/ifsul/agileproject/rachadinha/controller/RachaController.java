package ifsul.agileproject.rachadinha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsul.agileproject.rachadinha.domain.dto.RachaRegisterDTO;
import ifsul.agileproject.rachadinha.domain.entity.Racha;
import ifsul.agileproject.rachadinha.service.impl.RachaServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/racha")
@AllArgsConstructor
public class RachaController {
    
    private final RachaServiceImpl rachaService;

    //Criar racha
    @PostMapping("/criar")
    public ResponseEntity<Racha> createRacha(@RequestBody RachaRegisterDTO rachaDTO) {
        Racha racha = rachaService.saveRacha(rachaDTO);
        return new ResponseEntity<>(racha, HttpStatus.CREATED);
    }

}
