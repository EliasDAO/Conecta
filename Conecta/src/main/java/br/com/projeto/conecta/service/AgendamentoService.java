package br.com.projeto.conecta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import br.com.projeto.conecta.domain.Agendamento;
import br.com.projeto.conecta.domain.Consultor;
import br.com.projeto.conecta.repository.AgendamentoRepository;
import br.com.projeto.conecta.security.ConectaUserDetailsService;


@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository agendamentoRepository;
	@Autowired
	private ConectaUserDetailsService sessao;

	public List<Agendamento> BuscarTodos() {
		return agendamentoRepository.findAll();
	}
	
	public boolean salvarAgendamento(Agendamento agendamento) {
		agendamentoRepository.save(agendamento);
		return true;
	}

	//@Cacheable("cacdidaturasCache")
	public List<Agendamento> buscarCandidaturasByUsuario() {
		Consultor consultor = sessao.getCurrentConsultor();
		return agendamentoRepository.findByConsultor(consultor);
	}
}
