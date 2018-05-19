package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.dt;

public class UsuarioOpsDT {

	public Long idUsuario;

	public enum permissao {
		RESERVAR, BLOQUEAR, VISUALIZAR, BAIXAR
	};

	public enum tipo {
		PROFESSOR, BIBLIOTECARIO, ALUNO
	};


}
