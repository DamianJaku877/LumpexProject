package pl.sdaacademy.core.model;

import pl.sdaacademy.utils.TextUtils;

import java.time.LocalDate;

public class Calendar extends FeedModel {
    private boolean isAvailableOnMonday;
    private boolean isAvailableOnTuesday;
    private boolean isAvailableOnWednesday;
    private boolean isAvailableOnThursday;
    private boolean isAvailableOnFriday;
    private boolean isAvailableOnSaturday;
    private boolean isAvailableOnSunday;
    private LocalDate startDate;
    private LocalDate endDate;

    public Calendar() {
        super(TextUtils.EMPTY_STRING);
    }

    public Calendar(String serviceId, boolean isAvailableOnMonday, boolean isAvailableOnTuesday, boolean isAvailableOnWednesday, boolean isAvailableOnThursday, boolean isAvailableOnFriday, boolean isAvailableOnSaturday, boolean isAvailableOnSunday, LocalDate startDate, LocalDate endDate) {
        super(serviceId);
        this.isAvailableOnMonday = isAvailableOnMonday;
        this.isAvailableOnTuesday = isAvailableOnTuesday;
        this.isAvailableOnWednesday = isAvailableOnWednesday;
        this.isAvailableOnThursday = isAvailableOnThursday;
        this.isAvailableOnFriday = isAvailableOnFriday;
        this.isAvailableOnSaturday = isAvailableOnSaturday;
        this.isAvailableOnSunday = isAvailableOnSunday;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getServiceId() {
        return id;
    }

    public void setServiceId(String serviceId) {
        this.id = serviceId;
    }

    public boolean isAvailableOnMonday() {
        return isAvailableOnMonday;
    }

    public void setAvailableOnMonday(boolean availableOnMonday) {
        isAvailableOnMonday = availableOnMonday;
    }

    public boolean isAvailableOnTuesday() {
        return isAvailableOnTuesday;
    }

    public void setAvailableOnTuesday(boolean availableOnTuesday) {
        isAvailableOnTuesday = availableOnTuesday;
    }

    public boolean isAvailableOnWednesday() {
        return isAvailableOnWednesday;
    }

    public void setAvailableOnWednesday(boolean availableOnWednesday) {
        isAvailableOnWednesday = availableOnWednesday;
    }

    public boolean isAvailableOnThursday() {
        return isAvailableOnThursday;
    }

    public void setAvailableOnThursday(boolean availableOnThursday) {
        isAvailableOnThursday = availableOnThursday;
    }

    public boolean isAvailableOnFriday() {
        return isAvailableOnFriday;
    }

    public void setAvailableOnFriday(boolean availableOnFriday) {
        isAvailableOnFriday = availableOnFriday;
    }

    public boolean isAvailableOnSaturday() {
        return isAvailableOnSaturday;
    }

    public void setAvailableOnSaturday(boolean availableOnSaturday) {
        isAvailableOnSaturday = availableOnSaturday;
    }

    public boolean isAvailableOnSunday() {
        return isAvailableOnSunday;
    }

    public void setAvailableOnSunday(boolean availableOnSunday) {
        isAvailableOnSunday = availableOnSunday;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
