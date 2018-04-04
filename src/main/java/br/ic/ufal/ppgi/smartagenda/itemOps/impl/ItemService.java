package br.ic.ufal.ppgi.smartagenda.itemOps.impl;

import br.ic.ufal.ppgi.smartagenda.itemOps.impl.exceptions.ItemException;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.ItemDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.dt.UsuarioDt;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov.IManager;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.req.IUsuarioOps;
import br.ic.ufal.ppgi.smartagenda.itemOps.spec.req.ItemMgt;

public class ItemService {

    private IManager manager;
    private ItemMgt itemMgt;
    private IUsuarioOps usuarioOps;

    private ItemMgt getItemMgt(){
        return (ItemMgt) manager.getRequiredInterface("ItemMgt");
    }

    private IUsuarioOps getUsuarioOps(){
        return (IUsuarioOps) manager.getRequiredInterface("IUsuarioOps");
    }


    public ItemService(){
        manager = ComponentFactory.createInstance();
        this.itemMgt = getItemMgt();
        this.usuarioOps = getUsuarioOps();
    }

    public boolean save(ItemDt item) throws ItemException {

        this.validaItem(item);

        return itemMgt.save(item);
    }

    public boolean remove(int id) throws ItemException {

        ItemDt byId = itemMgt.getById(id);

        if(byId == null)
            throw new ItemException("ID nao encontrado no banco de dados");

        return itemMgt.remove(id);

    }


    public ItemDt consultarDetalhes(int idItem, int idUsuario) throws ItemException {


        UsuarioDt usuario = usuarioOps.consultar(idUsuario);

        if(usuario == null)
            throw new ItemException("Usuario nao encontrado");


        return null;
    }


    private void validaItem(ItemDt item) throws ItemException {

        if(item.titulo == null)
            throw new ItemException("Campo titulo nao pode estar vazio");

        if(item.autor == null)
            throw new ItemException("Campo autor nao pode estar vazio");

        if(item.ano == null)
            throw new ItemException("Campo ano nao pode estar vazio");

    }


}
