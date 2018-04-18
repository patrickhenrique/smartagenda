package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.dt;

public class UsuarioDT {

	public Long idUsuario;
	public enum  permissao{
		RESERVAR, BLOQUEAR, VISUALIZAR, BAIXAR 
	};
	public enum tipo{
		PROFESSOR, BIBLIOTECARIO, ALUNO
	}; 

}
