package Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sum implements Calc {
    public List<Calc> calc = new ArrayList<Calc>();

    public int compute() {
/*for (Calc calcs:calc) {
    calcs.compute();
}*/
return calc.get(0).compute()+calc.get(1).compute();


            }
            public void add(Calc s){
                this.calc.add(s);
    }
}
