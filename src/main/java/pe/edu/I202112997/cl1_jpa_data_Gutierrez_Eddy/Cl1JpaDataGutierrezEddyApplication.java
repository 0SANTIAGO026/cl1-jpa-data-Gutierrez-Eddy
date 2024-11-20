package pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy;


import pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.I202112997.cl1_jpa_data_Gutierrez_Eddy.repository.CountryRepository;

import java.util.List;

@SpringBootApplication
public class Cl1JpaDataGutierrezEddyApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataGutierrezEddyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Buscar el país con código "ARG"
		/**
		countryRepository.findById("ARG")
				.ifPresentOrElse(
						country -> {
							// Si el país existe, imprimimos los lenguajes
							System.out.println("Lenguajes en Argentina:");
							List<countrylanguage> languages = country.getCountrylanguages();
							languages.forEach(language -> System.out.println(language.getLanguage()));
						},
						() -> {
							// Si el país "ARG" no se encuentra, buscamos "PER"
							System.out.println("Argentina no encontrada. Buscando Perú...");
							countryRepository.findById("PER")
									.ifPresentOrElse(
											country -> {
												// Si el país existe, imprimimos los lenguajes
												System.out.println("Lenguajes en Perú:");
												List<countrylanguage> languages = country.getCountrylanguages();
												languages.forEach(language -> System.out.println(language.getLanguage()));
											},
											() -> {
												// Si no se encuentra ninguno de los dos países
												System.out.println("No se encontraron los países solicitados.");
											});
						});*/

		// Eliminar países "COL" y "ARG" y sus ciudades y lenguajes asociados
		countryRepository.deleteByCode("COL");
		countryRepository.deleteByCode("ARG");

		System.out.println("Países 'COL' y 'ARG' y sus entidades relacionadas han sido eliminados.");
	}
}
