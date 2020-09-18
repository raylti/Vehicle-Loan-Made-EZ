import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppForm3Component } from './app-form3.component';

describe('AppForm3Component', () => {
  let component: AppForm3Component;
  let fixture: ComponentFixture<AppForm3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppForm3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppForm3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
