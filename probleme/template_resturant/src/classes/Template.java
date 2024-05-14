package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Template {

    public final void pregatesteMasa(){
        curataMasa();
        puneServetele();
        asazaTacamurile();
        invitaPersoaneLaMasa();
    }

    public abstract void curataMasa();
    public abstract void puneServetele();
    public abstract void asazaTacamurile();
    public abstract void invitaPersoaneLaMasa();
}
