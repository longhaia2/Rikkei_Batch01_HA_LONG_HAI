import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachhangaddComponent } from './khachhangadd.component';

describe('KhachhangaddComponent', () => {
  let component: KhachhangaddComponent;
  let fixture: ComponentFixture<KhachhangaddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KhachhangaddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachhangaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
