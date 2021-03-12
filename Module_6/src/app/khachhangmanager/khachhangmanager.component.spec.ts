import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachhangmanagerComponent } from './khachhangmanager.component';

describe('KhachhangmanagerComponent', () => {
  let component: KhachhangmanagerComponent;
  let fixture: ComponentFixture<KhachhangmanagerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KhachhangmanagerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachhangmanagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
