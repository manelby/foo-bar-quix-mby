import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  form: FormGroup;


  constructor(private http: HttpClient, public formBuilder: FormBuilder) {
    this.createForm();

  }

  createForm() {
    this.form = this.formBuilder.group({
      inputNumber: ['', Validators.required]
    });
  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    let formData: FormData = new FormData();
    formData.append("inputNumber", this.form.get('inputNumber').value);
    console.log(this.form.value);
  }

}
