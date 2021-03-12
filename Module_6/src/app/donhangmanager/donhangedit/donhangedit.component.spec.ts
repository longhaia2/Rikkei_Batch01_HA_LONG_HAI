import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonhangeditComponent } from './donhangedit.component';

describe('DonhangeditComponent', () => {
  let component: DonhangeditComponent;
  let fixture: ComponentFixture<DonhangeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonhangeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DonhangeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
