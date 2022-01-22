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
public class Expenses {

    @Id
    public String ExpenseID;

    public String ExpenseDescription;

    public String ExpenseAmount;

    public String ExpenseDate;
}
