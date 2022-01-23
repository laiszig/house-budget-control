package br.com.alura.housebudgetcontrol.controller;


import br.com.alura.housebudgetcontrol.entity.Expenses;
import br.com.alura.housebudgetcontrol.repository.ExpensesRepository;
import br.com.alura.housebudgetcontrol.repository.IncomeRepository;
import br.com.alura.housebudgetcontrol.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    ExpensesRepository expensesRepository;

    @Autowired
    IncomeRepository incomeRepository;

    public List<Expenses> listExpenses() {
        return ExpensesService.listExpenses();
    }
}
