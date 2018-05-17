package br.ic.ufal.ppgi.smartagenda.itemMgt.spec.prov;

import java.util.List;

public interface IManager {

    List<String> getRequiredInterfaces();
    List<String> getProvidedInterfaces();
    Object getRequiredInterface(String name);
    Object getProvidedInterface(String name);
    void setRequiredInterface(String name, Object object);

}
