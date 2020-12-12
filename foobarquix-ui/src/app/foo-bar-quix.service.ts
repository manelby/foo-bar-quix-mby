import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  private fooBarQuixUrl = 'http://localhost:8080/foo-bar-quix';

  constructor(private http: HttpClient) { }

  convertNumber(inputNumber: number): Observable<Result> {
    return this.http.get<Result>(`${this.fooBarQuixUrl}/${inputNumber}`)
    .pipe(
      tap(data => console.log('the result converted is ' + JSON.stringify(data))),
      catchError(this.handleError)
    );

    ;
  }

  private handleError(err: HttpErrorResponse) {
    
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = `An error occurred: ${err.error.message}`;
    } else {
      errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
    }
    console.error(errorMessage);
    return throwError(errorMessage);
  }
}
