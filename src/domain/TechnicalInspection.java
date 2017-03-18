package domain;

import java.util.Date;

/**
 * Created by gobi on 3/19/17.
 */
public class TechnicalInspection
{
    private int ID;
    private int carID;
    private Date expiration;

    public TechnicalInspection()
    {
    }

    public TechnicalInspection(int ID, int carID, Date expiration)
    {
        this.ID = ID;
        this.carID = carID;
        this.expiration = expiration;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getCarID()
    {
        return carID;
    }

    public void setCarID(int carID)
    {
        this.carID = carID;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }

    @Override
    public String toString()
    {
        return "TechnicalInspection{" +
                "ID=" + ID +
                ", carID=" + carID +
                ", expiration=" + expiration +
                '}';
    }
}
