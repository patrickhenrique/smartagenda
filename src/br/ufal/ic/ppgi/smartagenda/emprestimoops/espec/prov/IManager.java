package br.ufal.ic.ppgi.smartagenda.emprestimoops.espec.prov;

import java.util.List;

public interface IManager {
	public List<String> getProvidedInterfaces();//como esta na especifica��o ent�o � publico
	public List<String> getRequiredInterfaces();
	public Object getProvidedInterface(String interfaceName);
	public Object getRequiredInterface(String interfaceName);
	public void setRequiredInterface(String interfaceName, Object objeto);
}
