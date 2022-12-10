package kurdestanproject.controller;

import kurdestanproject.domain.SaqezCity;
import kurdestanproject.services.SaqezService;
import kurdestanproject.services.SaqezServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saqez")
public class SaqezController {
@Autowired
    SaqezService saqezService;

//    public SaqezController(SaqezService saqezService) {
//        this.saqezService = saqezService;
//    }

//@Autowired
//    public void setSaqezService(SaqezService saqezService) {
//        this.saqezService = saqezService;
//    }

    @PostMapping("/PopulationCalc")
    public ResponseEntity<SaqezCity> unemployedPopulation(@RequestBody SaqezCity saqezCity){

       saqezService.CalculationOfUnemployedPopulation(saqezCity);
        return ResponseEntity.ok(saqezCity);
    }

}
