package kurdestanproject.services;

import kurdestanproject.domain.SaqezCity;
import org.springframework.stereotype.Service;

@Service
public class SaqezServiceImpl implements SaqezService{
    @Override
    public SaqezCity CalculationOfUnemployedPopulation(SaqezCity saqezCity) {
       saqezCity.setPopulation(saqezCity.getWorkingPopulation()+2545434);
        return saqezCity;
    }
}
