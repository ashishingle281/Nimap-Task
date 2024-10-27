package com.example.entity;

@Entity
@Table(name = "categories")
public class Category {

	    @Id
	    private Long id;

	    private String name;

		public Category(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	    
}
