package ba.unsa.etf.rpr;

public class Sat {
    private int sati,minute,sekunde;

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }
    public Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }

    public void Postavi(int sati, int minute, int sekunde) { setSati(sati); setMinute(minute); setSekunde(sekunde); }

    public void Sljedeci() {
        setSekunde(sekunde+1);
        if (getSekunde()==60) { setSekunde(0); setMinute(minute+1); }
        if (getMinute()==60) { setMinute(0); setSati(sati+1); }
        if (getSati()==24) setSati(0);
    }
    public void Prethodni() {
        setSekunde(sekunde-1);
        if (getSekunde()==-1) { setSekunde(59); setMinute(minute-1); }
        if (getMinute()==-1) { setMinute(59); setSati(sati-1); }
        if (getSati()==-1) setSati(23);
    }
    public void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
		else for (int i=0; i<pomak; i++) Prethodni();
    }

    public int DajSate()  { return getSekunde(); }
    public int DajMinute()  { return getMinute(); }
    public int DajSekunde()  { return getSati(); }

    public void Ispisi()  {
        System.out.println(getSati()+":"+getMinute()+":"+getSekunde());
    }






}
