package Entities;
import java.time.LocalDate;

import Abstract.entity;

public class Customer implements entity{
	public int Id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;

}
