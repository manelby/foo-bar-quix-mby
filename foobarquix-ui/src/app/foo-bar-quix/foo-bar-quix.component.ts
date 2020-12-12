import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  numbersConverted: NumberConverted[] = [];
  errorMessage = '';
  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    this.numbersConverted.length = 0;
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber).subscribe({
        next: result => {   
          this.numbersConverted.push({numberToConvert: inputNumber, 
                result: result.result });
        },
        error: err => this.errorMessage = err
      });
    }
  

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
