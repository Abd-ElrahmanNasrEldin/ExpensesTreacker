import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {map, Observable} from "rxjs";
import {Expense} from "../model/expense";

@Injectable({
  providedIn: 'root'
})
export class ExpenseService {

  private getAllExpensesUrl: string = "http://localhost:8080/api/v1/expenses";
  private getExpensesByIdUrl: string = "http://localhost:8080/api/v1/expenses?id=1";
  constructor(private _httpClient:HttpClient) { }
    getExpenses(): Observable<Expense[]> {
      return this._httpClient.get<Expense[]>(this.getAllExpensesUrl).pipe(
        map(resposne => resposne)
      )
    }
    getExpenseById( id:String): Observable<Expense> {
      return this._httpClient.get<Expense>(this.getExpensesByIdUrl+id).pipe(
        map(resposne => resposne)
      )
    }
}
