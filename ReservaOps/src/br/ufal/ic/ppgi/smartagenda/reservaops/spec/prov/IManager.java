package br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov;

import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager.Interfaces.Provided;
import br.ufal.ic.ppgi.smartagenda.reservaops.spec.prov.IManager.Interfaces.Required;

public interface IManager {
	
	public Set<String> getProvidedInterfaces();
	public Set<String> getRequiredInterfaces();

	public Object getProvidedInterface(String interfaceName);
	public Object getProvidedInterface(Provided interfaces);
	public Object getRequiredInterface(String interfaceName);
	public Object getRequiredInterface(Required interfaces);

	public void setRequiredInterface(String interfaceName, Object objeto);
	public void setRequiredInterface(Required interfaces, Object objeto);
	
	public static class Interfaces {
		public enum Provided {
			ICancelarReservaOps, IReservarItemOps
		}		
		public enum Required {
			IReqNegocio, IReqSistema
		}
	}

}
