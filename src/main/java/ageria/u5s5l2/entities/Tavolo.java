package ageria.u5s5l2.entities;

import ageria.u5s5l2.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;



public class Tavolo {

    private int tbNum;
    private TableStatus tableStatus;
    private int coperti;

    public Tavolo(int tbNum, TableStatus tableStatus, int coperti) {
        this.tbNum = tbNum;
        this.tableStatus = tableStatus;
        this.coperti = coperti;
    }

    public int getTbNum() {
        return tbNum;
    }

    public void setTbNum(int tbNum) {
        this.tbNum = tbNum;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }
}
