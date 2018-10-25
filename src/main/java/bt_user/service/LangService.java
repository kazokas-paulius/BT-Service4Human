package bt_user.service;
//VYGANTAS
import java.util.List;

import bt_user.entity.Language;

public interface LangService {

	List<Language> findAllLanguages();

	List<Language> findAllByProvId(Integer provId);

	Language findByLangId(Integer langId);

	Language jobDone(Language lang);

	void saveLanguage(Language lang);

	void deleteLanguage(Integer langId);

//	List<Provider> findAllFreeProviders();

}