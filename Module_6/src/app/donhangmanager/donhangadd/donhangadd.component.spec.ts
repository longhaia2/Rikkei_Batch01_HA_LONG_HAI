import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonhangaddComponent } from './donhangadd.component';

describe('DonhangaddComponent', () => {
  let component: DonhangaddComponent;
  let fixture: ComponentFixture<DonhangaddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonhangaddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DonhangaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
