package bt_user.service;
//VYGANTAS
import java.time.LocalDate;
import java.util.List;

import bt_user.entity.Provider;

public interface ProvService {
	Provider getProviderById(Integer id);

	void saveProvider(Provider provider);

	void updateProvider(Integer id, Provider provider);

	void deleteProvider(Integer id);

	List<Provider> getProviders(String viewType);
	
//	List<Provider> findAllFree();

//	List<Provider> findByFreeBeforeOrderByFree(LocalDate today);

//	List<Provider> findAll();

	List<Provider> findAllProviders();

	List<Provider> findAllFreeProviders();
	
	
	
	
}