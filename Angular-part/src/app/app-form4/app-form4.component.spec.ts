import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppForm4Component } from './app-form4.component';

describe('AppForm4Component', () => {
  let component: AppForm4Component;
  let fixture: ComponentFixture<AppForm4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppForm4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppForm4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
