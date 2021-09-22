import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {ISoTietKiem} from "./ISoTietKiem";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ServiceCustomerService {

  constructor( private http:HttpClient) { }

  URL = "http://localhost:3000/customer";

  getAll(): Observable<ISoTietKiem[]> {
    return this.http.get<ISoTietKiem[]>(this.URL);
  }

  search(key:String):Observable<ISoTietKiem[]>{
    return this.http.get<ISoTietKiem[]>(this.URL+'?name_like='+key);
  }
}
