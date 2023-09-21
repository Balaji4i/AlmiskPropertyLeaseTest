package model.AM.client;

import model.AM.common.OtherCharges_AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 14 12:33:48 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OtherCharges_AMClient extends ApplicationModuleImpl implements OtherCharges_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public OtherCharges_AMClient() {
    }


    public String CreateOtherCharges() {
        Object _ret =
            this.riInvokeExportedMethod(this,"CreateOtherCharges",null,null);
        return (String)_ret;
    }

    public String getCodeSegmentCombination(String pBusinessUnitId,
                                            String pChargeType,
                                            String pUnitId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getCodeSegmentCombination",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {pBusinessUnitId, pChargeType, pUnitId});
        return (String)_ret;
    }

    public String getARInvoiceTrxDetailsOtherCharge(String pOtherChargeNum,
                                                    String pCustomerTrxId,
                                                    String pCustomerTrxNo) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getARInvoiceTrxDetailsOtherCharge",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {pOtherChargeNum, pCustomerTrxId, pCustomerTrxNo});
        return (String)_ret;
    }

    public String submitOcForAppr(String ocId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"submitOcForAppr",new String [] {"java.lang.String"},new Object[] {ocId});
        return (String)_ret;
    }

    public String responseOcForAppr(String ocId, String reason,
                                    String apr_rej) {
        Object _ret =
            this.riInvokeExportedMethod(this,"responseOcForAppr",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {ocId, reason, apr_rej});
        return (String)_ret;
    }

    public String submitOcForApprDP(String ocId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"submitOcForApprDP",new String [] {"java.lang.String"},new Object[] {ocId});
        return (String)_ret;
    }

    public String responseOcForApprDP(String ocId, String reason,
                                      String apr_rej) {
        Object _ret =
            this.riInvokeExportedMethod(this,"responseOcForApprDP",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {ocId, reason, apr_rej});
        return (String)_ret;
    }

    public String getCashRcptIdRspnse(String pReceiptNo, String pCshRcptId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getCashRcptIdRspnse",new String [] {"java.lang.String","java.lang.String"},new Object[] {pReceiptNo, pCshRcptId});
        return (String)_ret;
    }

    public String chngTnxDate(String ocId, String dateTnx) {
        Object _ret =
            this.riInvokeExportedMethod(this,"chngTnxDate",new String [] {"java.lang.String","java.lang.String"},new Object[] {ocId, dateTnx});
        return (String)_ret;
    }
}
