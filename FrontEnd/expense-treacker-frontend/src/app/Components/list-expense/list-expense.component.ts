import {Component} from '@angular/core';
import {ExpenseService} from "../../services/expense.service";
import {Expense} from "../../model/expense";

@Component({
  selector: 'app-list-expense',
  templateUrl: './list-expense.component.html',
  styleUrls: ['./list-expense.component.css']
})
export class ListExpenseComponent {
  expenses: Expense[] = [];

  constructor(private _expensesService: ExpenseService) {
  }

  ngOnInit(): void {
    this._expensesService.getExpenses().subscribe(
      data => this.expenses = data
    )
    console.log('JSON Response = ', JSON.stringify(this.expenses));
  }

}
