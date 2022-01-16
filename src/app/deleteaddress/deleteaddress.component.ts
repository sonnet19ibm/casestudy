import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { DeleteserviceService } from '../services/deleteservice.service';

@Component({
  selector: 'app-deleteaddress',
  templateUrl: './deleteaddress.component.html',
  styleUrls: ['./deleteaddress.component.css']
})
export class DeleteaddressComponent implements OnInit {
  addressData={
    id:'',
    street:'',
    city:'',
    state:'',
    country:'',
    zipCode:'',
  };
  constructor(private snack:MatSnackBar, private deleteaddress:DeleteserviceService,private router:Router) { }

  ngOnInit(): void {
  }

  deleteSubmit(){
    console.log('delete address btn clicked');
    //this.router.navigate(['payment'])

    this.deleteaddress.deleteAddress(this.addressData).subscribe((data: any)=>{
      console.log('success');
      console.log(data);
    },
    (error)=>{
      console.log('Error !');
      console.log(error);
    }
  );    
  }

}
