import Abstracts.CustomerManeger;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;
import mernisReference.HIKKPSPublicSoap;
import org.apache.james.mime4j.dom.datetime.DateTime;

import java.util.Date;

public class Program {
    public static void main(String[] args) throws Exception {

        CustomerManeger customerManeger = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManeger.save(new Customer("Muhammet Ali","Ilgaz",
                new DateTime("1997",5,31,0,0,0,0),
                "21139660514"));


    }
}
