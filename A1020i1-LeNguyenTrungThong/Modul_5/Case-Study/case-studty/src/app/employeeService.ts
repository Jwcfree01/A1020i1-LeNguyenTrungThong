import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {IEmployee} from "./IEmployee";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  readonly API_URL = "http://localhost:3000/employees";
  constructor(private httpClient: HttpClient) { }

  getAllEmployee():Observable<IEmployee[]>{
    return this.httpClient.get<IEmployee[]>(this.API_URL);
  }

  createEmployee(employee : IEmployee):Observable<IEmployee>{
    console.log(employee.name + " a");
    return this.httpClient.post<IEmployee>(this.API_URL, employee);
  }

  // getByIdEmployee(id:number){
  //   return this.httpClient.
  // }


}
