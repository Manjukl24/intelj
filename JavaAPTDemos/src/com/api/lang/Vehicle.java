package  com.api.lang;

import java.util.Objects;

public class Vehicle {
 private String brand;
 private String model;
 private String color;

 public Vehicle(String brand, String model, String color) {
  this.brand = brand;
  this.model = model;
  this.color = color;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Vehicle)) return false;
  Vehicle vehicle = (Vehicle) o;
  return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
 }

 @Override
 public int hashCode() {
  return Objects.hash(brand, model);
 }

}
