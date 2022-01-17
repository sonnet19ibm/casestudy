import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ListOrderItemsService {

  constructor(private http: HttpClient, private router : Router) { }

  getOrderItemList(orderitem:any){
    return this.http.post("http://localhost:8881/list",orderitem);
  }

}
