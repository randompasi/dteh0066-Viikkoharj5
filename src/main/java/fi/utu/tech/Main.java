package fi.utu.tech;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        assignmentLine(1);
        var a = new Kissa("Misse", 5);
        var b = new Kissa("Mirri", 10);
        var c = new Koira("Musti", 1);
       var eläinjoukko = new Eläinjoukko<Eläin>();
       eläinjoukko.add(a);
       eläinjoukko.add(b);
       eläinjoukko.add(c);
        System.out.println(eläinjoukko.size());
       eläinjoukko.add(a);
        System.out.println(eläinjoukko.size());
       eläinjoukko.add(new Kissa("Misse",5));
        System.out.println(eläinjoukko.size());
//        a.tervehdi();
//        b.miu();
//        c.tervehdi();
//        c.nouda(new Keppi());
        System.out.println(eläinjoukko);
        var järjestettyEläinJoukko = new JärjestettyEläinjoukko<Eläin>();
        järjestettyEläinJoukko.add(a);
        järjestettyEläinJoukko.add(b);
        järjestettyEläinJoukko.add(c);
        järjestettyEläinJoukko.add(new Kissa("Fakta", 1));
        järjestettyEläinJoukko.add(new Koira("Andy", 10));
        for (var eläin : järjestettyEläinJoukko){
            System.out.println(eläin);
        }
        assignmentLine(2);
tervehdi(eläinjoukko);
tervehdi(järjestettyEläinJoukko);

    }

    private static void assignmentLine(int number){
        System.out.println();
        System.out.println("---------------------------Assignment "+ number +"-----------------------------");
    }

    private static void  tervehdi(Collection<Eläin> animals) {
        animals.forEach(it->it.tervehdi());
    }


}