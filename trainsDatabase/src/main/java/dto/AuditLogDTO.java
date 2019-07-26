package dto;

import java.io.Serializable;
import java.util.Date;

public class AuditLogDTO implements Serializable {
    private long id;
    private long stationId;
    private String stationName;
    private String regionName;
    private Integer ticketSale;
    private Date openedDate;
    private String description;

    public long getId() {
        return id;
    }

    public long getStationId(){ return stationId;}

    public String getStationName() {
        return stationName;
    }

    public String getRegionName() {
        return regionName;
    }

    public Integer getTicketSale() {
        return ticketSale;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public String getDescription() {
        return description;
    }

    public AuditLogDTO(long id,long stationId, String stationName, String regionName, Integer ticketSale, Date openedDate, String description) {
        this.id = id;
        this.stationId = stationId;
        this.stationName = stationName;
        this.regionName = regionName;
        this.ticketSale = ticketSale;
        this.openedDate = openedDate;
        this.description = description;
    }

    @Override
    public String toString() {
        return "AuditLogDTO{" +
                "id=" + id +
                ", STATION_ID="+stationId+  '\'' +
                ", STATIONNAME='" + stationName + '\'' +
                ", REGIONNAME='" + regionName + '\'' +
                ", TICKET_SALE='" + ticketSale + '\'' +
                ", OPENED_DATE=" + openedDate +
                ", DESCRIPTION='" + description + '\'' +
                '}';
    }
}
