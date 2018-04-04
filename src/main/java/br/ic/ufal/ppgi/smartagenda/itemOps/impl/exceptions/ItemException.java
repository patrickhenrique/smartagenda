package br.ic.ufal.ppgi.smartagenda.itemOps.impl.exceptions;

public class ItemException extends Exception {

    private String message;

    public ItemException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }

}
