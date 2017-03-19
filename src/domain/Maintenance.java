package domain;

import java.util.Date;

/**
 * Created by gobi on 3/19/17.
 */
public class Maintenance
{
    private int ID;
    private int carID;
    private String description;
    private long sum;
    private String currency;
    private Date date;

    public Maintenance()
    {
    }

    public Maintenance(int ID, int carID, String description, long sum, String currency, Date date)
    {
        this.ID = ID;
        this.carID = carID;
        this.description = description;
        this.sum = sum;
        this.currency = currency;
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getSum()
    {
        return sum;
    }

    public void setSum(long sum)
    {
        this.sum = sum;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "Maintenance{" +
                "ID=" + ID +
                ", carID=" + carID +
                ", description='" + description + '\'' +
                ", sum=" + sum +
                ", currency='" + currency + '\'' +
                '}';
    }
}
