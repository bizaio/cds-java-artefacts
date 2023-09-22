/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
/**
 * Indicates that the schedule of payments is defined by a series of intervals. Mandatory if recurrenceUType is set to intervalSchedule
 */
public class BankingScheduledPaymentRecurrenceIntervalSchedule {

    public enum NonBusinessDayTreatment {
        AFTER,
        BEFORE,
        ON,
        ONLY
    }

    private LocalDate finalPaymentDate;

    private Integer paymentsRemaining;

    private NonBusinessDayTreatment nonBusinessDayTreatment = NonBusinessDayTreatment.ON;

    private List<BankingScheduledPaymentInterval> intervals;

    /**
     * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
     * @return finalPaymentDate
     */
    public LocalDate getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public void setFinalPaymentDate(LocalDate finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    /**
     * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value, If neither field is present the payments will continue indefinitely
     * @return paymentsRemaining
     */
    public Integer getPaymentsRemaining() {
        return paymentsRemaining;
    }

    public void setPaymentsRemaining(Integer paymentsRemaining) {
        this.paymentsRemaining = paymentsRemaining;
    }

    /**
     * Enumerated field giving the treatment where a scheduled payment date is not a business day. If absent assumed to be ON.<br>**AFTER** - If a scheduled payment date is a non-business day the payment will be made on the first business day after the scheduled payment date.<br>**BEFORE** - If a scheduled payment date is a non-business day the payment will be made on the first business day before the scheduled payment date.<br>**ON** - If a scheduled payment date is a non-business day the payment will be made on that day regardless.<br>**ONLY** - Payments only occur on business days. If a scheduled payment date is a non-business day the payment will be ignored
     * @return nonBusinessDayTreatment
     */
    public NonBusinessDayTreatment getNonBusinessDayTreatment() {
        return nonBusinessDayTreatment;
    }

    public void setNonBusinessDayTreatment(NonBusinessDayTreatment nonBusinessDayTreatment) {
        this.nonBusinessDayTreatment = nonBusinessDayTreatment;
    }

    /**
     * An array of interval objects defining the payment schedule.  Each entry in the array is additive, in that it adds payments to the overall payment schedule.  If multiple intervals result in a payment on the same day then only one payment will be made. Must have at least one entry
     * @return intervals
     */
    public List<BankingScheduledPaymentInterval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<BankingScheduledPaymentInterval> intervals) {
        this.intervals = intervals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentRecurrenceIntervalSchedule bankingScheduledPaymentRecurrenceIntervalSchedule = (BankingScheduledPaymentRecurrenceIntervalSchedule) o;
        return Objects.equals(this.finalPaymentDate, bankingScheduledPaymentRecurrenceIntervalSchedule.finalPaymentDate) &&
            Objects.equals(this.paymentsRemaining, bankingScheduledPaymentRecurrenceIntervalSchedule.paymentsRemaining) &&
            Objects.equals(this.nonBusinessDayTreatment, bankingScheduledPaymentRecurrenceIntervalSchedule.nonBusinessDayTreatment) &&
            Objects.equals(this.intervals, bankingScheduledPaymentRecurrenceIntervalSchedule.intervals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            finalPaymentDate,
            paymentsRemaining,
            nonBusinessDayTreatment,
            intervals);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentRecurrenceIntervalSchedule {\n" +
            "   finalPaymentDate: " + toIndentedString(finalPaymentDate) + "\n" + 
            "   paymentsRemaining: " + toIndentedString(paymentsRemaining) + "\n" + 
            "   nonBusinessDayTreatment: " + toIndentedString(nonBusinessDayTreatment) + "\n" + 
            "   intervals: " + toIndentedString(intervals) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
