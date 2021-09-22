import {Injectable} from '@angular/core';
import {BehaviorSubject, Observable} from "rxjs";
import {ICustomer} from "./Interface/ICustomer";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CusServiceService {

  constructor(private http: HttpClient) {
  }

  URL = "http://localhost:3000/customer";

  getAll(): Observable<ICustomer[]> {
    return this.http.get<ICustomer[]>(this.URL);
  }

  finById(id:number):Observable<ICustomer>{
    return this.http.get<ICustomer>(this.URL+'/'+id);
  }

  delete(id:number):Observable<ICustomer>{
    return this.http.delete<ICustomer>(this.URL+'/'+id);
  }

  update(id:number, customer:ICustomer):Observable<ICustomer>{
    return this.http.put<ICustomer>(this.URL+'/'+id, customer);
  }

  createCus(customer:ICustomer):Observable<ICustomer>{
    return this.http.post<ICustomer>(this.URL,customer)
  }

  search(key:String):Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this.URL+'?name_like='+key);
  }
}
