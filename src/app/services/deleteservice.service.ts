import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class DeleteserviceService {

  constructor(private http: HttpClient, private router : Router) { }

  public deleteAddress(address: any){
    return this.http.delete("http://localhost:8881/address/{id}",address);
  }
}
