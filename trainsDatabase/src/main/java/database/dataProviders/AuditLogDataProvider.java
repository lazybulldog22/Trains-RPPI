package database.dataProviders;

import database.DatabaseManager;
import dto.AuditLogDTO;
import dto.DTOListFactory;
import entity.Auditlog;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AuditLogDataProvider implements Serializable {

    public static List<AuditLogDTO> getAllAuditLogs() {
        List<AuditLogDTO> resultList;
        EntityManager em = DatabaseManager.getEntityManager();
        TypedQuery<Auditlog> query = em.createNamedQuery("AuditLog.findAll", Auditlog.class);
        resultList = DTOListFactory.createAuditLogDTOList(query.getResultList());
        return resultList;
    }

}
