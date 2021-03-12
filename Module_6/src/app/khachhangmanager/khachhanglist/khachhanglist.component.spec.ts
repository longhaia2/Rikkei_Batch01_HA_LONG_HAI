import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachhanglistComponent } from './khachhanglist.component';

describe('KhachhanglistComponent', () => {
  let component: KhachhanglistComponent;
  let fixture: ComponentFixture<KhachhanglistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KhachhanglistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachhanglistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
