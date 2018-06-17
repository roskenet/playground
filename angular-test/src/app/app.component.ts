import { Component } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  name: string;

  myClickHandler() {
      this.name = "Dies passiert nach einem Click!";
  }
  myDeleteHandler() {
      this.name = "";
  }
  constructor(private http: Http) {
//    http.get('http://192.168.99.100:30100/greet/Felix')
//        .map(res => res.json())
//        .subscribe(val => this.name = val['name']);
        // .subscribe(val => console.log(val['name']));
  }
}
