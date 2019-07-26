package dto;


import entity.Auditlog;

import java.io.Serializable;
import java.util.Date;

public class DTOFactory implements Serializable {

    public static AuditLogDTO createDTO(Auditlog entity) {

        String stationName = entity.getStationName();
        Date openedDate = entity.getOpenedDate();
        String description = entity.getDescription();
        long id = entity.getId();
        long stationId = entity.getStationId();
        String regionName = entity.getRegionName();
        Integer ticketSale = entity.getTicketSale();
        return new AuditLogDTO(id,stationId,description,stationName, ticketSale, openedDate, regionName);

    }

}
