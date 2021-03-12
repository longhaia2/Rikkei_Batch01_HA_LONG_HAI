import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditnhanvienComponent } from './editnhanvien.component';

describe('EditnhanvienComponent', () => {
  let component: EditnhanvienComponent;
  let fixture: ComponentFixture<EditnhanvienComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditnhanvienComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditnhanvienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
