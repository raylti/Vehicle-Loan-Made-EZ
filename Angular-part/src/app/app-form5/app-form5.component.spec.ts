import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppForm5Component } from './app-form5.component';

describe('AppForm5Component', () => {
  let component: AppForm5Component;
  let fixture: ComponentFixture<AppForm5Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppForm5Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppForm5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
