package br.com.alura.housebudgetcontrol.dto;

import br.com.alura.housebudgetcontrol.entity.Expenses;
import br.com.alura.housebudgetcontrol.entity.Income;
import br.com.alura.housebudgetcontrol.repository.ExpensesRepository;
import br.com.alura.housebudgetcontrol.repository.IncomeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IncomeDTO {

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    private Double amount;

    @NotNull
    private LocalDate date;

    public IncomeDTO(Income income) {
        this.description = income.getDescription();
        this.amount = income.getAmount();
        this.date = income.getDate();
    }

    public static List<IncomeDTO> convertList (List<Income> income) {
        return income.stream().map(IncomeDTO::new).collect(Collectors.toList());
    }

    public Income convert() {
        return new Income(description, amount, date);
    }

    public Income update (Long id, IncomeRepository incomeRepository) {
        Income income = incomeRepository.findById(id).get();
        income.setDescription(this.description);
        income.setAmount(this.amount);
        income.setDate(this.date);

        return income;
    }
}
