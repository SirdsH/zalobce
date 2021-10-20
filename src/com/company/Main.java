package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String input = "rok,zalobce,castka\n" +
                "1999,Lauder,3068000.00\n" +
                "2000,Lauder,14891000.00\n" +
                "2000,CME,831000.00\n" +
                "2001,Saluka,22310000.00\n" +
                "2001,Lauder,53176000.00\n" +
                "2001,CME,103486000.00\n" +
                "2002,Saluka,97679000.00\n" +
                "2002,Nagel,3704000.00\n" +
                "2002,Lauder,136000.00\n" +
                "2002,CME,233741000.00\n" +
                "2003,PR 1.,1148000.00\n" +
                "2003,Investmart,131000.00\n" +
                "2003,Phoenix,391000.00\n" +
                "2003,Mediaprint,727000.00\n" +
                "2003,EMV,2058000.00\n" +
                "2003,Saluka,68643000.00\n" +
                "2003,Nagel,25283000.00\n" +
                "2003,Nomura,9670000.00\n" +
                "2003,CME,94555000.00\n" +
                "2004,ZIPimex,817000.00\n" +
                "2004,PR 1.,1064000.00\n" +
                "2004,PR 2.,1803000.00\n" +
                "2004,Eastern Sugar,1581000.00\n" +
                "2004,Investmart,542000.00\n" +
                "2004,Phoenix,845000.00\n" +
                "2004,Mediaprint,17000.00\n" +
                "2004,EMV,855000.00\n" +
                "2004,Saluka,53406000.00\n" +
                "2004,Nagel,2416000.00\n" +
                "2004,Nomura,10460000.00\n" +
                "2005,ZIPimex,1231000.00\n" +
                "2005,Binder,587000.00\n" +
                "2005,Mittal,609000.00\n" +
                "2005,PR 3.,2143000.00\n" +
                "2005,PR 2.,223000.00\n" +
                "2005,Eastern Sugar,22757000.00\n" +
                "2005,Phoenix,24000.00\n" +
                "2005,EMV,259000.00\n" +
                "2005,Saluka,108003000.00\n" +
                "2005,Nagel,1331000.00\n" +
                "2005,Nomura,55010000.00\n" +
                "2006,ZIPimex,9460000.00\n" +
                "2006,Binder,4979000.00\n" +
                "2006,Mittal,17162000.00\n" +
                "2006,K+Venture,24215000.00\n" +
                "2006,Gromann,1000000.00\n" +
                "2006,PR 3.,205000.00\n" +
                "2006,Eastern Sugar,27333000.00\n" +
                "2006,Investmart,16000.00\n" +
                "2006,Phoenix,1220000.00\n" +
                "2006,EMV,18070000.00\n" +
                "2006,Saluka,37111000.00\n" +
                "2006,Nagel,1470000.00\n" +
                "2006,Nomura,93931000.00\n" +
                "2006,odkup pohledávky IPB,500000.00\n" +
                "2006,odkup pohledávek,75000.00\n" +
                "2007,SPA - LNM Holdings,2137000.00\n" +
                "2007,Sdružení akcionářů IPB,335000.00\n" +
                "2007,ZIPimex,5657000.00\n" +
                "2007,Binder,9291000.00\n" +
                "2007,Mittal,42390000.00\n" +
                "2007,K+Venture,2095000.00\n" +
                "2007,Gromann,87000.00\n" +
                "2007,Eastern Sugar,2406000.00\n" +
                "2007,Investmart,913000.00\n" +
                "2007,Phoenix,14024000.00\n" +
                "2007,EMV,16081000.00\n" +
                "2007,Saluka,40632000.00\n" +
                "2007,Nagel,1379000.00\n" +
                "2007,Nomura,8000.00\n" +
                "2007,Frontier Petroleum,7737000.00\n" +
                "2007,Investmart 2,1710000.00\n" +
                "2007,ČSOB (IPB) - J.Ring,3044000.00\n" +
                "2007,Monarch Machinery,179000.00\n" +
                "2008,Sdružení akcionářů IPB,4478000.00\n" +
                "2008,ZIPimex,6116000.00\n" +
                "2008,Binder,10605000.00\n" +
                "2008,Mittal,42046000.00\n" +
                "2008,Eastern Sugar,140000.00\n" +
                "2008,Investmart,84260000.00\n" +
                "2008,Phoenix,4606000.00\n" +
                "2008,EMV,27123000.00\n" +
                "2008,Saluka,21847000.00\n" +
                "2008,Nagel,135000.00\n" +
                "2008,Frontier Petroleum,7728000.00\n" +
                "2008,České pivo - Matzner,33000.00\n" +
                "2008,ČSOB (IPB) - J.Ring,12575000.00\n" +
                "2008,InterTrade / CE Wood,1650000.00\n" +
                "2008,Monarch Machinery,30000.00\n" +
                "2008,Georg Nepolský,208000.00\n" +
                "2008,Vöcklinghaus,4984000.00\n" +
                "2009,Sdružení akcionářů IPB,17000.00\n" +
                "2009,Forminster EL,214000.00\n" +
                "2009,ZIPimex,4265000.00\n" +
                "2009,Binder,14287000.00\n" +
                "2009,Mittal,1134000.00\n" +
                "2009,Czechoslonor,277000.00\n" +
                "2009,Investmart,5843000.00\n" +
                "2009,Phoenix,557000.00\n" +
                "2009,EMV,712000.00\n" +
                "2009,Saluka,296000.00\n" +
                "2009,Frontier Petroleum,34295000.00\n" +
                "2009,České pivo - Matzner,9000.00\n" +
                "2009,ČSOB (IPB) - J.Ring,24609000.00\n" +
                "2009,Pekárny Příbram / Techingstav,301000.00\n" +
                "2009,InterTrade / CE Wood,1504000.00\n" +
                "2009,Georg Nepolský,8813000.00\n" +
                "2009,Vöcklinghaus,9850000.00\n" +
                "2009,ECE,1747000.00\n" +
                "2009,Konsorcium Oeconomicus,1391000.00\n" +
                "2010,Forminster EL,990000.00\n" +
                "2010,ZIPimex,3271000.00\n" +
                "2010,Binder,2817000.00\n" +
                "2010,Czechoslonor,12000.00\n" +
                "2010,Phoenix,144000.00\n" +
                "2010,EMV,531000.00\n" +
                "2010,Frontier Petroleum,902000.00\n" +
                "2010,ČSOB (IPB) - J.Ring,23563000.00\n" +
                "2010,Pekárny Příbram / Techingstav,6466000.00\n" +
                "2010,InterTrade / CE Wood,35888000.00\n" +
                "2010,Georg Nepolský,750000.00\n" +
                "2010,Vöcklinghaus,40343000.00\n" +
                "2010,ECE,24635000.00\n" +
                "2010,Konsorcium Oeconomicus,4462000.00\n" +
                "2011,Forminster EL,258000.00\n" +
                "2011,ZIPimex,312000.00\n" +
                "2011,Binder,25946000.00\n" +
                "2011,Czechoslonor,236000.00\n" +
                "2011,EMV,63000.00\n" +
                "2011,Frontier Petroleum,2247000.00\n" +
                "2011,další spory s ČSOB,4487000.00\n" +
                "2011,ČSOB (IPB) - J.Ring,23811000.00\n" +
                "2011,Pekárny Příbram / Techingstav,17128000.00\n" +
                "2011,InterTrade / CE Wood,56795000.00\n" +
                "2011,Georg Nepolský,921000.00\n" +
                "2011,Vöcklinghaus,27252000.00\n" +
                "2011,ECE,63855000.00\n" +
                "2011,Konsorcium Oeconomicus,2052000.00\n" +
                "2011,Spory související s fotovoltaickým průmyslem,10416000.00\n" +
                "2012,ZIPimex,11000.00\n" +
                "2012,Binder,4717000.00\n" +
                "2012,EMV,55000.00\n" +
                "2012,Frontier Petroleum,353000.00\n" +
                "2012,ČSOB (IPB) - J.Ring,355000.00\n" +
                "2012,InterTrade / CE Wood,110000.00\n" +
                "2012,Georg Nepolský,422000.00\n" +
                "2012,Vöcklinghaus,4015000.00\n" +
                "2012,ECE,12000.00\n" +
                "2012,Konsorcium Oeconomicus,2008000.00\n" +
                "2012,Spory související s fotovoltaickým průmyslem,4517000.00\n" +
                "2012,\"Multivest B.V., Finspel B.V.\",1173000.00\n" +
                "2013,Binder,539000.00\n" +
                "2013,Georg Nepolský,195000.00\n" +
                "2013,Vöcklinghaus,2791000.00\n" +
                "2013,ECE,-113000.00\n" +
                "2013,Konsorcium Oeconomicus,650000.00\n" +
                "2013,Spory související s fotovoltaickým průmyslem,14970000.00\n" +
                "2013,Smírné řešení sporu s Cognor Stahlhandel,86000.00\n" +
                "2013,Atomastra,891000.00\n" +
                "2013,Anglia Auto Accesories,236000.00\n" +
                "2014,Forminster EL,340000.00\n" +
                "2014,Binder,17000.00\n" +
                "2014,Georg Nepolský,27000.00\n" +
                "2014,Vöcklinghaus,98000.00\n" +
                "2014,Konsorcium Oeconomicus,48000.00\n" +
                "2014,Spory související s fotovoltaickým průmyslem,25353000.00\n" +
                "2014,Anglia Auto Accesories,520000.00\n" +
                "2014,WNC Factoring,1005000.00\n" +
                "2015,Vöcklinghaus,180000.00\n" +
                "2015,Spory související s fotovoltaickým průmyslem,62645000.00\n" +
                "2015,Anglia Auto Accesories,1609000.00\n" +
                "2015,I.P. Busta a J.P. Busta,445000.00\n" +
                "2015,WNC Factoring,16372000.00\n" +
                "2015,A11Y,3635000.00\n" +
                "2016,ZIPimex,615000.00\n" +
                "2016,Vöcklinghaus,195000.00\n" +
                "2016,Spory související s fotovoltaickým průmyslem,77644000.00\n" +
                "2016,Anglia Auto Accesories,3269000.00\n" +
                "2016,I.P. Busta a J.P. Busta,5281000.00\n" +
                "2016,WNC Factoring,26903000.00\n" +
                "2016,A11Y,2728000.00\n" +
                "2016,WCV,8420000.00\n" +
                "2017,Vöcklinghaus,11000.00\n" +
                "2017,Spory související s fotovoltaickým průmyslem,127511000.00\n" +
                "2017,Anglia Auto Accesories,145000.00\n" +
                "2017,I.P. Busta a J.P. Busta,192000.00\n" +
                "2017,WNC Factoring,15252000.00\n" +
                "2017,A11Y,1971000.00\n" +
                "2017,WCV,23186000.00\n" +
                "2017,A.M.F.,759000.00\n" +
                "2017,Pawlowski,222000.00\n" +
                "2018,Spory související s fotovoltaickým průmyslem,14366000.00\n" +
                "2018,WNC Factoring,1656000.00\n" +
                "2018,A11Y,6271000.00\n" +
                "2018,WCV,1994000.00\n" +
                "2018,A.M.F.,1389000.00\n" +
                "2018,Pawlowski,563000.00\n" +
                "2018,Diag Human,3696000.00\n" +
                "2018,Fynerdale,359000.00\n" +
                "2019,Spory související s fotovoltaickým průmyslem,27694000.00\n" +
                "2019,WNC Factoring,34000.00\n" +
                "2019,A11Y,587000.00\n" +
                "2019,WCV,16203000.00\n" +
                "2019,A.M.F.,10859000.00\n" +
                "2019,Pawlowski,18044000.00\n" +
                "2019,Diag Human,38410000.00\n" +
                "2019,Fynerdale,3835000.00\n" +
                "2019,Alcor,3489000.00\n" +
                "2019,NWR,50000.00\n";

        ArrayList<Zalobce> arrayList = new ArrayList<>();

        String[] arr = input.split("\n");

        for (int i = 1; i < arr.length; i++) {
            String line = arr[i].replace("\"", "");
            String[] linesAsArr = line.split(",");

            Zalobce zalobce = new Zalobce(Integer.parseInt(linesAsArr[0]), linesAsArr[1], Double.parseDouble(linesAsArr[linesAsArr.length - 1]));

            arrayList.add(zalobce);
        }
        HashMap<String, Double> map = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Zalobce zalobce = arrayList.get(i);

            if(map.containsKey(zalobce.getZalobce()))
                map.put(zalobce.getZalobce(), zalobce.getCastka() + map.get(zalobce.getZalobce()));
            else
                map.put(zalobce.getZalobce(), zalobce.getCastka());
        }

        Set<String> keys = map.keySet();
        double maxPrice = -1;
        String zalobce = "";
        for(String key : keys) {
            double price = map.get(key);
            if(price > maxPrice) {
                maxPrice = price;
                zalobce = key;
            }
        }
        System.out.println(zalobce + " - " + maxPrice);
    }
}
