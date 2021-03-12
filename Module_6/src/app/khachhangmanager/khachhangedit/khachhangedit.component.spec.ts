import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachhangeditComponent } from './khachhangedit.component';

describe('KhachhangeditComponent', () => {
  let component: KhachhangeditComponent;
  let fixture: ComponentFixture<KhachhangeditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KhachhangeditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachhangeditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
