package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

/**
 * Interface responsável pelo a "view" do exemplar, quando o mesmo for
 * disponível para visualização em browser.
 * 
 * @author Edival e Miguel Lima
 * 
 */
public interface IBaixarExemplar {
	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] baixarExemplar(Long idExemplar, Long idUsuario);

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] visualizarExemplar(Long idExemplar, Long idUsuario);

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] reproduzirVideoExemplar(Long idExemplar, Long idUsuario);

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] reproduzirAudioExemplar(Long idExemplar, Long idUsuario);

	/**
	 * 
	 * @param idExemplar
	 * @param idUsuario
	 * @return byte[]
	 */
	public byte[] exibirExemplar(Long idExemplar, Long idUsuario);
}
