package presenters;

import java.util.Collection;

import models.Table;

public interface View {
    void showTables(Collection<Table> tables);
    void showReservationStatus(int reservationNo);
    void setObserver(ViewObserver observer);
}