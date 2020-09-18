import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppForm2Component } from './app-form2.component';

describe('AppForm2Component', () => {
  let component: AppForm2Component;
  let fixture: ComponentFixture<AppForm2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppForm2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppForm2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
