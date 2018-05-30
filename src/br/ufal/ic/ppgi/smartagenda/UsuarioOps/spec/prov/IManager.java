package br.ufal.ic.ppgi.smartagenda.UsuarioOps.spec.prov;

<<<<<<< HEAD
import java.util.Set;

public interface IManager {

	public Set<String> getProvidedInterfaces();

	public Set<String> getRequiredInterfaces();

	public Object getProvidedInterface(String interfaceName);

	public void setRequiredInterface(String interfaceName, Object interfaceObject);

	public Object getRequiredInterface(String interfaceName);

=======
import java.util.Map;

public interface IManager {
	public Object getProvidedInterface(String nome);
	//public void SetProvidedInterface (String name, Object facade);
	public Object getRequireInterface (String name);
	public void setRequirededInterface (String name, Object facade);
	public String[] ListProvidedInterfaceNames();
	public String[] ListRequerededInterfaceNames();
	public Map<String, Class> getProvidedInterface();
	public Map<String, Class> getRequerededInterface();
	//public void SetRequerededInterfaeceType(String name, Class Type);
	//public void SetProvidedInterfaceType(String name, Class Type);
>>>>>>> branch 'usuarioops' of https://github.com/patrickhenrique/smartagenda.git
}
