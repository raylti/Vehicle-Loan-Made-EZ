import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppForm1Component } from './app-form1.component';

describe('AppForm1Component', () => {
  let component: AppForm1Component;
  let fixture: ComponentFixture<AppForm1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppForm1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppForm1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
