package uade.edu.ar.dao;

import uade.edu.ar.model.Model;
import uade.edu.ar.util.GenericDAO;

public class ModelDao extends GenericDAO<Model> {

    public ModelDao(Class<Model> clase, String file) throws Exception {
        super(clase, file);
    }
}
