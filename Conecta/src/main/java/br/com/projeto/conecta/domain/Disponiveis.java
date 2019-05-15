package br.com.projeto.conecta.domain;

import java.sql.Date;
import java.sql.Time;
//import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISPONIVEIS")
public class Disponiveis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDisponivel;
	
	private Time horaInicio;
	
	private Time horaFim;
	
	private Date data;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario")
	private Consultor consultor;
	
	public Disponiveis() {}
	
	public Disponiveis(Integer idDisponivel, Time horaInicio, Time horaFim, Date data, Consultor consultor) {
		this.idDisponivel = idDisponivel;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.data = data;
		this.consultor = consultor;
	}
	
	public Integer getIdDisponivel() {
		return idDisponivel;
	}

	public void setIdDisponivel(Integer idDisponivel) {
		this.idDisponivel = idDisponivel;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Time horaFim) {
		this.horaFim = horaFim;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Consultor getConsultor() {
		return consultor;
	}

	public void setConsultor(Consultor consultor) {
		this.consultor = consultor;
	}
	
	

}