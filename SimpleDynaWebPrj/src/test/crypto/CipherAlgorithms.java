package test.crypto;
import java.security.Provider;
import java.security.Security;
import java.util.Set;

public class CipherAlgorithms {
	public static void main(String[] args) {
		Provider[] providers = Security.getProviders();
		//int providerCount = 0;

		System.out.println("Provider,Service,Algorithm");
		for (Provider provider : providers) {
			//providerCount++;
			Set<Provider.Service> services = provider.getServices();

			//int serviceCount = 0;
			for (Provider.Service service : services) {
				System.out.println(provider + ","
						+ service.getType() + "," + service.getAlgorithm());
			//	serviceCount++;
			}
			//System.out.println("Providers:" + providerCount + " Provider:"
			//		+ provider.getName() + " Total Service/Algorithm Count:"
			//		+ serviceCount);

			//System.out.println("-------------------------MAC--------------------------");
		}
	}
}