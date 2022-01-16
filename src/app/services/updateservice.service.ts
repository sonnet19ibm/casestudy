import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UpdateserviceService {

  constructor(private http: HttpClient, private router : Router) { }

  public updateAddress(address: any){
    return this.http.put("http://localhost:8881/address/{id}",address);
  }
}
