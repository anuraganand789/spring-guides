package com.example.validatingforminput;

import java.util.Optional;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm{
    
    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName(){
        return this.name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(final Integer age){
        this.age = age;
    }

    public String toString(){
        return String
	       .format("Person(Name: %s, Age: %d)", 
	                this.name, 
			this.age
		       );
    }
}
