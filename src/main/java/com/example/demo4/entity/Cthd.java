package com.example.demo4.entity;
// Generated Dec 14, 2022, 9:49:56 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cthd generated by hbm2java
 */
@Entity
@Table(name = "cthd", catalog = "thoitrang")
public class Cthd implements java.io.Serializable {

	private CthdId id;
	private Hoadon hoadon;
	private Mathang mathang;
	private int soluong;

	public Cthd() {
	}

	public Cthd(CthdId id, Hoadon hoadon, Mathang mathang, int soluong) {
		this.id = id;
		this.hoadon = hoadon;
		this.mathang = mathang;
		this.soluong = soluong;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "sohd", column = @Column(name = "SOHD", nullable = false, length = 10)),
			@AttributeOverride(name = "mamh", column = @Column(name = "MAMH", nullable = false, length = 10)) })
	public CthdId getId() {
		return this.id;
	}

	public void setId(CthdId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOHD", nullable = false, insertable = false, updatable = false)
	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAMH", nullable = false, insertable = false, updatable = false)
	public Mathang getMathang() {
		return this.mathang;
	}

	public void setMathang(Mathang mathang) {
		this.mathang = mathang;
	}

	@Column(name = "SOLUONG", nullable = false)
	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

}
