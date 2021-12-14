package edu.neu.csye6200.api.concrete;

import edu.neu.csye6200.api.ImmunizationApi;
import edu.neu.csye6200.dao.ImmunizationDao;
import edu.neu.csye6200.model.Immunization;

import java.util.Date;
import java.util.List;

public class ConcreteImmunizationApi implements ImmunizationApi {
    @Override
    public List<Immunization> getAllImmunization() {
        return null;
    }

    @Override
    public List<Immunization> getImmunizationByName(String immName) {
        return null;
    }

    @Override
    public void addImmunization(Immunization imm) {

    }

    @Override
    public void updateImmunization(Immunization imm) {

    }

    @Override
    public void deleteImmunization(Immunization imm) {

    }
}
