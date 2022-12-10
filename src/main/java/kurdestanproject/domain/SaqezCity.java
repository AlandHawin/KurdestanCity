package kurdestanproject.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaqezCity {

    int historyOfEstablishment;

    Long population;

    String OldName;

    int NumberOfDams;

    String Religion;

    Long WorkingPopulation;

    public SaqezCity(int historyOfEstablishment, Long population, String oldName, int numberOfDams, String religion, Long workingPopulation) {
        this.historyOfEstablishment = historyOfEstablishment;
        this.population = population;
        OldName = oldName;
        NumberOfDams = numberOfDams;
        Religion = religion;
        WorkingPopulation = workingPopulation;
    }

    @Override
    public String toString() {
        return "SaqezCity{" +
                "historyOfEstablishment=" + historyOfEstablishment +
                ", population=" + population +
                ", OldName='" + OldName + '\'' +
                ", NumberOfDams=" + NumberOfDams +
                ", Religion='" + Religion + '\'' +
                ", WorkingPopulation=" + WorkingPopulation +
                '}';
    }
}
