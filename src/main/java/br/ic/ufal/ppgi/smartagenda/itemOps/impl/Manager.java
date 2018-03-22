package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.reflections.Reflections;

import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IManager;

public class Manager implements IManager {

	private static final String PKG = "br.ic.ufal.ppgi.smartagenda.itemOps";
	
	private Map<String, Object> requireds = new HashMap<>();
	private Map<String, Object> provideds = new HashMap<>();
	
	public Manager() {
		Set<Class<?>> annotateds = new Reflections(PKG).getTypesAnnotatedWith(Provided.class, true);
		Iterator<Class<?>> iterator = annotateds.iterator();
		
		while(iterator.hasNext()) {
			try {
				@SuppressWarnings("unchecked")
				Class<? extends AbstractFacade> next = (Class<? extends AbstractFacade>) iterator.next();
				AbstractFacade instance = next.newInstance();
				provideds.put(instance.getName(), instance);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public List<String> getRequiredInterfaces() {
		Set<Class<?>> annotateds = new Reflections(PKG).getTypesAnnotatedWith(Required.class, true);
		return annotateds.stream()
				.map(a -> a.getSimpleName())
				.collect(Collectors.toList());
	}

	@Override
	public List<String> getProvidedInterfaces() {
		List<String> names = new ArrayList<>();
		provideds.forEach( (k,v) -> names.add(k));
		return names;
	}

	@Override
	public Object getRequiredInterface(String name) {
		return requireds.get(name);
	}

	@Override
	public Object getProvidedInterface(String name) {
		return provideds.get(name);
	}

    @Override
    public void setRequiredInterface(String name, Object object) {
        requireds.put(name, object);
    }
    
}
