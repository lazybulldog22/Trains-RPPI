package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import entity.Auditlog;

@Entity
@Table(name = "STATION", schema = "PLATFORM")
@NamedQueries({
        @NamedQuery(name = "AuditLog.findAll", query = "select o from SQL_data o")
}
)
public class Auditlog implements Serializable {
    private long id;
    private long stationId;
    private String stationName;
    private String regionName;
    private Integer ticketSale;
    private Date openedDate;
    private String description;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Id
    @Column(name = "STATION_ID", nullable = false, precision = 0)
    public long getStationId() {
        return stationId;
    }
    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "STATIONNAME", nullable = false, precision = 0)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "REGIONNAME", nullable = false, precision = 0)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, precision = 0)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TICKET_SALE", nullable = false, precision = 0)
    public Integer getTicketSale() {
        return ticketSale;
    }

    public void setTicketSale(Integer ticketSale) {
        this.ticketSale = ticketSale;
    }

    @Basic
    @Column(name = "OPENED_DATE", nullable = false, precision = 0)
    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auditlog auditlog = (Auditlog) o;

        if (id != auditlog.id) return false;
        //if (userId != auditlog.userId) return false;
        //if (action != null ? !action.equals(auditlog.action) : auditlog.action != null) return false;
        //if (actionDate != null ? !actionDate.equals(auditlog.actionDate) : auditlog.actionDate != null) return false;
        if (description != null ? !description.equals(auditlog.description) : auditlog.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        //result = 31 * result + (action != null ? action.hashCode() : 0);
        //result = 31 * result + (pageTitle != null ? pageTitle.hashCode() : 0);
        return result;
    }
}
