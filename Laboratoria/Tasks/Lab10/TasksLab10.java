package Tasks.Lab10;

import Tasks.Lab10.ZAD1.ZliczanieSlow;
import Tasks.Lab10.ZAD2.SystemLogowania;
import Tasks.Lab10.ZAD3.KartaDan;

public class TasksLab10 {
    public void Task01(){
        new ZliczanieSlow().PodawanieZdania();
    }
    public void Task02(){
        new SystemLogowania().MenuLogowania();
    }
    public void Task03(){
        new KartaDan().ListaDan();
    }
}
