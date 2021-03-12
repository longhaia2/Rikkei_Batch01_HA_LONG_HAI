import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonhangmanagerComponent } from './donhangmanager.component';

describe('DonhangmanagerComponent', () => {
  let component: DonhangmanagerComponent;
  let fixture: ComponentFixture<DonhangmanagerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonhangmanagerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DonhangmanagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
