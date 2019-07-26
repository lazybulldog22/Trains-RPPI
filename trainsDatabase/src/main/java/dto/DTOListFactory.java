package dto;


import entity.Auditlog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DTOListFactory implements Serializable {

    public static List<AuditLogDTO> createAuditLogDTOList(List<Auditlog> entities) {
        List<AuditLogDTO> resultList = new ArrayList<AuditLogDTO>();

        if(entities != null) {
            for(Auditlog auditlog : entities) {
                resultList.add(DTOFactory.createDTO(auditlog));
            }
        }

        return resultList;
    }

}
