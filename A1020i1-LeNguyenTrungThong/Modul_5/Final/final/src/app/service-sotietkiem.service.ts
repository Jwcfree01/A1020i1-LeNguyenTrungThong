import { Injectable } from '@angular/core';
import {ISoTietKiem} from "./ISoTietKiem";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ServiceSotietkiemService {

  constructor( private http:HttpClient) { }

  URL = "http://localhost:3000/sotietkiem";

  getAll(): Observable<ISoTietKiem[]> {
    return this.http.get<ISoTietKiem[]>(this.URL);
  }

  finById(id:number):Observable<ISoTietKiem>{
    return this.http.get<ISoTietKiem>(this.URL+'/'+id);
  }

  delete(id:number):Observable<ISoTietKiem>{
    return this.http.delete<ISoTietKiem>(this.URL+'/'+id);
  }

  update(id:number, soTietKiem:ISoTietKiem):Observable<ISoTietKiem>{
    return this.http.put<ISoTietKiem>(this.URL+'/'+id, soTietKiem);
  }

  search(key:String):Observable<ISoTietKiem[]>{
    return this.http.get<ISoTietKiem[]>(this.URL+'?customer.name_like='+key);
  }

  searchSelect(key:number):Observable<ISoTietKiem[]>{
    console.log(key +"a")
    return this.http.get<ISoTietKiem[]>(this.URL+'/'+key);
  }
}
