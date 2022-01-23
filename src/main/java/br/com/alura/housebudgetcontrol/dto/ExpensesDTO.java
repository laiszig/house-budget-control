package br.com.alura.housebudgetcontrol.dto;


import br.com.alura.housebudgetcontrol.entity.Expenses;
import br.com.alura.housebudgetcontrol.repository.ExpensesRepository;
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
public class ExpensesDTO {

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    private Double amount;

    @NotNull
    private LocalDate date;

    public ExpensesDTO(Expenses expenses) {
        this.description = expenses.getDescription();
        this.amount = expenses.getAmount();
        this.date = expenses.getDate();
    }

    public static List<ExpensesDTO> convertList (List<Expenses> expenses) {
        return expenses.stream().map(ExpensesDTO::new).collect(Collectors.toList());
    }

    public Expenses convert() {
        return new Expenses(description, amount, date);
    }

    public Expenses update (Long id, ExpensesRepository expensesRepository) {
        Expenses expenses = expensesRepository.findById(id).get();
        expenses.setDescription(this.description);
        expenses.setAmount(this.amount);
        expenses.setDate(this.date);

        return expenses;
    }
}
