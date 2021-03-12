import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonhanglistComponent } from './donhanglist.component';

describe('DonhanglistComponent', () => {
  let component: DonhanglistComponent;
  let fixture: ComponentFixture<DonhanglistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonhanglistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DonhanglistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
