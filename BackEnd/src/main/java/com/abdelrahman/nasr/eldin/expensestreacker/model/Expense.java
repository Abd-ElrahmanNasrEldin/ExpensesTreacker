package com.abdelrahman.nasr.eldin.expensestreacker.model;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "expense")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expense_id", nullable = false)
    private Long id;
    @Column(name = "expense")
    private String expense;
    @Column(name = "description")
    private String description;
    @Column(name = "amount")
    private String amount;
}
