import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnhanvienComponent } from './addnhanvien.component';

describe('AddnhanvienComponent', () => {
  let component: AddnhanvienComponent;
  let fixture: ComponentFixture<AddnhanvienComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddnhanvienComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddnhanvienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
