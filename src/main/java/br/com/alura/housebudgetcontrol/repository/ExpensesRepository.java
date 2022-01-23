package br.com.alura.housebudgetcontrol.repository;

import br.com.alura.housebudgetcontrol.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
}
