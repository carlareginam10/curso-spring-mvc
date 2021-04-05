package com.mballem.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIOS")
public class Funcionario  extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column( nullable = false)
	private BigDecimal salario;
	
	@Column(name = "data_entrada", nullable = false,  columnDefinition = "DATE")
	private LocalDate dataEntrata; 
	
	@Column(name = "data_saida",  columnDefinition = "DATE")
	private LocalDate dataSaida; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Endereco_id_fk")
	private Endereco endereço;
	
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrata() {
		return dataEntrata;
	}

	public void setDataEntrata(LocalDate dataEntrata) {
		this.dataEntrata = dataEntrata;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Endereco getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	

}
