package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Lion {
    @Value("1")
	private int id;
    @Value("Atul")
	private String name;
	
	@Autowired
	private Legs legs;

	@Override
	public String toString() {
		return "Lion [id=" + id + ", name=" + name + ", legs=" + legs + "]";
	}
	
}
