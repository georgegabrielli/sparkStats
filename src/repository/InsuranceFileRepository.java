package repository;

import domain.Insurance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by gobi on 3/19/17.
 */
public class InsuranceFileRepository implements IRepository
{
    Map<Integer, Insurance> insurances;

    public InsuranceFileRepository()
    {
        insurances = new HashMap<>();
        readFile();
    }

    @Override
    public void readFile()
    {
        Path fileName = Paths.get("insurances.txt");

        try
        {
            Files.lines(fileName).forEach(
                    line ->
                    {
                       try
                       {
                           List<String> attributes = Arrays.asList(line.split(","));


                        int ID = Integer.parseInt(attributes.get(0));
                        int carID = Integer.parseInt(attributes.get(1));
                        String issuer = attributes.get(2);
                        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyy");
                        Date expiration = parser.parse(attributes.get(3));
                        Date start = parser.parse(attributes.get(4));

                           Insurance temp = new Insurance(ID, carID, issuer, expiration, start);
                           save(temp);
                       }
                       catch(ParseException e)
                       {
                           e.printStackTrace();
                       }
                    }
            );
        }

            catch(IOException e)
            {
                e.printStackTrace();
            }

    }

    public Optional<Insurance> save(Insurance newInsurance)
    {
        if(newInsurance == null)
        {
            throw new IllegalArgumentException("Insurance is not good!");
        }
        else return Optional.ofNullable(insurances.putIfAbsent(newInsurance.getID(), newInsurance));
    }
}