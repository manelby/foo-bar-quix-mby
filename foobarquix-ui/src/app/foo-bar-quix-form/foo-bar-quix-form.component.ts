import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  form: FormGroup;
  @Output()
  submitNumberOutput = new EventEmitter<number>();


  constructor(public formBuilder: FormBuilder) {
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
    this.submitNumberOutput.emit(this.form.get('inputNumber').value);
  }

}
