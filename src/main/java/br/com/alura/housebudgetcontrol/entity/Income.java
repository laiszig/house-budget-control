package br.com.alura.housebudgetcontrol.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Income {

    @Id
    public String IncomeID;
    public String IncomeDescription;
    public String IncomeAmount;
    public String IncomeDate;
}
