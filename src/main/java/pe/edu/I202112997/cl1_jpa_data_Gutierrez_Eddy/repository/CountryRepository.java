package pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.repository;

import pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.entity.Country;

import org.springframework.data.repository.CrudRepository;

    public interface CountryRepository extends CrudRepository<Country,String> {
        void deleteByCode(String code);
}
