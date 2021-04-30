package com.mbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "files")
public class FileDB {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String name;

//	@ManyToMany
//	@JoinTable(name = "category_enrolled", joinColumns = @JoinColumn(name = "poster_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
//	private Set<CategoryEntity> categoryId = new HashSet<>();
//
//	public Set<CategoryEntity> getCategoryId() {
//		return categoryId;
//	}
//
//	public void setCategoryId(Set<CategoryEntity> categoryId) {
//		this.categoryId = categoryId;
//	}

	public void setId(String id) {
		this.id = id;
	}

	private String type;

	@Lob
	private byte[] data;

	public FileDB() {
	}

	public FileDB(String name, String type, byte[] data) {
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}