package edu.neu.csye6200.dao;

import edu.neu.csye6200.model.Immunization;
import edu.neu.csye6200.utils.DatabaseUtil;

public class ImmunizationDao {

    public void addImmunization(Immunization imm) {
        String sql = "INSERT into IMMUNIZATION(imm_name, student_id, dose_1_id, dose_1_date, dose_2_id, dose_2_date,dose_3_id, dose_3_date, dose_4_id, dose_4_date) " +
                "VALUES("+imm.getImmunizationName()+"','"+imm.getStudentId()+"','"+imm.getDose_1_date()+"','"+imm.getDose_1_date()
                +"','"+imm.getDose_2_id()+"','"+imm.getDose_2_date()+"','"+imm.getDose_3_id()+"','"+imm.getDose_3_date()
                +"','"+imm.getDose_4_id()+"','"+imm.getDose_4_date()+");";
        DatabaseUtil.executeSQL(sql);
    }
}
