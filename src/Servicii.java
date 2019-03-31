import java.util.ArrayList;
import java.util.Scanner;

public class Servicii {



    public void addClient(ArrayList<Client> clienti)
    {
        Client c=new Client();
        c.adaugaClient();
        clienti.add(c);
    }

    public void showClient(Client c)
    {
        c.afisareClient();
    }

    public void createAbonament(Client c)
    {
        Abonament a=new Abonament();
        a.creareAbonament(c);
    }

    public void showAbonament(Abonament a)
    {
        a.afisAbonament();
    }
    public void extendAbonament(Abonament a)
    {
        a.extindereAbonament();
    }

    public void addAngajat(ArrayList<Angajat> angajati)
    {
        Angajat a=new Angajat();
        a.adaugaAngajat();
        angajati.add(a);
    }

    public void showAngajat(Angajat a)
    {
        a.afisareAngajare();
    }

    public void addClass(Angajat antrenor, ArrayList<Clasa> clase)
    {
        Clasa c=new Clasa();
        c.adaugareClasa(antrenor);
        clase.add(c);
    }

    public void showClasses(ArrayList<Clasa> clase)
    {
        for (int i = 0; i < clase.size(); i++) {
            clase.get(i).afisClasa();
        }

    }

    public void reserveClass(Client c,ArrayList<Clasa> clase)
    {
        System.out.println("La ce curs doresti?");
        Scanner sin=new Scanner(System.in);
        String s;
        s=sin.nextLine();
        for (int i = 0; i < clase.size(); i++) {
            if (clase.get(i).getNume().equals(s)) {
                clase.get(i).rezervareLoc(c);
            }

        }
    }



}
