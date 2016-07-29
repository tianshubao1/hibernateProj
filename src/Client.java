import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		
		Team t = new Team();
		t.setId(1);
		t.setName("US wars");
		
		Player one = new Player();
		one.setId(1);
		one.setName("dada");
		one.setAge(20);
		
		Player two = new Player();
		two.setId(2);
		two.setName("pigs");
		two.setAge(25);
		
		Set<Player> set = new HashSet<Player>();
		set.add(one);
		set.add(two);
		t.setPlayers(set);
		
		ses.save(t);
		ses.save(one);
		ses.save(two);
		tx.commit();
		ses.close();
	}

}
