package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.dt;

public class UsuarioDT {
	/**
	 * @desc atributos do usuario usados no componente Exemplar Classe para
	 *       verificar se o usuario informado tem permissao de visualizar ou baixar
	 *       o exemplar
	 * 
	 * 
	 * @author Glevson
	 *
	 */

	public Long idUsuario;

	public enum permissao {
		RESERVAR, BLOQUEAR, VISUALIZAR, BAIXAR
	};

	public enum tipo {
		PROFESSOR, BIBLIOTECARIO, ALUNO
	};

}
