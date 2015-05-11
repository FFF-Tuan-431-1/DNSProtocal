/**
 * Created by xiaowei on 2015/5/11.
 */
public class Paper {
    public Paper(byte[] buffer) {

    }

    public byte[] getID() {
        return ID;
    }

    public void setID(byte[] ID) {
        this.ID = ID;
    }

    public boolean isQR() {
        return QR;
    }

    public void setQR(boolean QR) {
        this.QR = QR;
    }

    public int getOpCode() {
        return OpCode;
    }

    public void setOpCode(int opCode) {
        OpCode = opCode;
    }

    public boolean isAA() {
        return AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }

    public boolean isTC() {
        return TC;
    }

    public void setTC(boolean TC) {
        this.TC = TC;
    }

    public boolean isRD() {
        return RD;
    }

    public void setRD(boolean RD) {
        this.RD = RD;
    }

    public boolean isRA() {
        return RA;
    }

    public void setRA(boolean RA) {
        this.RA = RA;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }

    public int getRCode() {
        return RCode;
    }

    public void setRCode(int RCode) {
        this.RCode = RCode;
    }

    public int getQDCount() {
        return QDCount;
    }

    public void setQDCount(int QDCount) {
        this.QDCount = QDCount;
    }

    public int getANCount() {
        return ANCount;
    }

    public void setANCount(int ANCount) {
        this.ANCount = ANCount;
    }

    public int getNSCOUNT() {
        return NSCOUNT;
    }

    public void setNSCOUNT(int NSCOUNT) {
        this.NSCOUNT = NSCOUNT;
    }

    public int getARCOUNT() {
        return ARCOUNT;
    }

    public void setARCOUNT(int ARCOUNT) {
        this.ARCOUNT = ARCOUNT;
    }

    private byte[] ID = new byte[2];

    private boolean QR;//1bit
    private int OpCode;//4bit
    private boolean AA;//1bit
    private boolean TC;//1bit
    private boolean RD;//1bit
    private boolean RA;//1bit
    private int Z;//3bit
    private int RCode;//4bit

    private int QDCount;//16bit
    private int ANCount;//16bit
    private int NSCOUNT;//16bit
    private int ARCOUNT;//16bit



}

class Question {
    public Question(byte[] buffer){};

    public String QName;
    public int QType;
    public int QClass;

}