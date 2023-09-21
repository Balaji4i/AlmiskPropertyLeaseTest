package model.EO;

import java.math.BigDecimal;

import java.sql.Date;
import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 18 14:28:48 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BookingHeader_EOImpl extends EntityImpl {

    /**
     * This is the default constructor (do not remove).
     */
    public BookingHeader_EOImpl() {
    }

    /**
     * @param bookingId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal bookingId) {
        return new Key(new Object[]{bookingId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.BookingHeader_EO");
    }


    @Override
        public void lock() {
            try {
                super.lock();
            } catch (RowInconsistentException e) {
                refresh(REFRESH_WITH_DB_ONLY_IF_UNCHANGED | REFRESH_CONTAINEES);
                super.lock();
            }
        }

}
