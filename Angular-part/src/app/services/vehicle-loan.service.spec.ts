import { TestBed } from '@angular/core/testing';

import { VehicleLoanService } from './vehicle-loan.service';

describe('VehicleLoanService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VehicleLoanService = TestBed.get(VehicleLoanService);
    expect(service).toBeTruthy();
  });
});
